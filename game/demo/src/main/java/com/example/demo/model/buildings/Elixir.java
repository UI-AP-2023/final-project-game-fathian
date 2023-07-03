package com.example.demo.model.buildings;

import com.example.demo.HelloApplication;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URISyntaxException;

public class Elixir extends Building {
    public Elixir() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        this.setImage(new ImageView(new Image(helloApplication.getClass().getResource("images/Elixir_Storage16.png").toURI().toString())));
        this.setBuildingCategory( BuildingCategory.NORMAL);
        this.setHealth(100);
    }
}
