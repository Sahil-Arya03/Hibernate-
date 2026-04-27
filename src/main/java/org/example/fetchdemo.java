package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

public class fetchdemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        // this is to retrieve the data from the table
        Student S=(Student)session.get(Student.class,13);//if value is not found then returns null
        //Student S=(Student)session.load(Student.class,13); have a similar use case but load throws exception
        System.out.println(S);

        address a=(address)session.get( address.class,13);
        System.out.println(a);
        session.close();
        factory.close();
    }
}
