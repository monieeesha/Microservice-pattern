package com.stackroute.muzixservice.exceptions;

//custom exception if TrackalreadyExists while saving
public class TrackAlreadyExistsExceptions extends Exception {

        private String message;

        public TrackAlreadyExistsExceptions(String message)
        {
            super(message);
            this.message=message;
        }
}
