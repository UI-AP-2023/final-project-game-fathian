package com.example.demo.model.buildings;

import javafx.scene.image.ImageView;

public abstract class Building {
    ImageView image;
    BuildingCategory buildingCategory ;
    double health;

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public BuildingCategory getBuildingCategory() {
        return buildingCategory;
    }

    public void setBuildingCategory(BuildingCategory buildingCategory) {
        this.buildingCategory = buildingCategory;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}
