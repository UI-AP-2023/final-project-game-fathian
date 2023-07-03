package com.example.demo.model.heroes;

import com.example.demo.HelloApplication;
import com.example.demo.model.SystemGame;
import com.example.demo.model.buildings.Building;
import javafx.animation.PathTransition;
import javafx.animation.TranslateTransition;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;

import java.net.URISyntaxException;
import java.util.concurrent.atomic.AtomicReference;

import static java.lang.Thread.sleep;

public class Hero5 extends Hero implements Runnable {
    public Hero5() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();

        this.getNumber().setId("hero5number");
        this.getNumber().setAlignment(Pos.CENTER);
        this.getNumber().setPrefHeight(100.0);
        this.getNumber().setPrefWidth(171.0);
        this.getNumber().setLayoutX(858.0);
        this.getNumber().setLayoutY(710.0);
        this.getNumber().setPickOnBounds(true);

        this.setImage(new ImageView(new Image(helloApplication.getClass().getResource("images/Warrior_03__ATTACK_000.png").toURI().toString())));
        this.getImage().setId("hero5");
        this.getImage().setFitHeight(87.0);
        this.getImage().setFitWidth(196.0);
        this.getImage().setLayoutX(858.0);
        this.getImage().setLayoutY(647.0);
        this.getImage().setPickOnBounds(true);
        this.getImage().setPreserveRatio(true);
        this.getImage().setOnMouseClicked(event -> {
            SystemGame.heroSelectedAttack=this;
        });
        this.setHealth(60);
        this.setPower(3);
        this.setSpeed(1000);
        this.radius=50;
    }
    private int radius;
    private ImageView circle;

    public ImageView getCircle2() {
        return circle2;
    }

    public void setCircle2(ImageView circle2) {
        this.circle2 = circle2;
    }

    private ImageView circle2;

    public void setCircle(ImageView circle) {
        this.circle = circle;
    }

    public ImageView getCircle() {
        return circle;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void run(){
        while (true){
            AtomicReference<Double> layoutX= new AtomicReference<>(this.getImage().getBoundsInParent().getCenterX());
            AtomicReference<Double> layoutY = new AtomicReference<>(this.getImage().getBoundsInParent().getCenterY());
            AtomicReference<Double> layoutCircleX= new AtomicReference<>(circle.getBoundsInParent().getCenterX());
            AtomicReference<Double> layoutCircleY = new AtomicReference<>(circle.getBoundsInParent().getCenterY());
            synchronized (this){
                Building building= findMinDistance();
                System.out.println(building.getImage().getId());

                circle.setVisible(false);
                TranslateTransition translateTransition = new TranslateTransition();
                translateTransition.setNode(this.getImage());
                translateTransition.setDuration(Duration.millis(this.getSpeed()));
                if(building.getImage().getBoundsInParent().getMaxX()<layoutX.get()-this.getRadius()){
                    translateTransition.setByX(building.getImage().getBoundsInParent().getMaxX()- layoutX.get()+this.getRadius());
                }else if(building.getImage().getBoundsInParent().getMinX()>layoutX.get()+this.getRadius()){
                    translateTransition.setByX(building.getImage().getBoundsInParent().getMinX()-layoutX.get()-this.getRadius());
                }
                if(building.getImage().getBoundsInParent().getMinY()>layoutY.get()+this.getRadius()){
                    translateTransition.setByY(building.getImage().getBoundsInParent().getMinY()-layoutY.get()-this.getRadius());
                }else if(building.getImage().getBoundsInParent().getMaxY()<layoutY.get()-this.getRadius()){
                    translateTransition.setByY(building.getImage().getBoundsInParent().getMaxY()-layoutY.get()+this.getRadius());
                }
                translateTransition.setOnFinished(event -> {
                    layoutX.set(this.getImage().getBoundsInParent().getCenterX());
                    layoutY.set(this.getImage().getBoundsInParent().getCenterY());
                });
                translateTransition.play();

                ///***************************************************************************************************
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(layoutX);
                TranslateTransition ball = new TranslateTransition();
                ball.setNode(this.circle);
                ball.setDuration(Duration.millis(this.getSpeed()));
                ball.setByX(layoutX.get()- layoutCircleX.get());
                ball.setByY(layoutY.get()- layoutCircleY.get());
                ball.setOnFinished(event -> {
                    layoutCircleX.set(circle.getBoundsInParent().getCenterX());
                    layoutCircleY.set(circle.getBoundsInParent().getCenterY());
                });
                ball.play();

                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(layoutX);
                System.out.println(layoutCircleX);
                double vX=layoutCircleX.get();
                double vY=layoutCircleY.get();

                TranslateTransition ttB = new TranslateTransition();
                ttB.setNode(circle);
                ttB.setDuration(Duration.millis(500));
                ttB.setCycleCount(1);
                ttB.setByX(building.getImage().getBoundsInParent().getCenterX()-layoutCircleX.get());
                ttB.setByY(building.getImage().getBoundsInParent().getCenterY()-layoutCircleY.get());
                ttB.setOnFinished(event -> {
                    layoutCircleX.set(circle.getBoundsInParent().getCenterX());
                    layoutCircleY.set(circle.getBoundsInParent().getCenterY());
                });
                ttB.play();
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                while (this.getHealth()>0 && building.getHealth()>0){
                    circle2.setVisible(true);
                    Path path = new Path();
                    MoveTo move = new MoveTo(vX,vY);
                    LineTo line = new LineTo(layoutCircleX.get(),layoutCircleY.get());
                    path.getElements().addAll(move,line);
                    PathTransition pathTransition = new PathTransition();
                    pathTransition.setDuration(Duration.seconds(0.5));
                    pathTransition.setCycleCount(5);
                    pathTransition.setNode(circle2);
                    pathTransition.setPath(path);
                    pathTransition.play();
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    building.setHealth(building.getHealth()-this.getPower());
                }
                circle2.setVisible(false);
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
    @Override
    public String toString() {
        return  "health:           " + getHealth() +"\n\n"+
                "speed:            " + getSpeed()+"\n\n"+
                "power:            " + getPower()+"\n\n"+
                "radius:           " + radius;
    }
}
