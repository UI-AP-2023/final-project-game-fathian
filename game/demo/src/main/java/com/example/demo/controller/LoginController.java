package com.example.demo.controller;

import com.example.demo.model.SystemGame;
import com.example.demo.dataBase.Players;
import com.example.demo.model.Player;
import com.example.demo.model.exception.InvalidPassword;
import com.example.demo.model.exception.InvalidUsername;

public class LoginController {
    public void checkLogin(String username,String password) throws InvalidUsername, InvalidPassword {
        boolean foundUsername=false;
        for (Player player: Players.getInstance().getPlayers()){
            if (player.getPlayerID().equals(username)){
                foundUsername=true;
                if (!player.getPassword().equals(password))
                    throw new InvalidPassword();
                else SystemGame.player=player;
            }
        }
        if (!foundUsername){
            throw  new InvalidUsername();
        }
    }
}
