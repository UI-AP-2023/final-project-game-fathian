package com.example.demo.controller;

public class InvalidUsername extends Exception {
    public InvalidUsername(){
        super("invalid username");
    }
}
