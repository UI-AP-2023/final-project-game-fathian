package com.example.demo.controller;

public class InvalidPassword extends Exception {
    public InvalidPassword(){
        super("invalid password");
    }
}
