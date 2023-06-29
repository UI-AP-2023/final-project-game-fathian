package com.example.demo.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class Map {
    ImageView image;
    ArrayList<Building> buildings = new ArrayList<>();
    int level;
    int heroLimits;


    public Map(String urlImage,int level,int heroLimits) {
        this.image = new ImageView(new Image(urlImage));
        this.level=level;
        this.heroLimits=heroLimits;
    }
}
