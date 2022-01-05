package com.github.sudison.c3langintellij.services

import com.intellij.openapi.project.Project
import com.github.sudison.c3langintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
