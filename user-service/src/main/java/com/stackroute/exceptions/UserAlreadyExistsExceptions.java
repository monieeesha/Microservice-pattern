package com.stackroute.exceptions;
// custom exception for user already exsist exeception
public class UserAlreadyExistsExceptions extends Exception {

    private String message;

    public UserAlreadyExistsExceptions()
    {

    }

    public UserAlreadyExistsExceptions(String message)
    {
        super(message);
        this.message=message;
    }
}
