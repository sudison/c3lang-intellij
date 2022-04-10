package org.c3lang.intellijplugin.completion

import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ProjectRootManager
import com.intellij.openapi.vfs.VfsUtilCore
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiManager
import com.intellij.psi.search.ProjectAndLibrariesScope
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.util.PsiUtilCore
import com.intellij.testFramework.LightVirtualFile
import org.c3lang.intellijplugin.parser.psi.C3Module

fun loadAllModules(project: Project, f: VirtualFile): List<Module> {
    val srcRoot =
            if (f is LightVirtualFile) {
                ProjectRootManager.getInstance(project)
                        .getFileIndex().getSourceRootForFile(f.originalFile) ?: return listOf()
            } else {
                ProjectRootManager.getInstance(project)
                        .getFileIndex().getSourceRootForFile(f) ?: return listOf()
            }


    val moduleMaps = mutableMapOf<String, Module>()
    VfsUtilCore.iterateChildrenRecursively(srcRoot, ProjectAndLibrariesScope(project)) {
        if (it.name.endsWith(".c3") && it.name != f.name) {
            val p = PsiUtilCore.toPsiFiles(PsiManager.getInstance(project), listOf(it)).get(0)
            val m = PsiTreeUtil.findChildOfType(p, C3Module::class.java)
            val moduleName = m?.importPath?.symbolList?.joinToString(separator = ".") { it.text }
            moduleMaps[moduleName!!] = Module(moduleName, p)
        }
        true
    }
    return moduleMaps.values.toList()
}

class Module(val name: String, val p: PsiFile) {
}