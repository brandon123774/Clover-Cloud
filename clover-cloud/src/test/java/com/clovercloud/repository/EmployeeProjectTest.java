//package com.clovercloud.repository;
//
//import com.clovercloud.model.Project;
//import org.junit.Before;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.List;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
//public class EmployeeProjectTest {
//
//    @Autowired
//    EmployeeRepository employeeRepo;
//
//    @Autowired
//    ProjectRepository projectRepo;
//
//    @Autowired
//    LogRepository logRepo;
//
//    @Before
//    public void setUp() throws Exception    {
//        List<Project> projectList = projectRepo.getAllProjects();
//        for (Project p : projectList) {
//            projectRepo.deleteProject(p.getProjectId());
//        }
//    }
//
////    @Test
////    public void shouldFindAllEmployeesByProject()   {
////        //Need to create employees first
////        Employee employee = new Employee();
////        employee.setEmployeeId(1);
////        employee.setFirstName("Jessica");
////        employee.setLastName("Day");
////        employee.setEmail("jday@ng.org");
////
////        Employee employee2 = new Employee();
////        employee2.setEmployeeId(2);
////        employee2.setFirstName("Nick");
////        employee2.setLastName("Miller");
////        employee2.setEmail("nmiller@ng.org");
////
////        Employee employee3 = new Employee();
////        employee3.setEmployeeId(3);
////        employee3.setFirstName("Cece");
////        employee3.setLastName("Parekh");
////        employee3.setEmail("cparekh@ng.org");
////
////        // Need to create projects next
////        Project project = new Project();
////        project.setProjectId(1);
////        project.setProjectName("Apple");
////        project.setHoursPlanned(120);
////        project.setProjectStatus("Active");
////
////        Project project2 = new Project();
////        project2.setProjectId(2);
////        project2.setProjectName("Banana");
////        project2.setHoursPlanned(100);
////        project2.setProjectStatus("Complete");
////
////        //Need to find all employees
////        List<Employee> allEmployees = employeeRepo.getAllEmployees();
////
////        //Need to insert employees in projects
////
////        //Need to sort employees by project
////    }
//
//}
