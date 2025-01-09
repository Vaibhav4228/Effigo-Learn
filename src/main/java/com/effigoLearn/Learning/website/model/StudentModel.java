package com.effigoLearn.Learning.website.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentModel  {

    @Id
    private Long id;
    private String name;
    private String email;
    private String password;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
