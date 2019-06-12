package com.stackroute.muzixservice.exceptions;

//custom exception for TracknotFound
public class TrackNotFoundExceptions extends Exception{

    private String message;
    public TrackNotFoundExceptions(String message)
    {
        super(message);
        this.message=message;
    }

}
