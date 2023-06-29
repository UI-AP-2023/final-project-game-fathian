package com.example.demo;

import com.example.demo.model.Map;

import java.util.ArrayList;

public class SystemGame {
    public  static ArrayList<Map> maps = new ArrayList<>();
    public SystemGame(){
        Map map1 = new Map("",5,50);
        Map map2 = new Map("",6,50);
        Map map3 = new Map("",7,50);
        Map map4 = new Map("",8,50);
        Map map5 = new Map("",9,50);
        maps.add(map1);
        maps.add(map2);
        maps.add(map3);
        maps.add(map4);
        maps.add(map5);
    }

}
