package com.dondon.simplebanking.exception;

public class InvalidTransactionTypeException extends RuntimeException{

    public InvalidTransactionTypeException(String message) {
        super(message);
    }
}
