package com.clover.edgeservice.controller;

import com.clover.edgeservice.model.Project;
import com.clover.edgeservice.util.feign.CloverCrudServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired CloverCrudServiceClient projectFeignClient;

    @GetMapping("/project")
    @ResponseStatus(HttpStatus.OK)
    public List<Project> getAllProjects(){
        System.out.println("We used this edge service to get all projects.");
        return projectFeignClient.getAllProjects();

    }



}