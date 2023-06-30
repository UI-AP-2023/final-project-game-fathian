package com.example.demo.model;

import com.example.demo.HelloApplication;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URISyntaxException;

public class Hero4 extends Hero{
    public Hero4() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        this.image=new ImageView(new Image(helloApplication.getClass().getResource("Warrior_02__ATTACK_000.png").toURI().toString()));
        this.health=50;
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
