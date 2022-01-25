package org.c3lang.intellijplugin.reference

import com.intellij.psi.PsiFile
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.util.PsiTreeUtil
import org.c3lang.intellijplugin.parser.psi.C3StructDeclaration

fun PsiFile.topLevelTypes(): List<PsiNameIdentifierOwner> {
    val types = mutableListOf<PsiNameIdentifierOwner>()

    PsiTreeUtil.collectElementsOfType(this, C3StructDeclaration::class.java).forEach {
        types.add(it)
    }
    return types
}