package org.c3lang.intellijplugin.reference

import com.intellij.codeInsight.lookup.AutoCompletionPolicy
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiPolyVariantReferenceBase
import com.intellij.psi.ResolveResult
import org.c3lang.intellijplugin.parser.psi.C3TokenType
import org.c3lang.intellijplugin.parser.psi.C3Types

class C3TypeReference(element: PsiElement, private val id: PsiElement) :
    PsiPolyVariantReferenceBase<PsiElement>(element) {
    companion object {
        private val buildInTypes =
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

    override fun getVariants(): Array<Any> {
        return buildInTypes.toTypedArray()
    }

    override fun calculateDefaultRangeInElement(): TextRange {
        return TextRange.from(id.startOffsetInParent, id.textLength)
    }

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        TODO("Not yet implemented")
    }
}