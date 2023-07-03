package com.example.demo.model.buildings;

import com.example.demo.HelloApplication;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URISyntaxException;

public class WizardTower extends Building {
    public WizardTower() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        this.setImage(new ImageView(new Image(helloApplication.getClass().getResource("images/Wizard_Tower15.png").toURI().toString())));
        this.setBuildingCategory(BuildingCategory.NORMAL);
        this.setHealth(300);
    }
}
