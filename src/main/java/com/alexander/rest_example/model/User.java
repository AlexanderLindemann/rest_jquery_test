package com.alexander.rest_example.model;

import java.util.HashSet;
import java.util.Set;

public class User {
    private Long id;
    private String password;
    private String username;
    private String lastName;
    private int weight;
    private int height;

    private Set<Role> roles = new HashSet<>();

//    public User(Long id, String login, String email, String password, String name, String lastname, int age) {
//        this.id = id;
//        this.login = login;
//        this.email = email;
//        this.password = password;
//        this.name = name;
//        this.lastname = lastname;
//        this.age = age;
//    }
//
//    public User() {
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
