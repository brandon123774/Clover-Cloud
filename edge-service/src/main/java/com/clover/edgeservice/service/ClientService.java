package com.clover.edgeservice.service;

import com.clover.edgeservice.model.Employee;
import com.clover.edgeservice.model.Log;
import com.clover.edgeservice.model.Project;
import com.clover.edgeservice.util.feign.CloverCrudServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RefreshScope
public class ClientService {

    @Autowired
    private CloverCrudServiceClient cloverCrudServiceClient;

    // employee
    public Employee createEmployee(Employee employee)   {
        System.out.println("Service layer. Create an employee.");
        return cloverCrudServiceClient.makeANewEmployeeInTheCrudService(employee);
    }

    public List<Employee> getAllEmployees() {
        System.out.println("Service layer. Get all employees.");
        return cloverCrudServiceClient.getAllEmployeesInTheCrudService();
    }

    public Employee getEmployeeById(int id) {
        System.out.println("Service layer. Get an employee.");
        return cloverCrudServiceClient.getAllEmployeesInTheCrudService().get(id);
    }

    // project
    public Project createProject(Project project)   {
        System.out.println("Service layer. Create a project.");
        return cloverCrudServiceClient.makeANewProjectInTheCrudService(project);
    }

    public List<Project> getAllProjects() {
        System.out.println("Service layer. Get all projects.");
        return cloverCrudServiceClient.getAllProjectsInTheCrudService();
    }

    public Project getProjectById(int id) {
        System.out.println("Service layer. Get a project.");
        return cloverCrudServiceClient.getAllProjectsInTheCrudService().get(id);
    }

    //might need to change this
    public void updateProject(Project project)  {
        cloverCrudServiceClient.getAllProjectsInTheCrudService().get(project.getProjectId());
    }

    //might need to update this
    public void deleteProject(int id)   {
        cloverCrudServiceClient.getAllProjectsInTheCrudService().clear();
    }

    //logs
    public Log createLog(Log log)   {
        System.out.println("Service layer. Create a log.");
        return cloverCrudServiceClient.makeANewLogInTheCrudService(log);
    }

    public List<Log> getAllLogs() {
        System.out.println("Service layer. Get all logs.");
        return cloverCrudServiceClient.getAllLogsInTheCrudService();
    }

    public Log getLogById(int id) {
        System.out.println("Service layer. Get a log.");
        return cloverCrudServiceClient.getAllLogsInTheCrudService().get(id);
    }

    //might need to change this
    public void updateLog(Log log)  {
        System.out.println("Service layer. Update a log by id.");

        cloverCrudServiceClient.getAllLogsInTheCrudService().get(log.getLogId());
    }












}
