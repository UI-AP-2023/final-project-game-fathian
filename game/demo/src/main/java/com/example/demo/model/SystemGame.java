package com.example.demo.model;

import com.example.demo.HelloApplication;
import com.example.demo.PageController.Map1PageController;
import com.example.demo.PageController.Map2PageController;
import com.example.demo.PageController.Map3PageController;
import com.example.demo.PageController.Map4PageController;
import com.example.demo.model.heroes.*;

import java.net.URISyntaxException;
import java.util.ArrayList;

public class SystemGame {
    public static Player player;
    public  static Map selectedMap;
    public static Hero heroSelectedAttack;
    public  static ArrayList<Map> maps = new ArrayList<>();
    public  static ArrayList<Hero> heroes = new ArrayList<>();

    public  static ArrayList<Hero> selectedHeroes = new ArrayList<>();
    public  static ArrayList<Map> selectedMaps = new ArrayList<>();
    public void addMaps() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        Map map1 = new Map(helloApplication.getClass().getResource("images/mapb1.png").toURI().toString(),1,50);
        Map map2 = new Map(helloApplication.getClass().getResource("images/mapb2.png").toURI().toString(),2,50);
        Map map3 = new Map(helloApplication.getClass().getResource("images/mapb3.png").toURI().toString(),3,50);
        Map map4 = new Map(helloApplication.getClass().getResource("images/mapb4.png").toURI().toString(),1,50);

        Map1PageController map11 = new Map1PageController();
        map11.addBuildings(map1);
        Map2PageController map12 = new Map2PageController();
        map12.addBuildings(map2);
        Map3PageController map13 = new Map3PageController();
        map13.addBuildings(map3);
        Map4PageController map14 = new Map4PageController();
        map14.addBuildings(map4);

        map1.setMapId("fathian");
        map2.setMapId("fatemeZara");
        selectedMaps.add(map1);
        selectedMaps.add(map2);
        maps.add(map3);
        maps.add(map4);
    }
    public static void addHero() throws URISyntaxException {
        Hero1 hero1 = new Hero1();
        Hero2 hero2 = new Hero2();
        Hero3 hero3 = new Hero3();
        Hero4 hero4 = new Hero4();
        Hero5 hero5 = new Hero5();

        SystemGame.heroes.add(hero1);
        SystemGame.heroes.add(hero2);
        SystemGame.heroes.add(hero3);
        SystemGame.heroes.add(hero4);
        SystemGame.heroes.add(hero5);
    }

}
