package org.example;

import jakarta.persistence.Embeddable;

import java.time.LocalDate;
import java.util.Date;

@Embeddable
public class Certificate {
    private String Course;
    private String address;
    private String email;
    private String phone;
    private LocalDate date;

    // Default constructor
    public Certificate() {
    }

    // Parameterized constructor
    public Certificate(String Course, String address, String email, String phone, LocalDate date) {
        this.Course = Course;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.date = date;
    }

    // Getters and setters
    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
