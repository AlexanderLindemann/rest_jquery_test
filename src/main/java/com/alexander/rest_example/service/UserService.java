package com.alexander.rest_example.service;

import com.alexander.rest_example.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listOfUser();

    User findOnID(long id);

    boolean update(User user);

    boolean delete(Long id);

}
