package com.clover.edgeservice.util.feign;

import com.clover.edgeservice.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "clover-cloud-service")
public interface EmployeeCrudServiceClient {

    @GetMapping("/employee")
    public List<Employee> getAllEmployees();

    @PostMapping("/employee")
    public Employee makeANewEmployeeInTheCrudService(@RequestBody Employee employee);

}
