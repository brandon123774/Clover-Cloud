package com.clovercloud.repository;

import com.clovercloud.model.Employee;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository employeeRepo;

    @Before
    public void setUp() {
        employeeRepo.deleteAll();

        employeeRepo.save(new Employee(1,"Jessica", "Day", "jday@ng.org"));
        employeeRepo.save(new Employee(2,"Nick", "Miller", "nmiller@ng.org"));
        employeeRepo.save(new Employee(3,"Cece", "Parekh", "cparekh@ng.org"));
        employeeRepo.save(new Employee(4,"Winston", "Bishop", "cparekh@ng.org"));
        employeeRepo.save(new Employee(5,"Winston", "Schmidt", "cparekh@ng.org"));

    }

    //test to return all employees with the same first name
    @Test
    public void shouldFindAllEmployeesByLastName() throws Exception {
        List<Employee> dayLastName = employeeRepo.findAllEmployeesByLastName("Day");
        assertEquals(1, dayLastName.size());
    }

 }