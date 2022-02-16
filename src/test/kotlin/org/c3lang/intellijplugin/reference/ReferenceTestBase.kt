package org.c3lang.intellijplugin.reference

import com.intellij.openapi.editor.Document
import com.intellij.psi.PsiDocumentManager
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiReference
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import org.c3lang.intellijplugin.common.findElementsWithDataAndOffsetInEditorInFile

val PsiFile.document: Document?
    get() = PsiDocumentManager.getInstance(project).getDocument(this)
val PsiElement.startOffset: Int
    get() = textRange.startOffset

fun PsiElement.findReference(offset: Int): PsiReference? = findReferenceAt(offset - startOffset)
fun PsiElement.checkedResolve(offset: Int, errorMessagePrefix: String = ""): PsiElement {
    val reference = findReference(offset) ?: error("element doesn't have reference")
    val resolved = reference.resolve() ?: run {
        val multiResolve = (reference as? C3TypeReference)?.multiResolve(true).orEmpty()
        check(multiResolve.size != 1)
        if (multiResolve.isEmpty()) {
            error("${errorMessagePrefix}Failed to resolve $text")
        } else {
            error("${errorMessagePrefix}Failed to resolve $text, multiple variants:\n${multiResolve.joinToString()}")
        }
    }

    check(reference.isReferenceTo(resolved)) {
        "Incorrect `isReferenceTo` implementation in `${reference.javaClass.name}`"
    }

    return resolved
}

open class ReferenceTestBase : BasePlatformTestCase() {
    fun <T : PsiElement> findElementsWithDataAndOffsetInEditor(
        psiClass: Class<T>,
        marker: String
    ): List<Triple<T, String, Int>> {
        return findElementsWithDataAndOffsetInEditorInFile(
            myFixture.file,
            myFixture.file.document!!,
            psiClass,
            marker
        )
    }

    fun <T : PsiElement> findElementInEditor(psiClass: Class<T>, marker: String): T {
        val (element, data) = findElementWithDataAndOffsetInEditor(psiClass, marker)
        check(data.isEmpty()) { "Did not expect marker data" }
        return element
    }

    fun <T : PsiElement> findElementWithDataAndOffsetInEditor(
        psiClass: Class<T>,
        marker: String
    ): Triple<T, String, Int> {
        val elementsWithDataAndOffset = findElementsWithDataAndOffsetInEditor(psiClass, marker)
        check(elementsWithDataAndOffset.isNotEmpty()) { "No `$marker` marker:\n${myFixture.file.text}" }
        check(elementsWithDataAndOffset.size <= 1) { "More than one `$marker` marker:\n${myFixture.file.text}" }
        return elementsWithDataAndOffset.first()
    }

    fun <R : PsiElement, T : PsiElement> checkReference(
        referenceClass: Class<R>,
        targetPsiClass: Class<T>,
        code: String,
        fileName: String = "main.c3"
    ) {
        InlineFile(myFixture, code, fileName)
        val (refElement, data, offset) = findElementsWithDataAndOffsetInEditorInFile(
            myFixture.file,
            myFixture.file.document!!, referenceClass, "^"
        ).first()
        val resolved = refElement.checkedResolve(offset)

        val target = findElementInEditor(targetPsiClass, "X")

        check(resolved == target) {
            "$refElement `${refElement.text}` should resolve to $target (${target.text}), was $resolved (${resolved.text}) instead"
        }
    }
}