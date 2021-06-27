package com.clover.edgeservice.util.feign;

import com.clover.edgeservice.model.Employee;
import com.clover.edgeservice.model.Log;
import com.clover.edgeservice.model.Project;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "clover-cloud-service")
public interface CloverCrudServiceClient {

    //create feign calls for employee
    @PostMapping("/employee")
    public Employee makeANewEmployeeInTheCrudService(@RequestBody Employee employee);

    @GetMapping("/employee")
    public List<Employee> getAllEmployeesInTheCrudService();

//    @GetMapping("/employee/{employeeId}")
//    public Employee getOneEmployeeInTheCrudService(@PathVariable Integer employeeId);


    //create feign calls for project
    @PostMapping("/project")
    public Project makeANewProjectInTheCrudService(@RequestBody Project project);

    @GetMapping("/project")
    public List<Project> getAllProjectsInTheCrudService();

//    @GetMapping("/{id}")
//    public Project getOneProjectInTheCrudService(@PathVariable int id);
//
//    @PutMapping(value = "/{id}")
//    public void updateProject(@RequestBody Project project, @PathVariable int id );

    //create feign calls for log

    @PostMapping("/log")
    public Log makeANewLogInTheCrudService(@RequestBody Log log);

    @GetMapping("/log")
    public List<Log> getAllLogsInTheCrudService();


}
