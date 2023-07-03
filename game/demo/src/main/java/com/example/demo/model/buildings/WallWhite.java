package com.example.demo.model.buildings;

import com.example.demo.HelloApplication;
import com.example.demo.model.buildings.Building;
import com.example.demo.model.buildings.BuildingCategory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URISyntaxException;

public class WallWhite extends Building {
    public WallWhite() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        this.setImage(new ImageView(new Image(helloApplication.getClass().getResource("images/Wall12.png").toURI().toString())));
        this.setBuildingCategory(BuildingCategory.NORMAL);
        this.setHealth(30);
    }

}
