package org.c3lang.intellijplugin.reference

import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.*
import com.intellij.util.ProcessingContext
import org.c3lang.intellijplugin.parser.psi.C3Types

class C3ReferenceContributor : PsiReferenceContributor() {
    override fun registerReferenceProviders(registrar: PsiReferenceRegistrar) {
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(C3Types.IDENT), C3ReferenceProvider())
    }
}

class C3ReferenceProvider : PsiReferenceProvider() {
    override fun getReferencesByElement(element: PsiElement, context: ProcessingContext): Array<PsiReference> {
        return PsiReference.EMPTY_ARRAY
    }
}

