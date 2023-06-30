package com.example.demo.model;

import com.example.demo.HelloApplication;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URISyntaxException;

public class Hero3 extends Hero{
    public Hero3() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        this.image=new ImageView(new Image(helloApplication.getClass().getResource("Warrior_01__ATTACK_000.png").toURI().toString()));
        this.health=300;
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
