package com.github.jpomykala.intelliji18npluginv2.services

import com.github.jpomykala.intelliji18npluginv2.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
