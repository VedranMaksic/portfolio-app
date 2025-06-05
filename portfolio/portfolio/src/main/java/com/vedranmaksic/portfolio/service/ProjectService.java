package com.vedranmaksic.portfolio.service;

import com.vedranmaksic.portfolio.model.Project;
import com.vedranmaksic.portfolio.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }

    public Project saveProject(Project project){
        return projectRepository.save(project);
    }
}
