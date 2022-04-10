package org.c3lang.intellijplugin.completion

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.patterns.ElementPattern
import com.intellij.patterns.ObjectPattern
import com.intellij.patterns.PatternCondition
import com.intellij.patterns.PlatformPatterns.psiElement
import com.intellij.patterns.PsiElementPattern
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiWhiteSpace
import com.intellij.psi.util.elementType
import com.intellij.psi.util.prevLeafs
import com.intellij.util.ProcessingContext
import org.c3lang.intellijplugin.parser.psi.C3StructDeclaration
import org.c3lang.intellijplugin.parser.psi.C3Type
import org.c3lang.intellijplugin.parser.psi.C3Types

fun <T, Self : ObjectPattern<T, Self>> ObjectPattern<T, Self>.with(name: String, cond: (T) -> Boolean): Self =
        with(object : PatternCondition<T>(name) {
            override fun accepts(t: T, context: ProcessingContext?): Boolean = cond(t)
        })

fun <T : PsiElement, Self : PsiElementPattern<T, Self>> PsiElementPattern<T, Self>.withPrevSiblingSkipping(
        skip: ElementPattern<out T>,
        pattern: ElementPattern<out T>
): Self = with("withPrevSiblingSkipping") { e ->
    val sibling = e.leftSiblings.dropWhile { skip.accepts(it) }
            .firstOrNull() ?: return@with false
    pattern.accepts(sibling)
}

fun <T : PsiElement, Self : PsiElementPattern<T, Self>> PsiElementPattern<T, Self>.noPrevSibling(): Self = with("noPrevSibling") { e ->
    e.leftSiblings.count() == 0
}

fun <T : PsiElement, Self : PsiElementPattern<T, Self>> PsiElementPattern<T, Self>.withPrevSiblingsContainSkipping(
        skip: ElementPattern<out T>,
        pattern: ElementPattern<out T>
): Self = with("withPrevSiblingsContainSkipping") { e ->
    e.leftSiblings.dropWhile { skip.accepts(it) }.filter { pattern.accepts(it) }
            .toList().isNotEmpty()
}

val PsiElement.leftSiblings: Sequence<PsiElement>
    get() = generateSequence(this.prevSibling) { it.prevSibling }


class OnStatementBeginning() : PatternCondition<PsiElement>("on statement beginning") {
    override fun accepts(t: PsiElement, context: ProcessingContext?): Boolean {
        val prev = t.prevLeafs.filter { it !is PsiWhiteSpace }.firstOrNull()
        return prev == null || prev.elementType == C3Types.EOS || prev.elementType == C3Types.RBR
    }
}

class OnFnReturnType() : PatternCondition<PsiElement>("on fn return type") {
    override fun accepts(t: PsiElement, context: ProcessingContext?): Boolean {
        if (t.parent.elementType == C3Types.FUNC_NAME) {
            val p = t.parent
            val sibling =
                    p.leftSiblings.dropWhile { psiElement().whitespace().accepts(it) }.firstOrNull() ?: return false
            return sibling.elementType == C3Types.FN_KW
        }
        return false
    }
}

data class Type(val name: String, val t: C3Type)

fun C3StructDeclaration.members(): List<Type> {
    return structBody?.structDeclarationList?.structMemberDeclarationList?.flatMap { l ->
        val ll = l.structMemberDeclarationType?.identifierList
        var child = ll?.firstChild
        val result = mutableListOf<Type>()
        while (child != null) {
            if (child.text != ",") {
                result.add(Type(child.text, l.structMemberDeclarationType?.type!!))
            }
            child = child.nextSibling
        }
        result
    }.orEmpty()
}

fun Project.allModules(f: VirtualFile): List<Module> {
    return loadAllModules(this, f)
}