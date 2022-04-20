package org.c3lang.intellijplugin.completion

import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.AutoCompletionPolicy
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns.psiElement
import com.intellij.util.ProcessingContext
import org.c3lang.intellijplugin.parser.psi.*
import org.c3lang.intellijplugin.reference.createLookup
import org.c3lang.intellijplugin.reference.psiTreeWalkupInsideBlock
import org.c3lang.intellijplugin.reference.topLevelTypes

class C3CompletionProvider(private val les: List<LookupElement>) : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
            parameters: CompletionParameters,
            context: ProcessingContext,
            result: CompletionResultSet
    ) {
        val p = result.prefixMatcher.prefix
        val a = les.filter { it.lookupString.startsWith(p) }
        a.forEach(result::addElement)
    }
}

class C3TypeCompletionProvider() : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
            parameters: CompletionParameters,
            context: ProcessingContext,
            result: CompletionResultSet
    ) {
        val p = result.prefixMatcher.prefix
        parameters.position.containingFile?.topLevelTypes()?.forEach {
            if (it.nameIdentifier?.text?.startsWith(p) == true) {
                val t = createLookup(it.nameIdentifier?.text)
                if (t != null) {
                    result.addElement(t)
                }
            }
        }

        val f = parameters.position.containingFile.viewProvider.virtualFile
        val modules = parameters.position.containingFile.project.allModules(f)
        modules.flatMap { it.symbols }.forEach {
            if (it.nameIdentifier?.text?.startsWith(p) == true) {
                val t = createLookup(it.nameIdentifier?.text)
                if (t != null) {
                    result.addElement(t)
                }
            }
        }


    }
}

class C3PathExpressionCompletionProvider() : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
            parameters: CompletionParameters,
            context: ProcessingContext,
            result: CompletionResultSet
    ) {
        val p = result.prefixMatcher.prefix
        if (p != "" && p.first().isLowerCase()) {
            C3CompletionContributor.buildInTypes.filter { it.lookupString.startsWith(p) }.forEach(result::addElement)

            psiTreeWalkupInsideBlock(parameters.position) {
                if (it.nameIdentifier?.text?.startsWith(p) == true) {
                    val t = createLookup(it.nameIdentifier?.text)
                    if (t != null) {
                        result.addElement(t)
                    }
                }
                false
            }
        }

        parameters.position.containingFile?.topLevelTypes()?.forEach {
            if (it.nameIdentifier?.text?.startsWith(p) == true) {
                val t = createLookup(it.nameIdentifier?.text)
                if (t != null) {
                    result.addElement(t)
                }
            }
        }
        val f = parameters.position.containingFile.viewProvider.virtualFile
        val modules = parameters.position.containingFile.project.allModules(f)
        modules.flatMap { it.symbols }.forEach {
            if (it.nameIdentifier?.text?.startsWith(p) == true) {
                val t = createLookup(it.nameIdentifier?.text)
                if (t != null) {
                    result.addElement(t)
                }
            }
        }

        modules.map { it.name }.forEach {
            if (it.startsWith(p)) {
                val t = createLookup(it)
                if (t != null) {
                    result.addElement(t)
                }
            }
        }
    }
}

class C3NestedPathExpressionCompletionProvider() : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
            parameters: CompletionParameters,
            context: ProcessingContext,
            result: CompletionResultSet
    ) {
        val p = result.prefixMatcher.prefix
        var pathExp = parameters.position.parent
        if (pathExp is C3IdentSymbol) {
            pathExp = pathExp?.parent?.parent
        }
        if (pathExp is C3PathExpression) {
            val s = pathExp.firstChild as C3Symbol
            val r = s.reference
            val rr = r?.resolve() as C3Declaration
            val bt = rr.failableType.type.baseType.firstChild as C3Symbol
            val btr = bt.reference?.resolve()
            if (btr is C3StructDeclaration) {
                val smembers = btr.members()
                if (p == "") {
                    smembers.forEach {
                        createLookup(it.name)?.let { it1 -> result.addElement(it1) }
                    }
                } else {
                    createLookup(btr.members().find { it.name.startsWith(p) }?.name)?.let { result.addElement(it) }
                }
            }
        }
    }
}

class C3ScopePathExpressionCompletionProvider() : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
        parameters: CompletionParameters,
        context: ProcessingContext,
        result: CompletionResultSet
    ) {
        val p = result.prefixMatcher.prefix
        var pathExp = parameters.position.parent
        if (pathExp is C3IdentSymbol) {
            pathExp = pathExp?.parent?.parent
        }
        if (pathExp is C3PathExpression) {
            val f = parameters.position.containingFile.viewProvider.virtualFile
            val modules = parameters.position.containingFile.project.allModules(f)

            val s = pathExp.firstChild as C3Symbol
            val m = modules.find { it.name == s.text }
            if (p == "") {
                m?.symbols?.forEach {
                    createLookup(it.nameIdentifier?.text)?.let { it1 -> result.addElement(it1) }
                }
            } else {
                m?.symbols?.forEach {
                    if (it.nameIdentifier?.text?.startsWith(p) == true) {
                        val t = createLookup(it.nameIdentifier?.text)
                        if (t != null) {
                            result.addElement(t)
                        }
                    }
                }
            }
        }
    }
}

