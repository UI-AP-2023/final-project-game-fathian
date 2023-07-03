package com.example.demo.model;

import com.example.demo.model.buildings.Building;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class Map {
    private Image image;
    private ArrayList<Building> buildings = new ArrayList<>();
    private int level;
    private int heroLimits;
    private String mapId;
    public Map(String urlImage, int level, int heroLimits) {
        this.image = new Image(urlImage,true);
        this.level=level;
        this.heroLimits=heroLimits;
        mapId="";
    }
    private ImageView backGrand = new ImageView();

    public ImageView getBackGrand() {
        return backGrand;
    }

    public void setBackGrand(ImageView backGrand) {
        this.backGrand = backGrand;
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

    public int getHeroLimits() {
        return heroLimits;
    }

    public void setHeroLimits(int heroLimits) {
        this.heroLimits = heroLimits;
    }
    public String getMapId() {
        return mapId;
    }

    public void setMapId(String mapId) {
        this.mapId = mapId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
