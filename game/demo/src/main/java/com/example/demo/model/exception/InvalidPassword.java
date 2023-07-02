package com.example.demo.model.exception;

public class InvalidPassword extends Exception {
    public InvalidPassword(){
        super("invalid password");
    }
}
