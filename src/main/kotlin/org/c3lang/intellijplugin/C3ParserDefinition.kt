package org.c3lang.intellijplugin

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.c3lang.intellijplugin.lexer.C3LexerAdapter
import org.c3lang.intellijplugin.parser.C3Parser
import org.c3lang.intellijplugin.parser.psi.C3ElementType
import org.c3lang.intellijplugin.parser.psi.C3File
import org.c3lang.intellijplugin.parser.psi.C3Types


class C3ParserDefinition : ParserDefinition {
    companion object {
        private val StringLiterals = TokenSet.create(C3Types.STRING_LITERAL)
        private val Comments = TokenSet.create(C3ElementType.END_OF_LINE_COMMENTS)
        private val FILE = IFileElementType(C3Lang)
    }

    override fun createParser(project: Project?) = C3Parser()
    override fun createLexer(project: Project?) = C3LexerAdapter()
    override fun createFile(viewProvider: FileViewProvider) = C3File(viewProvider)
    override fun createElement(node: ASTNode?) = C3Types.Factory.createElement(node)
    override fun getStringLiteralElements() = StringLiterals
    override fun getCommentTokens() = Comments
    override fun getFileNodeType() = FILE
}