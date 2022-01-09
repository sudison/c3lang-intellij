package org.c3lang.intellijplugin.runner

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class C3CompilerOutputFilterTest {
    @Test
    fun testRegx() {
        val errMsg = "(hello.c3:1) Error: A type name was expected here"
        val lineRegx = "^\\((.*.c3):(\\d*)\\).*".toRegex()
        val m = lineRegx.matchEntire(errMsg)
        println("")
    }
}