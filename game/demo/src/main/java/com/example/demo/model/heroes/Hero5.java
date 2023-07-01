package com.example.demo.model.heroes;

import com.example.demo.HelloApplication;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URISyntaxException;

public class Hero5 extends Hero {
    public Hero5() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();

        this.number.setId("hero5number");
        this.number.setAlignment(Pos.CENTER);
        this.number.setPrefHeight(31.0);
        this.number.setPrefWidth(171.0);
        this.number.setLayoutX(911.0);
        this.number.setLayoutY(720.0);
        this.number.setPickOnBounds(true);

        this.image=new ImageView(new Image(helloApplication.getClass().getResource("Warrior_03__ATTACK_000.png").toURI().toString()));
        this.image.setId("hero5");
        this.image.setFitHeight(167.0);
        this.image.setFitWidth(276.0);
        this.image.setLayoutX(858.0);
        this.image.setLayoutY(537.0);
        this.image.setPickOnBounds(true);
        this.image.setPreserveRatio(true);
        this.health=600;
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
