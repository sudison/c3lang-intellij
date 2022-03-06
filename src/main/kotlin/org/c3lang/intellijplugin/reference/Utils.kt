package org.c3lang.intellijplugin.reference

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.util.PsiTreeUtil
import org.c3lang.intellijplugin.parser.psi.*

fun PsiFile.topLevelTypes(): List<PsiNameIdentifierOwner> {
    val types = mutableListOf<PsiNameIdentifierOwner>()

    PsiTreeUtil.collectElementsOfType(this, C3StructDeclaration::class.java).forEach {
        types.add(it)
    }
    PsiTreeUtil.collectElementsOfType(this, C3FuncDeclaration::class.java).forEach {
        types.add(it)
    }
    return types
}

fun psiTreeWalkupInsideBlock(element: PsiElement, consumer: (PsiNameIdentifierOwner) -> Boolean) {
    var statement = PsiTreeUtil.findFirstParent(element) { it is C3Statement }
    while (statement != null) {
        var e: PsiElement? = statement.prevSibling
        while (e != null) {
            if (C3Types.STATEMENT == e.node.elementType) {
                val declarationStatement = e.firstChild
                if (declarationStatement is C3DeclarationStatement) {
                    val declaration = declarationStatement.declaration
                    if (consumer(declaration)) return
                }
            }
            e = e.prevSibling
        }

        val block = PsiTreeUtil.findFirstParent(statement) { it is C3CompoundStatement }
        statement = PsiTreeUtil.findFirstParent(block) { it is C3Statement }
    }
}