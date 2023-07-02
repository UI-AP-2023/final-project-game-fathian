package com.example.demo.model.buildings;

import com.example.demo.HelloApplication;
import com.example.demo.model.buildings.Building;
import com.example.demo.model.buildings.BuildingCategory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URISyntaxException;

public class Cannon extends Building {
    public Cannon() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        this.image=new ImageView(new Image(helloApplication.getClass().getResource("images/Cannon21.png").toURI().toString()));
        this.buildingCategory= BuildingCategory.DEFENSE;
        this.health=2000;
        this.attackPower=10;
        this.attackRadius=10;
        this.speed=1;
    }
    double attackPower;
    double speed;
    int attackRadius;
}
