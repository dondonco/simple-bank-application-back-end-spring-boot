package com.dondon.simplebanking.exception;

public class InvalidTransactionAmountException extends RuntimeException{

    public InvalidTransactionAmountException(String message) {
        super(message);
    }
}
