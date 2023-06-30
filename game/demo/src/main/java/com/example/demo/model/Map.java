package com.example.demo.model;

import javafx.scene.image.Image;
import java.util.ArrayList;

public class Map {
    private Image image;
    ArrayList<Building> buildings = new ArrayList<>();
    int level;
    int heroLimits;
    String mapId;


    public Map(String urlImage,int level,int heroLimits) {
        this.image = new Image(urlImage,true);
        this.level=level;
        this.heroLimits=heroLimits;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
