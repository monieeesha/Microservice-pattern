package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.exceptions.UserAlreadyExistsExceptions;

import java.util.List;
//interface for the user-services

public interface UserService {

    public User saveUser(User user)throws UserAlreadyExistsExceptions;
    public List<User> getAllUsers();

}
