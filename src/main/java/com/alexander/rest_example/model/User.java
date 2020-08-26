package com.alexander.rest_example.model;

public class User {
    private Long id;
    private String login;
    private String email;
    private String password;
    private String name;
    private String lastname;
    private int age;

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
