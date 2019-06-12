package com.stackroute.muzixservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


//Enable global exception
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value= TrackAlreadyExistsExceptions.class)
    public ResponseEntity<String>  TrackAlreadyExist(TrackAlreadyExistsExceptions exception)
    {
        return new ResponseEntity<String>(exception.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(value= TrackNotFoundExceptions.class)
    public ResponseEntity<String> Tracknotfound(TrackNotFoundExceptions exception1)
    {
        return new ResponseEntity<String>(exception1.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value= TrackEmptyExceptions.class)
    public ResponseEntity<String> TrackEmptyExceptions(TrackEmptyExceptions exception2)
    {
        return new ResponseEntity<String>(exception2.getMessage(), HttpStatus.NOT_FOUND);
    }
}
