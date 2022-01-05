package org.c3lang.intellijplugin

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.tree.IElementType
import org.c3lang.intellijplugin.lexer.C3LexerAdapter
import org.c3lang.intellijplugin.parser.psi.C3Types

object C3SyntaxHighlighter : SyntaxHighlighterBase() {
    private val keywords = listOf(C3Types.FUNC_KW)
    private val keywordsAttrs =
        arrayOf(TextAttributesKey.createTextAttributesKey("C3_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD))

    override fun getHighlightingLexer(): Lexer {
        return C3LexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return when (tokenType) {
            in keywords -> keywordsAttrs
            else -> emptyArray()
        }
    }
}

class C3SyntaxHighlighterFactory : SyntaxHighlighterFactory() {
    override fun getSyntaxHighlighter(project: Project?, virtualFile: VirtualFile?): SyntaxHighlighter {
        return C3SyntaxHighlighter
    }
}