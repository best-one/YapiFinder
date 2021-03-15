package com.github.bestone.yapifinder.services

import com.github.bestone.yapifinder.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
