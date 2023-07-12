package com.softwaredesign.recruitservice.exception;

public class InvalidInputException extends RuntimeException{
    public static final String message = "Invalid Input";

    public InvalidInputException(String message) {
        super(message);
    }
}
