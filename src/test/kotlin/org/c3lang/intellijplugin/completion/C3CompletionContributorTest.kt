package org.c3lang.intellijplugin.completion

import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixture4TestCase
import org.c3lang.intellijplugin.C3FileType
import org.c3lang.intellijplugin.parser.psi.C3TokenType
import org.c3lang.intellijplugin.parser.psi.C3Types
import org.junit.Test

class C3CompletionContributorTest: LightPlatformCodeInsightFixture4TestCase() {
    @Test
    fun testFn() {
        myFixture.configureByText(C3FileType, "")
        myFixture.type("f")

        val l = myFixture.completeBasic()
        assertTrue(l.size == 1)
        assertEquals(l[0].lookupString, "${(C3Types.FN_KW as C3TokenType).realName()} ")
    }

    @Test
    fun testStruct() {
        myFixture.configureByText(C3FileType, "")
        myFixture.type("s")

        val l = myFixture.completeBasic()
        assertTrue(l.size == 1)
        assertEquals(l[0].lookupString, "${(C3Types.STRUCT_KW as C3TokenType).realName()} ")
    }
}