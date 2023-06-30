package com.example.demo.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignupController {
    public void checkPassword(String password) throws InvalidPassword {
        Pattern pattern =Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).{8,}$");
        Matcher matcher =pattern.matcher(password);
        boolean found = matcher.find();
        if (!found){
            throw new InvalidPassword();
        }
    }
    public void checkUsername(){

    }
    public void addUser(){

    }
}
