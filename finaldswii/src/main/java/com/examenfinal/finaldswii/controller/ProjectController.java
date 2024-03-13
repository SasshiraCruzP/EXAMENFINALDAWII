package com.examenfinal.finaldswii.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examenfinal.finaldswii.model.Project;
import com.examenfinal.finaldswii.service.ProjectService;

@RestController
@RequestMapping("/projects")
public class ProjectController {

	@Autowired
    private ProjectService projectService;

    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }
}
