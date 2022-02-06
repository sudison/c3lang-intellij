package org.c3lang.intellijplugin.reference

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import org.c3lang.intellijplugin.parser.psi.C3Types

abstract class C3StructMixin(node: ASTNode) : ASTWrapperPsiElement(node), PsiNameIdentifierOwner {
    override fun getNameIdentifier(): PsiElement? {
        val childNode = node.findChildByType(C3Types.TYPE_IDENT)
        return childNode?.psi
    }

    override fun getTextOffset(): Int {
        val offset = nameIdentifier?.textOffset

        return offset ?: super.getTextOffset()
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getName(): String? = nameIdentifier?.text
}