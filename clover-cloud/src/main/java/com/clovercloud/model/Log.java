package com.clovercloud.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    LocalDateTime timestamp;
    private double timeSpent;

    public Log ()   {

    }

    public Log(Integer logId, Integer projectId, Integer categoryId, Integer employeeId, LocalDateTime timestamp, double timeSpent) {
        this.logId = logId;
        this.projectId = projectId;
        this.categoryId = categoryId;
        this.employeeId = employeeId;
        this.timestamp = timestamp;
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

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public double getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(double timeSpent) {
        this.timeSpent = timeSpent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return Double.compare(log.timeSpent, timeSpent) == 0 && Objects.equals(logId, log.logId) && Objects.equals(projectId, log.projectId) && Objects.equals(categoryId, log.categoryId) && Objects.equals(employeeId, log.employeeId) && Objects.equals(timestamp, log.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logId, projectId, categoryId, employeeId, timestamp, timeSpent);
    }

    @Override
    public String toString() {
        return "Log{" +
                "logId=" + logId +
                ", projectId=" + projectId +
                ", categoryId=" + categoryId +
                ", employeeId=" + employeeId +
                ", timestamp=" + timestamp +
                ", timeSpent=" + timeSpent +
                '}';
    }
}
