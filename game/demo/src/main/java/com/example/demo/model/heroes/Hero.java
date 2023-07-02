package com.example.demo.model.heroes;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public abstract class Hero{
    ImageView image;
    double health;
    int selectedNumber=0;
    Label number = new Label();

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
}
