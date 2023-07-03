package com.example.demo.model.buildings;

import com.example.demo.HelloApplication;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

import java.net.URISyntaxException;

public class HiddenTesla extends Building {
    public HiddenTesla() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        this.setImage(new ImageView(new Image(helloApplication.getClass().getResource("images/Hidden_Tesla14.png").toURI().toString())));
        this.setBuildingCategory(BuildingCategory.DEFENSE);
        this.setHealth(500);
        this.attackPower=10;
        this.attackRadius=10;
        this.speed=1000;
        this.circle.setVisible(false);
    }
    private double attackPower;
    private double speed;
    private int attackRadius;
    private Circle circle=new Circle();

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public double getSpeed() {
        return speed;
    }

    public int getAttackRadius() {
        return attackRadius;
    }
}
