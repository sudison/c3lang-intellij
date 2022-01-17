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

class C3CompletionProvider(private val les: List<LookupElement>) : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
        parameters: CompletionParameters,
        context: ProcessingContext,
        result: CompletionResultSet
    ) {
        val p = result.prefixMatcher.prefix
        les.filter { it.lookupString.startsWith(p) }.forEach(result::addElement)
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
    }

    init {
        extend(
            CompletionType.BASIC,
            psiElement(C3Types.IDENT).withParent(C3File::class.java),
            C3CompletionProvider(topKeyWords)
        )
    }
}