package com.map1;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {

    @Id
    @Column(name = "employee_id")
    private int employeeId;
    @Column(name = "employee_name")
    private String employeeName;
    @ManyToMany
    @JoinTable(name = "employee_project_mapping")
    private List<Project> projects;


    public Employee(int employeeId, String employeeName, List<Project> projects) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.projects = projects;
    }

    public Employee() {
        super();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
