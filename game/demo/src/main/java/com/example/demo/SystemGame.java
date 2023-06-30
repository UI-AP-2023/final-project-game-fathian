package com.example.demo;

import com.example.demo.model.*;

import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class SystemGame {
    public static Player player;
    public  static ArrayList<Map> maps = new ArrayList<>();
    public  static ArrayList<Map> selectedMaps = new ArrayList<>();
    public static ArrayList<Player> players = new ArrayList<>();
    public SystemGame() throws URISyntaxException {

    }
    private void addBuildings(Map map) throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        Wall wall = new Wall(helloApplication.getClass().getResource("Wall12.png").toURI().toString(), BuildingCategory.NORMAL,100,15.5);
        Tower tower = new Tower(helloApplication.getClass().getResource("Spell_Tower3_Rage.png").toURI().toString(), BuildingCategory.NORMAL,100,15.5);
        SpellTower spellTower = new SpellTower(helloApplication.getClass().getResource("Spell_Tower3_Rage.png").toURI().toString(), BuildingCategory.NORMAL,100,15.5);
        GoldStorage goldStorage= new GoldStorage(helloApplication.getClass().getResource("Gold_Storage16.png").toURI().toString(), BuildingCategory.NORMAL,100,15.5);
        Mortal mortal = new Mortal(helloApplication.getClass().getResource("Mortar15.png").toURI().toString(), BuildingCategory.NORMAL,100,15.5);
        map.getBuildings().add(wall);
        map.getBuildings().add(tower);
        map.getBuildings().add(spellTower);
        map.getBuildings().add(goldStorage);
        map.getBuildings().add(mortal);
    }
    public void addMaps() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        Map map1 = new Map(helloApplication.getClass().getResource("mapb1.png").toURI().toString(),5,50);
        Map map2 = new Map(helloApplication.getClass().getResource("mapb2.png").toURI().toString(),6,50);
        Map map3 = new Map(helloApplication.getClass().getResource("mapb3.png").toURI().toString(),7,50);
        Map map4 = new Map(helloApplication.getClass().getResource("mapb4.png").toURI().toString(),8,50);

        addBuildings(map1);
        addBuildings(map2);
        addBuildings(map3);
        addBuildings(map4);

        maps.add(map1);
        maps.add(map2);
        maps.add(map3);
        maps.add(map4);
    }

}
