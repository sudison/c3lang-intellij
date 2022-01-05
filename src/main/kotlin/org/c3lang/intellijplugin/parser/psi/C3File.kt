package org.c3lang.intellijplugin.parser.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider
import org.c3lang.intellijplugin.C3FileType
import org.c3lang.intellijplugin.C3Lang

class C3File(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, C3Lang) {
    override fun getFileType() = C3FileType
}