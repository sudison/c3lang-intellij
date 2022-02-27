package org.c3lang.intellijplugin.completion

import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.AutoCompletionPolicy
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns.psiElement
import com.intellij.util.ProcessingContext
import org.c3lang.intellijplugin.parser.psi.C3File
import org.c3lang.intellijplugin.parser.psi.C3TokenType
import org.c3lang.intellijplugin.parser.psi.C3Types
import org.c3lang.intellijplugin.reference.createLookup
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
        val a = parameters.position.containingFile?.topLevelTypes()?.find {
            it.nameIdentifier?.text?.startsWith(p) ?: false
        } ?: return
        val t = createLookup(a.nameIdentifier?.text) ?: return
        result.addElement(t)

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
                .create("${t.realName()} ")
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
                        .create("${t.realName()} ")
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
    }
}