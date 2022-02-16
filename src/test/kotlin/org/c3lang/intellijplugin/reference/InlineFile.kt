package org.c3lang.intellijplugin.reference

import com.intellij.testFramework.fixtures.CodeInsightTestFixture

fun replaceCaretMarker(text: String): String = text.replace("/*caret*/", "<caret>")

class InlineFile(fixture: CodeInsightTestFixture, private val code: String, val name: String) {
    private val hasCaretMarker = "/*caret*/" in code || "<caret>" in code

    init {
        fixture.configureByText(name, replaceCaretMarker(code))
    }

    fun withCaret() {
        check(hasCaretMarker) {
            "Please, add `/*caret*/` or `<caret>` marker to\n$code"
        }
    }
}