package com.map1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MappingRun {

    public static void main(String[] args) {

        Configuration config = new Configuration();
        config.configure();
        SessionFactory factory = config.buildSessionFactory();

        Employee emp1 = new Employee();
        emp1.setEmployeeId(23);
        emp1.setEmployeeName("Ravi");

        Employee emp2 = new Employee();
        emp2.setEmployeeId(56);
        emp2.setEmployeeName("Dinesh");

        Project project1 = new Project();
        project1.setProjectId(112);
        project1.setProjectName("Monitoring Software");

        Project project2 = new Project();
        project2.setProjectId(552);
        project2.setProjectName("Enhancements in production");

        Project project3 = new Project();
        project3.setProjectId(563);
        project3.setProjectName("Update and commit codes");

        List<Project> projects = new ArrayList<Project>();
        projects.add(project1);
        projects.add(project2);
        projects.add(project3);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);

        emp1.setProjects(projects);
        project1.setEmployees(employees);


        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();


        session.save(emp1);
        session.save(emp2);
        session.save(project1);
        session.save(project2);
        session.save(project3);

        transaction.commit();
        session.close();
        factory.close();



    }
}
