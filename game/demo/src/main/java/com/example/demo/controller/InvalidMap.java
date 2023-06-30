package com.example.demo.controller;

public class InvalidMap extends Exception {
    public InvalidMap(){
        super("please select a map");
    }
}
