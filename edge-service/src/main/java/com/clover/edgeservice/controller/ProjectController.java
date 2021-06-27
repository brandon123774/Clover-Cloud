package com.clover.edgeservice.controller;

import com.clover.edgeservice.model.Project;
import com.clover.edgeservice.util.feign.CloverCrudServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired CloverCrudServiceClient projectFeignClient;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Project createProject(@RequestBody Project project)  {
        System.out.println("Used this edge service to create a project.");
        return projectFeignClient.makeANewProjectInTheCrudService(project);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Project> getAllProjects(){
        System.out.println("Used this edge service to get all projects.");
        return projectFeignClient.getAllProjectsInTheCrudService();
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Project getOneProject(@PathVariable int id)  {
        System.out.println("Used this edge service to get a project by id.");
        return projectFeignClient.getAllProjectsInTheCrudService().get(id);
    }


    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateProject(@RequestBody Project project, @PathVariable int id ) {
        System.out.println("Used this edge service to update a project by id.");
        updateProject(project, id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteProject(@PathVariable int id){
        System.out.println("Used this edge service to delete a project by id.");
        deleteProject(id);
    }


}