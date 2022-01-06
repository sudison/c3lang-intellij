package org.c3lang.intellijplugin.parser.psi

import com.intellij.psi.tree.IElementType
import org.c3lang.intellijplugin.C3Lang

open class C3ElementType(debugName: String) : IElementType(debugName, C3Lang) {
    companion object {
        val END_OF_LINE_COMMENTS = C3ElementType("END_OF_LINE_COMMENTS")
    }
}