package com.clover.edgeservice.util.feign;

import com.clover.edgeservice.model.Employee;
import com.clover.edgeservice.model.Log;
import com.clover.edgeservice.model.Project;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "clover-cloud-service")
public interface CloverCrudServiceClient {

    //create api calls for employee
    @PostMapping("/employee")
    public Employee makeANewEmployeeInTheCrudService(@RequestBody Employee employee);

    @GetMapping("/employee")
    public List<Employee> getAllEmployees();


    //create api calls for project
    @PostMapping("/project")
    public Project makeANewProjectInTheCrudService(@RequestBody Project project);

    @GetMapping("/project")
    public List<Project> getAllProjects();


    //create api calls for log

    @PostMapping("/log")
    public Log makeANewLogInTheCrudService(@RequestBody Log log);

    @GetMapping("/log")
    public List<Log> getAllLogs();


}
