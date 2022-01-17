package org.c3lang.intellijplugin.completion

import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixture4TestCase
import org.c3lang.intellijplugin.C3FileType
import org.junit.Test

class C3CompletionContributorTest : LightPlatformCodeInsightFixture4TestCase() {

    private fun topLevelKeywordCompletion(typeStr: String, completion: String) {
        myFixture.configureByText(C3FileType, "")
        myFixture.type(typeStr)

        val l = myFixture.completeBasic()
        assertTrue(l.size == 1)
        assertEquals(l[0].lookupString, "$completion ")
    }

    @Test
    fun testFn() {
        listOf(Pair("f", "fn"), Pair("s", "struct"), Pair("en", "enum"), Pair("ex", "extern"), Pair("c", "const")).forEach {
            topLevelKeywordCompletion(it.first, it.second)
        }
    }
}