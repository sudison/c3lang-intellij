package com.github.sudison.c3langintellij.services

import com.github.sudison.c3langintellij.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
