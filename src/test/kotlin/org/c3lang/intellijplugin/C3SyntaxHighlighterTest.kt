package org.c3lang.intellijplugin

import org.c3lang.intellijplugin.parser.psi.C3Types
import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.declaredMembers
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.reflect

internal class C3SyntaxHighlighterTest {
    @Test
    fun testReflection() {
        val members = C3Types::class.declaredMembers.filter { it.name.contains("KW") }.map { it.call() }
        //val keywords = members.filter { it.name.contains("KW") }
        println(members)
    }
}