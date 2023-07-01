package com.example.demo.model.buildings;

import com.example.demo.HelloApplication;
import com.example.demo.model.buildings.Building;
import com.example.demo.model.buildings.BuildingCategory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URISyntaxException;

public class SpellTower extends Building {
    public SpellTower() throws URISyntaxException {
        HelloApplication helloApplication= new HelloApplication();
        this.image=new ImageView(new Image(helloApplication.getClass().getResource("Spell_Tower3_Rage.png").toURI().toString()));
        this.buildingCategory= BuildingCategory.NORMAL;
        this.health=500;
    }
}
