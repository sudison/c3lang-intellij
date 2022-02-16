package org.c3lang.intellijplugin.psi

import com.intellij.testFramework.ParsingTestCase
import org.c3lang.intellijplugin.C3FileType
import org.c3lang.intellijplugin.C3ParserDefinition
import org.junit.Test

class C3ParserTests : ParsingTestCase("", C3FileType.defaultExtension, C3ParserDefinition()) {
    override fun getTestDataPath() = "src/testdata/parsing"

    override fun skipSpaces() = true

    private fun printTree() {
        println(name)

        myFile = createPsiFile(
            testName, "fn Ss main() {Bb i; i;}"
        )
        ensureParsed(myFile)
        println(toParseTreeText(myFile, skipSpaces(), includeRanges()))
    }

    @Test
    fun testComments() {
        printTree()
    }
}