package com.clovercloud.repository;

import com.clovercloud.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository <Project, Integer> {

//    Project addProject(Project project);
//    Project getProject(int id);
//    List<Project> getAllProjects();
//    void updateProject(Project project);
//    void deleteProject(int id);
}
