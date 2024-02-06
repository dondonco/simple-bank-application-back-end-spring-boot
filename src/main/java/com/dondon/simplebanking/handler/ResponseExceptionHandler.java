package com.dondon.simplebanking.handler;

import com.dondon.simplebanking.exception.AccountNotFoundException;
import com.dondon.simplebanking.exception.InvalidAccountTypeException;
import com.dondon.simplebanking.exception.InvalidTransactionAmountException;
import com.dondon.simplebanking.exception.InvalidTransactionTypeException;
import com.dondon.simplebanking.response.ResponseExceptionMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@ControllerAdvice
public class ResponseExceptionHandler {

    @ExceptionHandler(value = {AccountNotFoundException.class})
    public ResponseEntity<ResponseExceptionMessage> handleAccountNotFoundException(Exception e) {
        ResponseExceptionMessage message = new ResponseExceptionMessage(new Date(), HttpStatus.NOT_FOUND.value(), "Not Found", e.getMessage());
        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {InvalidTransactionTypeException.class, InvalidAccountTypeException.class, InvalidTransactionAmountException.class})
    public ResponseEntity<ResponseExceptionMessage> handleInvalidException(Exception e) { ResponseExceptionMessage message = new ResponseExceptionMessage(new Date(), HttpStatus.BAD_REQUEST.value(), "BAD REQUEST", e.getMessage());
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }
}
