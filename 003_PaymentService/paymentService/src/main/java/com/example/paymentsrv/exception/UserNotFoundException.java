package com.example.paymentsrv.exception;

public class UserNotFoundException extends Exception {

    public UserNotFoundException(String reason)
    {
        super(reason);
    }
}
