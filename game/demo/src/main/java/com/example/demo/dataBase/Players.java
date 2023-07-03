package com.example.demo.dataBase;

import com.example.demo.model.Map;
import com.example.demo.model.Player;
import com.example.demo.model.SystemGame;

import java.sql.*;
import java.util.ArrayList;

public class Players {
    private static Players instance;
    private Players() {

    }

    public static Players getInstance() {
        if (instance == null) {
            instance = new Players() {

            };
        }
        return instance;
    }
    public void saveUsers(String username,String password,int level,int wins,int losses,String mapId){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/game","server","1234");

            String SQLCom  =String.format("INSERT INTO `players` (`playerUsername`, `password`, `level`, `wins`, `losses`, `mapId`) VALUES ('%s', '%s', '%s', '%s', '%s', '%s')",username,password,level,wins,losses,mapId);
            Statement s = connection.prepareStatement(SQLCom);
            s.execute(SQLCom);
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<Player> getPlayers(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/game","server","1234");

            String SQLCom  ="SELECT `playerUsername`, `password`, `level`, `wins`, `losses`, `mapId` FROM `players`";
            Statement s = connection.prepareStatement(SQLCom);
            ResultSet resultSet =  s.executeQuery(SQLCom);
            ArrayList<Player> players = new ArrayList<>();

            while (resultSet.next()){
                String mapId=resultSet.getString("mapId");
                boolean find=false;
                for (Map map : SystemGame.maps){
                    if (map.getMapId().equals(mapId)){
                        find=true;
                        Player player=new Player(resultSet.getString("playerUsername"),resultSet.getString("password"),resultSet.getInt("level"),resultSet.getInt("wins"),resultSet.getInt("losses"),map);
                        players.add(player);
                        SystemGame.maps.remove(map);
                        SystemGame.selectedMaps.add(map);
                        break;
                    }
                }
                if (!find){
                    Player player=new Player(resultSet.getString("playerUsername"),resultSet.getString("password"),resultSet.getInt("level"),resultSet.getInt("wins"),resultSet.getInt("losses"),mapId);
                    players.add(player);
                }

            }
            connection.close();
            return players;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
