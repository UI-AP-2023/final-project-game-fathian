package com.example.demo.model.heroes;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public abstract class Hero{
    private ImageView image;
    private double health;
    private double speed;
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    private int selectedNumber=0;
    private Label number = new Label();

    public Label getNumber() {
        return number;
    }

    public void setNumber(Label number) {
        this.number = number;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getSelectedNumber() {
        return selectedNumber;
    }

    public void setSelectedNumber(int selectedNumber) {
        this.selectedNumber = selectedNumber;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return  "health:           " + health +"\n\n"+
                "speed:            " + speed+"\n\n"+
                "power:            " + power;
    }
}
