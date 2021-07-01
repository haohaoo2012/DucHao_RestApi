package com.example.api.api.model;

import javax.persistence.*;
import javax.persistence.GenerationType;

import java.io.Serializable;

@Entity
@Table(name="employees")


public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Long age;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;






    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name=" + getName() +
                ", age=" + getAge() +
                ", phone=" + getPhone() +
                ", email=" + getEmail() +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}