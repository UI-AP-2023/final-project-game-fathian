package com.example.demo.model.heroes;

import com.example.demo.HelloApplication;
import com.example.demo.model.SystemGame;
import com.example.demo.model.buildings.Building;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URISyntaxException;

import static java.lang.Thread.sleep;

public class Hero1 extends Hero implements Runnable {
    public Hero1() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();

        this.number.setId("hero1number");
        this.number.setAlignment(Pos.CENTER);
        this.number.setPrefHeight(31.0);
        this.number.setPrefWidth(171.0);
        this.number.setLayoutX(50.0);
        this.number.setLayoutY(720.0);
        this.number.setPickOnBounds(true);

        this.image=new ImageView(new Image(helloApplication.getClass().getResource("images/1_FAIRY.png").toURI().toString()));
        this.image.setId("hero1");
        this.image.setFitHeight(108.0);
        this.image.setFitWidth(77.0);
        this.image.setLayoutX(36.0);
        this.image.setLayoutY(509.0);
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
            synchronized (this){
                Building building= findMinDistance();
                System.out.println(building.getImage().getId());
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
//                TranslateTransition translateTransition = new TranslateTransition();
//                translateTransition.setNode(this.image);
//                translateTransition.setDuration(Duration.millis(5000));
//                translateTransition.setByX(building.getImage().getLayoutX()-this.image.getLayoutX());
//                translateTransition.setByY(building.getImage().getLayoutY()-this.image.getLayoutY());
//                translateTransition.play();
//                try {
//                    sleep(10000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                image.setLayoutX(building.getImage().getLayoutX()-building.getImage().getFitWidth());
                image.setLayoutY(building.getImage().getLayoutY()-building.getImage().getFitHeight());
                while (this.getHealth()>0 && building.getHealth()>0){
                    try {
                        sleep(10000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    building.setHealth(building.getHealth()-10);
                }
                building.getImage().setVisible(false);
                SystemGame.selectedMap.getBuildings().remove(building);
            }
        }
    }
    private Building findMinDistance(){
        synchronized(this){
            double minDistance=1550;
            Building minDistanceBuilding = null;
            for (Building building : SystemGame.selectedMap.getBuildings()){
                if (Math.sqrt(Math.pow(building.getImage().getLayoutX()-this.image.getLayoutX(),2)+Math.pow(building.getImage().getLayoutY()-this.image.getLayoutY(),2))<minDistance){
                    minDistance=Math.sqrt(Math.pow(building.getImage().getLayoutX()-this.image.getLayoutX(),2)+Math.pow(building.getImage().getLayoutY()-this.image.getLayoutY(),2));
                    System.out.println(minDistance);
                    minDistanceBuilding=building;
                }
            }
            return minDistanceBuilding;
        }
    }
}
