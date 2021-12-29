package com.github.garyttierney.pzintellij.services

import com.intellij.openapi.project.Project
import com.github.garyttierney.pzintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
