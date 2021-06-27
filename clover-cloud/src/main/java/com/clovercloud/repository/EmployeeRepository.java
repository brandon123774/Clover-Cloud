package com.clovercloud.repository;

import com.clovercloud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Integer> {
//    Employee addEmployee(Employee employee);
//    Employee getOneEmployee(Integer employeeId);
//    List<Employee> getAllEmployees();
//    List<Employee> findAllEmployeesBySameFirstName(String firstName);

}
