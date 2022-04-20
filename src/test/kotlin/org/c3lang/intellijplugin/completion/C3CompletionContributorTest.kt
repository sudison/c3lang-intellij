package org.c3lang.intellijplugin.completion

import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixture4TestCase
import junit.framework.TestCase
import org.c3lang.intellijplugin.C3FileType
import org.junit.Test

class C3CompletionContributorTest : LightPlatformCodeInsightFixture4TestCase() {

    private fun keywordCompletion(typeStr: String, completion: String) {
        myFixture.configureByText(C3FileType, "")
        myFixture.type(typeStr)
        val l = myFixture.completeBasic()
        assertTrue(l.size == 1)
        assertEquals(l[0].lookupString, "$completion")
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

    @Test
    fun testPathExpression() {
        listOf(
                Pair("fn void main(){i", "int"),
                Pair("fn void main(){int ab;a", "ab"),
                Pair("fn void xoo() {} fn void main(){x", "xoo"),
                Pair("struct Sa {int i;} fn void main(){Sa a; int i = a.", "i"),
                Pair("struct Sa {int i; int bb;} fn void main(){Sa a; int i = a.b", "bb"),
        ).forEach {
            keywordCompletion(it.first, it.second)
        }
    }

    @Test
    fun testStructMember() {
        listOf(
                Pair("struct Ab{i", "int"),
        ).forEach {
            keywordCompletion(it.first, it.second)
        }
    }

    @Test
    fun testIfStatement() {
        listOf(
                Pair("fn void f() { int ab;if (a", "ab"),
        ).forEach {
            keywordCompletion(it.first, it.second)
        }
    }

    @Test
    fun testSwitchStatement() {
        listOf(
                Pair("fn void f() { int ab;switch (a", "ab"),
        ).forEach {
            keywordCompletion(it.first, it.second)
        }
    }

    @Test
    fun testForStatement() {
        listOf(
                Pair("fn void f() { for(i", "int"),
                Pair("fn void f() { for(s", "short"),
                Pair("fn void f() { for(int abc = 0; a", "abc"),
                Pair("fn void f() { for(int abc = 0; abc > 0;) {a", "abc"),
                Pair("fn void f() { int abc = 0;for(int i = 0; i > 0;) {a", "abc"),
                Pair("fn void f() { for(int abc = 0; abc > 0; a", "abc"),

                ).forEach {
            keywordCompletion(it.first, it.second)
        }
    }

    @Test
    fun testModuleImport() {
        myFixture.addFileToProject("modulea/a.c3", "module ab;")
        myFixture.configureByText(C3FileType, "")
        myFixture.type("import a")
        val l = myFixture.completeBasic()
        TestCase.assertTrue(l.size == 1)
        assertEquals(l[0].lookupString, "ab")
    }

    @Test
    fun testImportModuleFunction() {
        myFixture.addFileToProject("modulea/a.c3", "module ab; fn void xoo() {}")
        myFixture.configureByText(C3FileType, "")
        myFixture.type("fn void m() {x")
        val l = myFixture.completeBasic()
        TestCase.assertTrue(l.size == 1)
        assertEquals(l[0].lookupString, "xoo")
    }

    @Test
    fun testImportModuleStruct() {
        myFixture.addFileToProject("modulea/a.c3", "module ab; struct Sa{int a;}")
        myFixture.configureByText(C3FileType, "")
        myFixture.type("fn void m() {S")
        val l = myFixture.completeBasic()
        TestCase.assertTrue(l.size == 1)
        assertEquals(l[0].lookupString, "Sa")
    }
}