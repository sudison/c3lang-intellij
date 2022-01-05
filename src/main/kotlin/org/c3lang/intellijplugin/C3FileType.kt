package org.c3lang.intellijplugin

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object C3FileType : LanguageFileType(C3Lang) {
    override fun getName(): String {
        return "C3"
    }

    override fun getDescription(): String {
        return "C3 Language"
    }

    override fun getDefaultExtension(): String {
        return "c3"
    }

    override fun getIcon(): Icon? {
        return null
    }
}