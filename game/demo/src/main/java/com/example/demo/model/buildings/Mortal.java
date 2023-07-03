package com.example.demo.model.buildings;

import com.example.demo.HelloApplication;
import com.example.demo.model.buildings.Building;
import com.example.demo.model.buildings.BuildingCategory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

import java.net.URISyntaxException;

public class Mortal extends Building {
    public Mortal() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        this.setImage(new ImageView(new Image(helloApplication.getClass().getResource("images/Mortar15.png").toURI().toString())));
        this.setBuildingCategory(BuildingCategory.DEFENSE);
        this.setHealth(100);
        this.attackPower=10;
        this.attackRadius=10;
        this.speed=1;
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
