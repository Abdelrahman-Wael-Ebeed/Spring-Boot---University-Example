package com.abdelrahman.spring_boot_example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable int id) {
        return projectService.getProjectById(id);
    }

    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return projectService.saveProject(project);
    }

    @PutMapping("/{id}")
    public Project updateProject(@PathVariable int id, @RequestBody Project updatedProject) {
        Project existingProject = projectService.getProjectById(id);
        if (existingProject != null) {
            existingProject.setName(updatedProject.getName());
            existingProject.setCourseId(updatedProject.getCourseId());
            return projectService.saveProject(existingProject);
        }
        return null;
    }


    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable int id) {
        projectService.deleteProject(id);
    }
}
