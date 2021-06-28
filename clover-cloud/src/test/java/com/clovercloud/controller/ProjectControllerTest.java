package com.clovercloud.controller;

import com.clovercloud.model.Project;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(ProjectController.class)
public class ProjectControllerTest {

    @Autowired

    //make the mock testing
    private MockMvc mockMvc;

    @MockBean
    private ProjectController controller;

    //Jackson mapper
    private ObjectMapper mapper = new ObjectMapper();

    //create variables needed
    private Project controllerProject;
    private String controllerJson;
    private List<Project> allProjects = new ArrayList<>();
    private String allProjectsJson;

    @Before
    public void setUp() throws Exception    {

        //create a project
        controllerProject = new Project();
        controllerProject.setProjectId(20);
        controllerProject.setProjectName("Coconut");
        controllerProject.setHoursPlanned(180);
        controllerProject.setProjectStatus("Active");

        controllerJson = mapper.writeValueAsString(controllerProject);

        //another one
        Project project = new Project();
        project.setProjectId(102);
        project.setProjectName("Pear");
        project.setHoursPlanned(200);
        project.setProjectStatus("Pending");
        allProjects.add(controllerProject);
        allProjects.add(project);

        //string of info for projects
        allProjectsJson = mapper.writeValueAsString(allProjects);

    }

    //test to return a project by id
    @Test
    public void shouldReturnProjectById() throws Exception  {
        given(controller.getOneProject(20)).willReturn(controllerProject);

        mockMvc.perform(
                get("/project/20"))
                .andExpect(status().isOk())
                .andExpect((content().json(controllerJson))
        );
    }

    //test to return all of the projects
    @Test
    public void shouldReturnAllProjects() throws Exception  {
        given(controller.getAllProjects()).willReturn(allProjects);

        mockMvc.perform(
                get("/project"))
                .andExpect(status().isOk())
                .andExpect(content().json(allProjectsJson)
        );
    }

    //test to return a status code ok
    @Test
    public void shouldBeStatusOkForNonExistingProjectId() throws Exception  {
        given(controller.getOneProject(5555)).willReturn(null);
        mockMvc.perform(
                get("/project/5555"))
                .andExpect(status().isOk()
        );
    }
}