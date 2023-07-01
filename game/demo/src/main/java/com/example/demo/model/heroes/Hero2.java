package com.example.demo.model.heroes;

import com.example.demo.HelloApplication;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URISyntaxException;

public class Hero2 extends Hero {
    public Hero2() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();

        this.number.setId("hero2number");
        this.number.setAlignment(Pos.CENTER);
        this.number.setPrefHeight(31.0);
        this.number.setPrefWidth(171.0);
        this.number.setLayoutX(243.0);
        this.number.setLayoutY(720.0);
        this.number.setPickOnBounds(true);

        this.image=new ImageView(new Image(helloApplication.getClass().getResource("2_FAIRY.png").toURI().toString()));
        this.image.setId("hero2");
        this.image.setFitHeight(167.0);
        this.image.setFitWidth(147.0);
        this.image.setLayoutX(237.0);
        this.image.setLayoutY(559.0);
        this.image.setPickOnBounds(true);
        this.image.setPreserveRatio(true);
        this.health=100;
    }
    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}
