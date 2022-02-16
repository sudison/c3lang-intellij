package org.c3lang.intellijplugin.reference

import org.c3lang.intellijplugin.parser.psi.C3IdentSymbol
import org.c3lang.intellijplugin.parser.psi.Declaration
import org.junit.Test


class ReferenceTest : ReferenceTestBase() {
    @Test
    fun testLocalVariableRef() {
        val code = """
        fn void foo() {
            int a = 92;
              //X
            a;
          //^
        }
    """
        checkReference(C3IdentSymbol::class.java, Declaration::class.java, code)
    }
}