package com.example.demo.controller;

import com.example.demo.SystemGame;
import com.example.demo.model.Map;
import com.example.demo.model.Player;

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
    public void checkUsername(String username) throws InvalidUsername {
        boolean duplicateUsername=false;
        for (Player player: SystemGame.players){
            if (player.getPlayerID().equals(username)) {
                duplicateUsername = true;
                break;
            }
        }
        if (duplicateUsername){
            throw new InvalidUsername();
        }
    }
    public void checkMap(Map map) throws InvalidMap {
        if (map==null){
            throw new InvalidMap();
        }
    }
    public void addUser(Player player){
        SystemGame.players.add(player);
    }
}
