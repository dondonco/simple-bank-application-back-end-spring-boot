package com.dondon.simplebanking.exception;

public class InvalidAccountTypeException extends RuntimeException{

    public InvalidAccountTypeException(String message) {
        super(message);
    }
}
