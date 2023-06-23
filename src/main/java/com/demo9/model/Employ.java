package com.demo9.model;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;

import javax.persistence.*;
import org.springframework.validation.*;
import java.util.Date;

@Entity
@Table(name = "employ")
public class Employ {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String employCode;
    @NotNull
    private String fullName;
    @NotNull
    private String date;
    @NotNull
    private String email;
    @NotNull
    private String phone;
    @NotNull
    private String address;
    @NotNull
    private String classroom;

    public Employ() {
    }

    public Employ(Long id, String employCode, String fullName, String date, String email, String phone, String address, String classroom) {
        this.id = id;
        this.employCode = employCode;
        this.fullName = fullName;
        this.date = date;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.classroom = classroom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployCode() {
        return employCode;
    }

    public void setEmployCode(String employCode) {
        this.employCode = employCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "id=" + id +
                ", employCode='" + employCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", date='" + date + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", classroom='" + classroom + '\'' +
                '}';
    }
}
