package org.c3lang.intellijplugin.reference

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiReference
import org.c3lang.intellijplugin.parser.psi.C3BaseType
import org.c3lang.intellijplugin.parser.psi.C3IdentExpression

abstract class SymbolMixin(node: ASTNode) : ASTWrapperPsiElement(node) {
    override fun getReference(): PsiReference? {
        return when (parent) {
            is C3BaseType -> {
                C3TypeReference(this, node.firstChildNode?.psi!!)
            }
            is C3IdentExpression -> {
                C3TypeReference(this, node.firstChildNode?.psi!!)
            }
            else -> {
                null
            }
        }
    }
}