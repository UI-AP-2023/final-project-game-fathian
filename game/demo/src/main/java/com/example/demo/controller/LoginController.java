package com.example.demo.controller;

import com.example.demo.SystemGame;
import com.example.demo.model.Player;

public class LoginController {
    public void checkLogin(String username,String password) throws InvalidUsername , InvalidPassword{
        boolean foundUsername=false;
        for (Player player: SystemGame.players){
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
