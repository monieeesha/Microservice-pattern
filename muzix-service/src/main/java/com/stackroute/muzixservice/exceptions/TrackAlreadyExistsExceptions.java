package com.stackroute.muzixservice.exceptions;

//custom exception for Trackalready Exist
public class TrackAlreadyExistsExceptions extends Exception {

        private String message;

        public TrackAlreadyExistsExceptions(String message)
        {
            super(message);
            this.message=message;
        }
}
