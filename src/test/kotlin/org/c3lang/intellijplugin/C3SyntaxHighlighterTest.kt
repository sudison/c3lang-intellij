package org.c3lang.intellijplugin

import org.c3lang.intellijplugin.parser.psi.C3Types
import org.junit.Test
import kotlin.reflect.full.declaredMembers

internal class C3SyntaxHighlighterTest {
    @Test
    fun testReflection() {
        val members = C3Types::class.declaredMembers.filter { it.name.contains("KW") }.map { it.call() }
        //val keywords = members.filter { it.name.contains("KW") }
        println(members)
    }
}