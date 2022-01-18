package org.c3lang.intellijplugin.completion

import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixture4TestCase
import org.c3lang.intellijplugin.C3FileType
import org.junit.Test

class C3CompletionContributorTest : LightPlatformCodeInsightFixture4TestCase() {

    private fun keywordCompletion(typeStr: String, completion: String) {
        myFixture.configureByText(C3FileType, "")
        myFixture.type(typeStr)

        val l = myFixture.completeBasic()
        assertTrue(l.size == 1)
        assertEquals(l[0].lookupString, "$completion ")
    }

    @Test
    fun testTopLevelKeywordsCompletion() {
        listOf(
            Pair("f", "fn"),
            Pair("s", "struct"),
            Pair("en", "enum"),
            Pair("ex", "extern"),
            Pair("c", "const")
        ).forEach {
            keywordCompletion(it.first, it.second)
        }
    }

    @Test
    fun testFunctionReturnType() {
        listOf(
            Pair("fn i", "int"), Pair("fn c", "char"),
            Pair("fn b", "byte"), Pair("fn s", "short"), Pair("fn l", "long"),
            Pair("fn h", "half"), Pair("fn f", "float"), Pair("fn d", "double"), Pair("fn q", "quad"),
            Pair("fn v", "void")
        ).forEach {
            keywordCompletion(it.first, it.second)
        }
    }

    @Test
    fun testFunParameterType() {
        listOf(
            Pair("fn void main(i", "int"),
            Pair("fn void main(int i, i", "int"),
            Pair("fn void main(int i, int i, i", "int")
        ).forEach {
            keywordCompletion(it.first, it.second)
        }
    }
}