package com.softwaredesign.recruitservice.exception;

public class AlreadyExist extends RuntimeException{


    private static final String message="Already Exist!";

    public AlreadyExist(String message) {
        super(message);
    }
}
