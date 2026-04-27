package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.SQLOutput;

@Entity
public class Student {
    @Id
    private int id;
    private String firstName;
    private String lastName;


    Student(int id, String firstName, String lastName) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Student() {
        super();
    }

    //getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    //setters
    public int setId(int id) {
        this.id = id;
        return id;
    }

    public String setFirstName(String firstName) {
        this.firstName = firstName;
        return firstName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
        return lastName;
    }
    @Override
            public String toString() {
        return id + ": " + firstName + ": " + lastName;
    }
}