class C3ImportPathCompletionProvider() : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
            parameters: CompletionParameters,
            context: ProcessingContext,
            result: CompletionResultSet
    ) {
        val f = parameters.position.containingFile.viewProvider.virtualFile

        val modules = parameters.position.project.allModules(f)
        modules.forEach {
            createLookup(it.name)?.let { it1 -> result.addElement(it1) }
        }
    }
}


class C3CompletionContributor : CompletionContributor() {
    companion object {
        private val topKeyWords = listOf(
                C3Types.FN_KW,
                C3Types.STRUCT_KW,
                C3Types.IMPORT_KW,
                C3Types.ENUM_KW,
                C3Types.EXTERN_KW,
                C3Types.CONST_KW
        ).map {
            val t = it as C3TokenType
            LookupElementBuilder
                    .create(t.realName())
                    .withPresentableText(t.realName())
                    .withAutoCompletionPolicy(AutoCompletionPolicy.NEVER_AUTOCOMPLETE)
        }

        val buildInTypes =
                listOf(
                        C3Types.INT_KW, C3Types.BYTE_KW, C3Types.SHORT_KW, C3Types.CHAR_KW,
                        C3Types.USHORT_KW, C3Types.UINT_KW, C3Types.LONG_KW, C3Types.ULONG_KW,
                        C3Types.HALF_KW, C3Types.FLOAT_KW, C3Types.DOUBLE_KW, C3Types.QUAD_KW,
                        C3Types.VOID_KW
                )
                        .map {
                            val t = it as C3TokenType
                            LookupElementBuilder
                                    .create(t.realName())
                                    .withPresentableText(t.realName())
                                    .withAutoCompletionPolicy(AutoCompletionPolicy.NEVER_AUTOCOMPLETE)
                        }

    }

    init {
        // top level keyword
        extend(
                CompletionType.BASIC,
                psiElement(C3Types.IDENT).withParent(C3File::class.java).with(OnStatementBeginning()),
                C3CompletionProvider(topKeyWords)
        )
        extend(
                CompletionType.BASIC,
                psiElement(C3Types.IDENT).withSuperParent(
                        2,
                        psiElement(C3Types.BASE_TYPE)
                ),
                C3CompletionProvider(buildInTypes)
        )
        extend(
                CompletionType.BASIC,
                psiElement(C3Types.TYPE_IDENT).withSuperParent(
                        2,
                        psiElement(C3Types.BASE_TYPE)
                ),
                C3TypeCompletionProvider()
        )
        extend(
                CompletionType.BASIC,
                psiElement(C3Types.IDENT).withSuperParent(
                        3,
                        psiElement(C3Types.PATH_EXPRESSION)
                ).withSuperParent(2, psiElement(C3Types.IDENT_EXPRESSION).noPrevSibling()),
                C3PathExpressionCompletionProvider()
        )
        extend(
                CompletionType.BASIC,
                psiElement(C3Types.IDENT).withSuperParent(
                        3,
                        psiElement(C3Types.PATH_EXPRESSION)
                ).withSuperParent(2, psiElement(C3Types.IDENT_EXPRESSION).withPrevSiblingSkipping(psiElement().whitespace(), psiElement(C3Types.DOT))),
                C3NestedPathExpressionCompletionProvider()
        )
        extend(
            CompletionType.BASIC,
            psiElement(C3Types.IDENT).withSuperParent(
                3,
                psiElement(C3Types.PATH_EXPRESSION)
            ).withSuperParent(2, psiElement(C3Types.IDENT_EXPRESSION).withPrevSiblingSkipping(psiElement().whitespace(), psiElement(C3Types.SCOPE))),
            C3ScopePathExpressionCompletionProvider()
        )
        extend(
            CompletionType.BASIC,
            psiElement(C3Types.INTELLIJ_RULEZ).withSuperParent(
                1,
                psiElement(C3Types.PATH_EXPRESSION)
            ).withPrevSiblingSkipping(psiElement().whitespace(), psiElement(C3Types.SCOPE)),
            C3ScopePathExpressionCompletionProvider()
        )
        extend(
                CompletionType.BASIC,
                psiElement(C3Types.INTELLIJ_RULEZ).withSuperParent(
                        1,
                        psiElement(C3Types.PATH_EXPRESSION)
                ).withPrevSiblingSkipping(psiElement().whitespace(), psiElement(C3Types.DOT)),
                C3NestedPathExpressionCompletionProvider()
        )

        extend(
                CompletionType.BASIC,
                psiElement(C3Types.IDENT).withSuperParent(
                        2,
                        psiElement(C3Types.IMPORT_PATH).withPrevSiblingSkipping(psiElement().whitespace(), psiElement(C3Types.IMPORT_KW))
                ),
                C3ImportPathCompletionProvider()
        )
    }
}