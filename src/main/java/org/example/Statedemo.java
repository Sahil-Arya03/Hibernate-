package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.lang.module.Configuration;
import java.time.LocalDate;

public class Statedemo
{
    public static void main(String[] args) {
        System.out.println("Statedemo");
        SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Student s  = new Student();
        s.setId(231);
        s.setFirstName("kent");
        s.setLastName("james");
        s.setCerti(new Certificate("Hibernate","Delhi","abc@384gmail.com","2372184893", LocalDate.now()));
        // this data is in transient state cause this data is not related to any data base and not stored in session object too
        Session ses= f.openSession();
        Transaction tx=ses.beginTransaction();
        ses.persist(s);
        // the data is in persistent state
        s.setFirstName("Aarit");
        tx.commit();
        ses.close();
        s.setFirstName("KSI");
        // student is in detached state means it will print the value of ksi only but data base will have aarit as last updated name
        f.close();
    }

}
