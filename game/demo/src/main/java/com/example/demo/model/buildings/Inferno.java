package com.example.demo.model.buildings;

import com.example.demo.HelloApplication;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URISyntaxException;

public class Inferno extends Building {
    public Inferno() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        this.image=new ImageView(new Image(helloApplication.getClass().getResource("Giga_Inferno14-5.png").toURI().toString()));
        this.buildingCategory= BuildingCategory.NORMAL;
        this.health=20;
    }
}
