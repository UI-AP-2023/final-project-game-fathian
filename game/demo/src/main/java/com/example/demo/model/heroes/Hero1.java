package com.example.demo.model.heroes;

import com.example.demo.HelloApplication;
import com.example.demo.model.SystemGame;
import com.example.demo.model.buildings.Building;
import javafx.animation.TranslateTransition;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.net.URISyntaxException;
import java.util.concurrent.atomic.AtomicReference;

import static java.lang.Thread.sleep;

public class Hero1 extends Hero implements Runnable {
    public Hero1() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();

        this.getNumber().setId("hero1number");
        this.getNumber().setAlignment(Pos.CENTER);
        this.getNumber().setPrefHeight(31.0);
        this.getNumber().setPrefWidth(171.0);
        this.getNumber().setLayoutX(50.0);
        this.getNumber().setLayoutY(740.0);
        this.getNumber().setPickOnBounds(true);

        this.setImage(new ImageView(new Image(helloApplication.getClass().getResource("images/1_FAIRY.png").toURI().toString())));
        this.getImage().setId("hero1");
        this.getImage().setFitHeight(87.0);
        this.getImage().setFitWidth(196.0);
        this.getImage().setLayoutX(75.0);
        this.getImage().setLayoutY(647.0);
        this.getImage().setPickOnBounds(true);
        this.getImage().setPreserveRatio(true);
        this.getImage().setOnMouseClicked(event -> {
            SystemGame.heroSelectedAttack=this;
        });
        this.setHealth(200);
        this.setPower(10);
        this.setSpeed(1000);
    }
    @Override
    public void run(){
        AtomicReference<Double> layoutX= new AtomicReference<>(this.getImage().getBoundsInParent().getMinX());
        AtomicReference<Double> layoutY = new AtomicReference<>(this.getImage().getBoundsInParent().getMinY());
        while (true){
            synchronized (this){
                Building building= findMinDistance();
                System.out.println(building.getImage().getId());
                TranslateTransition translateTransition = new TranslateTransition();
                translateTransition.setNode(this.getImage());
                translateTransition.setDuration(Duration.millis(this.getSpeed()));
                if(building.getImage().getBoundsInParent().getMaxX()<layoutX.get()){
                    translateTransition.setByX(building.getImage().getBoundsInParent().getMaxX()- layoutX.get());
                }else if(building.getImage().getBoundsInParent().getMinX()>this.getImage().getBoundsInParent().getMaxX()){
                    translateTransition.setByX(building.getImage().getBoundsInParent().getMinX()- this.getImage().getBoundsInParent().getMaxX());
                }
                if(building.getImage().getBoundsInParent().getMaxY()<layoutY.get()){
                    translateTransition.setByY(building.getImage().getBoundsInParent().getMaxY()- layoutY.get());
                }else if(building.getImage().getBoundsInParent().getMinY()>this.getImage().getBoundsInParent().getMaxY()){
                    translateTransition.setByY(building.getImage().getBoundsInParent().getMinY()- this.getImage().getBoundsInParent().getMaxY());
                }

                translateTransition.setOnFinished(event -> {
                    layoutX.set(building.getImage().getBoundsInParent().getMinX());
                    layoutY.set(building.getImage().getBoundsInParent().getMinY());
                });
                translateTransition.play();
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                while (this.getHealth()>0 && building.getHealth()>0){
                    try {
                        sleep(10000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    building.setHealth(building.getHealth()-this.getPower());
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
                if (Math.sqrt(Math.pow(building.getImage().getLayoutX()-this.getImage().getLayoutX(),2)+Math.pow(building.getImage().getLayoutY()-this.getImage().getLayoutY(),2))<minDistance){
                    minDistance=Math.sqrt(Math.pow(building.getImage().getLayoutX()-this.getImage().getLayoutX(),2)+Math.pow(building.getImage().getLayoutY()-this.getImage().getLayoutY(),2));
                    minDistanceBuilding=building;
                }
            }
            return minDistanceBuilding;
        }
    }

}
