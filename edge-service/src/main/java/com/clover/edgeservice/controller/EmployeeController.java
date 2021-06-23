package com.clover.edgeservice.controller;

import com.clover.edgeservice.model.Employee;
import com.clover.edgeservice.util.feign.EmployeeCrudServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeCrudServiceClient employeeFeignClient;

    @GetMapping("/employee")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getAllEmployees(){
        System.out.println("We used this edge service to get all employees.");
        return employeeFeignClient.getAllEmployees();
    }
}
