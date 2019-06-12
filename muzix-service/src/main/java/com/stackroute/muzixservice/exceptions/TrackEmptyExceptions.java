package com.stackroute.muzixservice.exceptions;

//custom exception if tracklist is empty
public class TrackEmptyExceptions  extends Exception
{

    private  String message;

    public TrackEmptyExceptions(String message) {

        super(message);
        this.message = message;
    }
}
