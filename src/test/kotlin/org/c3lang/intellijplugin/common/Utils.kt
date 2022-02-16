package org.c3lang.intellijplugin.common

import com.intellij.injected.editor.VirtualFileWindow
import com.intellij.lang.injection.InjectedLanguageManager
import com.intellij.openapi.editor.Document
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.util.PsiTreeUtil
import kotlin.math.min

fun <T : PsiElement> findElementsWithDataAndOffsetInEditorInFile(
    file: PsiFile,
    doc: Document,
    psiClass: Class<T>,
    marker: String
): List<Triple<T, String, Int>> {
    val commentPrefix = "//"
    val caretMarker = "$commentPrefix$marker"
    val text = file.text
    val result = mutableListOf<Triple<T, String, Int>>()
    var markerOffset = -caretMarker.length
    while (true) {
        markerOffset = text.indexOf(caretMarker, markerOffset + caretMarker.length)
        if (markerOffset == -1) break
        val data = text.drop(markerOffset).removePrefix(caretMarker).takeWhile { it != '\n' }.trim()
        val markerEndOffset = markerOffset + caretMarker.length - 1
        val markerLine = doc.getLineNumber(markerEndOffset)
        val makerColumn = markerEndOffset - doc.getLineStartOffset(markerLine)
        val elementOffset =
            min(doc.getLineStartOffset(markerLine - 1) + makerColumn, doc.getLineEndOffset(markerLine - 1))
        val elementAtMarker = file.findElementAt(elementOffset)!!

        val element = PsiTreeUtil.getParentOfType(elementAtMarker, psiClass, false)
        if (element != null) {
            result.add(Triple(element, data, elementOffset))
        } else {
            val injectionElement = InjectedLanguageManager.getInstance(file.project)
                .findInjectedElementAt(file, elementOffset)
                ?.let { PsiTreeUtil.getParentOfType(it, psiClass, false) }
                ?: error("No ${psiClass.simpleName} at ${elementAtMarker.text}")
            val injectionOffset = (injectionElement.containingFile.virtualFile as VirtualFileWindow)
                .documentWindow.hostToInjected(elementOffset)
            result.add(Triple(injectionElement, data, injectionOffset))
        }
    }
    return result
}