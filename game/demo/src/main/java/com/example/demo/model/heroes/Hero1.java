package com.example.demo.model.heroes;

import com.example.demo.HelloApplication;
import com.example.demo.SystemGame;
import com.example.demo.model.buildings.Building;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;

import java.net.URISyntaxException;

public class Hero1 extends Hero {
    public Hero1() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();

        this.number.setId("hero1number");
        this.number.setAlignment(Pos.CENTER);
        this.number.setPrefHeight(31.0);
        this.number.setPrefWidth(171.0);
        this.number.setLayoutX(50.0);
        this.number.setLayoutY(720.0);
        this.number.setPickOnBounds(true);

        this.image=new ImageView(new Image(helloApplication.getClass().getResource("1_FAIRY.png").toURI().toString()));
        this.image.setId("hero1");
        this.image.setFitHeight(108.0);
        this.image.setFitWidth(77.0);
        this.image.setLayoutX(36.0);
        this.image.setLayoutY(559.0);
        this.image.setPickOnBounds(true);
        this.image.setPreserveRatio(true);
        this.image.setOnMouseClicked(event -> {
            SystemGame.heroSelectedAttack=this;
        });
        this.health=200;
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

    @Override
    public void run(){
        while (true){
            Building building=minDistance();
        }
    }
    private Building minDistance(){
        double minDistance=1550;
        Building minDistanceBuilding = null;
        for (Building building : SystemGame.selectedMap.getBuildings()){
            if (Math.sqrt(Math.pow(building.getImage().getX()-this.image.getX(),2)+Math.pow(building.getImage().getY()-this.image.getY(),2))<minDistance){
                minDistance=Math.sqrt(Math.pow(building.getImage().getX()-this.image.getX(),2)+Math.pow(building.getImage().getY()-this.image.getY(),2));
                minDistanceBuilding=building;
            }
        }
        return minDistanceBuilding;
    }
}
