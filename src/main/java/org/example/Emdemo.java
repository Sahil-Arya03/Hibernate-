package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Emdemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Certificate c1=new Certificate();
        c1.setAddress("Ahamdabad");
        c1.setCourse("Java Backend");
        c1.setEmail("tanishqarara43@gmail.com");
        c1.setPhone("547475623847");
        LocalDate Date;
        c1.setDate(LocalDate.now());

        Student s1=new Student();
        s1.setId(1);
        s1.setFirstName("Tanishq");
        s1.setLastName("Arora");
        s1.setCerti(c1);
        Transaction tx = session.beginTransaction();
        session.persist(s1);
        tx.commit();
        session.close();
        factory.close();
    }
}
