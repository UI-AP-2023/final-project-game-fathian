package com.example.demo.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Building {
    public Building(String urlImage,BuildingCategory  buildingCategory, double health, double attackPower) {
        image=new ImageView(new Image(urlImage));
        this.buildingCategory=buildingCategory;
        this.attackPower=attackPower;
        this.health=health;
    }
    ImageView image;
    BuildingCategory  buildingCategory ;
    double health;
    double attackPower;
}
