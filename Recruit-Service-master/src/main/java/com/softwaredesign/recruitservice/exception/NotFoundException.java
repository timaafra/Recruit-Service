package com.softwaredesign.recruitservice.exception;

public class NotFoundException extends RuntimeException{
     public static final String message= "Not found";

    public NotFoundException() {
        super(message);
    }
}
