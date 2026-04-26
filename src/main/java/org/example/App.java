package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.*;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Config started...");

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        //setting up student class
        Student st = new Student();
        st.setId(13);
        st.setFirstName("Aarit");
        st.setLastName("Hota");

        // setting up address class
        address a = new address();
        a.setCity("Ahemdabad");
        a.setState("Gujrat");
        a.setAddeddate(LocalDate.now()); // add custom date to the database
        // this is done  to retrieve the image form the local machine
        byte [] image= Files.readAllBytes(Paths.get("C:\\Users\\rocks\\Downloads\\ChatGPT Image Apr 23, 2026, 12_44_33 PM.png\""));
        a.setImage(image);


        Session session=factory.openSession();
         Transaction tx=session.beginTransaction();
         session.persist(st);
         session.save(a);
         tx.commit();
        session.close();
        factory.close();
    }
}