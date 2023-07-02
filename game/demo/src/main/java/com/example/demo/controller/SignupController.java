package com.example.demo.controller;

import com.example.demo.model.SystemGame;
import com.example.demo.dataBase.Players;
import com.example.demo.model.Map;
import com.example.demo.model.Player;
import com.example.demo.model.exception.InvalidMap;
import com.example.demo.model.exception.InvalidPassword;
import com.example.demo.model.exception.InvalidUsername;

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
        for (Player player: Players.getInstance().getPlayers()){
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
        Players.getInstance().saveUsers(player.getPlayerID(), player.getPassword(), player.getLevel(), player.getWins(), player.getLosses(), player.getPlayerID());
        SystemGame.player=player;
    }
}
