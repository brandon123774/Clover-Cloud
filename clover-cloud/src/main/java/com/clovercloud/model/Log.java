package com.clovercloud.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name ="log")

public class Log implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer logId;
    private Integer projectId;
    private Integer categoryId;
    private Integer employeeId;
    private String date;
    private String timeSpent;

    public Log ()   {

    }

    public Log(Integer logId, Integer projectId, Integer categoryId, Integer employeeId, String date, String timeSpent) {
        this.logId = logId;
        this.projectId = projectId;
        this.categoryId = categoryId;
        this.employeeId = employeeId;
        this.date = date;
        this.timeSpent = timeSpent;
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(String timeSpent) {
        this.timeSpent = timeSpent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return Objects.equals(logId, log.logId) && Objects.equals(projectId, log.projectId) && Objects.equals(categoryId, log.categoryId) && Objects.equals(employeeId, log.employeeId) && Objects.equals(date, log.date) && Objects.equals(timeSpent, log.timeSpent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logId, projectId, categoryId, employeeId, date, timeSpent);
    }

    @Override
    public String toString() {
        return "Log{" +
                "logId=" + logId +
                ", projectId=" + projectId +
                ", categoryId=" + categoryId +
                ", employeeId=" + employeeId +
                ", date='" + date + '\'' +
                ", timeSpent='" + timeSpent + '\'' +
                '}';
    }
}
