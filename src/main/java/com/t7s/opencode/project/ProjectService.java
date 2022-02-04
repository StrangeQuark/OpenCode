package com.t7s.opencode.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    public final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Optional<Project> getProject(Long projectId) {
        return projectRepository.findById(projectId);
    }

    public Optional<Project> getProject(String projectName) {
        return projectRepository.findProjectByName(projectName);
    }
}
