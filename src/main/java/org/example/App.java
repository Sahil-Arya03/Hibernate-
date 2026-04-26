package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {

        System.out.println("Config started...");

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Student st = new Student();
        st.setId(13);
        st.setFirstName("Aarit");
        st.setLastName("Hota");
        Session session=factory.openSession();
         Transaction tx=session.beginTransaction();
         session.persist(st);
         tx.commit();
        session.close();
        factory.close();
    }
}