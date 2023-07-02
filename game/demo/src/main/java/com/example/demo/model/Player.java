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
    public Player(String playerID,String password,int level,int wins,int losses,String mapId) {
        this.playerID = playerID;
        this.password=password;
        this.level=level;
        this.wins=wins;
        this.losses=losses;
        this.mapId=mapId;
    }

    private String playerID;
    private String password;
    private int level;
    private int wins;
    private int losses;
    private Map map;
    private String mapId;

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
