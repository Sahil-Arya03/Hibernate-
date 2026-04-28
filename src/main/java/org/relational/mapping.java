package org.relational;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class mapping {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        // setting up all the emp
        Emp e1 = new Emp();
        e1.setId(1);
        e1.setEmpname("Ram");

        Emp e2 = new Emp();
        e2.setId(2);
        e2.setEmpname("Tanishq");

        Emp e3 = new Emp();
        e3.setId(3);
        e3.setEmpname("Saumil");

        //setting up all the projects
        Project p1 = new Project();
        p1.setProjid(1);
        p1.setProjname("E-commerce Platform");

        Project p2 = new Project();
        p2.setProjid(2);
        p2.setProjname("Inventory Management System");

        Project p3 = new Project();
        p3.setProjid(3);
        p3.setProjname("Customer Relationship Management");

        Project p4 = new Project();
        p4.setProjid(4);
        p4.setProjname("Data Analytics Dashboard");

        List<Emp> emps1 = new ArrayList<>();
        emps1.add(e1);

        List<Emp> emps2 = new ArrayList<>();
        emps2.add(e2);
        emps2.add(e3);

        List<Emp> emps3 = new ArrayList<>();
        emps3.add(e1);
        emps3.add(e3);

        p1.setEmps(emps1);
        p2.setEmps(emps2);
        p3.setEmps(emps3);


        List<Project> projects1 = new ArrayList<Project>();
        projects1.add(p1);
        projects1.add(p2);
        projects1.add(p3);
        projects1.add(p4);

        List<Project> projects2 = new ArrayList<Project>();
        projects2.add(p1);
        projects2.add(p4);

        List<Project> projects3 = new ArrayList<Project>();
        projects3.add(p4);

        e1.setProjects(projects1);
        e2.setProjects(projects2);
        e3.setProjects(projects3);
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        s.persist(e1);
        s.persist(e2);
        s.persist(e3);
        s.persist(p1);
        s.persist(p2);
        s.persist(p3);
        s.persist(p4);


        tx.commit();
        s.close();
        factory.close();
    }
}
