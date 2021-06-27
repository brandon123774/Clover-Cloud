package com.clover.edgeservice.controller;

import com.clover.edgeservice.model.Employee;
import com.clover.edgeservice.util.feign.CloverCrudServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private CloverCrudServiceClient employeeFeignClient;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmployee(@RequestBody Employee employee) {
        System.out.println("Used this edge service to create an employee.");
        return employeeFeignClient.makeANewEmployeeInTheCrudService(employee);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getAllEmployees() {
        System.out.println("Used this edge service to get all employees.");
        return employeeFeignClient.getAllEmployeesInTheCrudService();
    }

    @GetMapping("/{employeeId}")
    @ResponseStatus(HttpStatus.OK)
    public Employee getOneEmployee(@PathVariable Integer employeeId) {
        System.out.println("Used this edge service to get one employee by id.");
        return employeeFeignClient.getAllEmployeesInTheCrudService().get(employeeId);
    }
}
