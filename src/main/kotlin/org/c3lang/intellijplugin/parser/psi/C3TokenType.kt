package org.c3lang.intellijplugin.parser.psi

import com.intellij.psi.tree.IElementType
import org.c3lang.intellijplugin.C3Lang

open class C3TokenType(debugName: String) : IElementType(debugName, C3Lang) {
    fun realName(): String {
        return if (debugName.endsWith("KW")) {
            debugName.replace("_KW", "").lowercase()
        } else {
            debugName
        }
    }
}
