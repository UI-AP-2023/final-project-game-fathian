package com.example.demo.model.buildings;

import com.example.demo.HelloApplication;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URISyntaxException;

public class XBow extends Building {
    public XBow() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        this.image=new ImageView(new Image(helloApplication.getClass().getResource("X-Bow10_Ground.png").toURI().toString()));
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
