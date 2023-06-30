package com.example.demo.model;

public class Player {
    public Player(String playerID,String password,int level,int wins,int losses,Map map) {
        this.playerID = playerID;
        this.password=password;
        this.level=level;
        this.wins=wins;
        this.losses=losses;
        this.map=map;
    }

    private String playerID;
    private String password;
    private int level;
    private int wins;
    private int losses;
    private Map map;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }
}
