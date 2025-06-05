package com.vedranmaksic.portfolio.controller;

import com.vedranmaksic.portfolio.model.Project;
import com.vedranmaksic.portfolio.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "http://localhost:3000") // frontend port

public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }

    @PostMapping
    public Project saveProject(@RequestBody Project project){
        return projectService.saveProject(project);
    }
}
