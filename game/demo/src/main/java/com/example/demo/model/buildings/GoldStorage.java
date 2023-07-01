package com.example.demo.model.buildings;

import com.example.demo.HelloApplication;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URISyntaxException;

public class GoldStorage extends Building {
    public GoldStorage() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        this.image=new ImageView(new Image(helloApplication.getClass().getResource("Gold_Storage16.png").toURI().toString()));
        this.buildingCategory= BuildingCategory.NORMAL;
        this.health=100;
    }
}
