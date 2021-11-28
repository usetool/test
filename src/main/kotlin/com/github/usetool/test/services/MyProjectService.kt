package com.github.usetool.test.services

import com.intellij.openapi.project.Project
import com.github.usetool.test.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
