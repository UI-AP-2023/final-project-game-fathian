package com.example.demo;

import com.example.demo.model.buildings.Building;
import com.example.demo.model.heroes.Hero;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;;

import java.net.URISyntaxException;

public class ClashOfClans{
    public void start(Stage stage) throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setPrefWidth(1550);
        anchorPane.setPrefHeight(800);
        anchorPane.setVisible(true);
        anchorPane.getChildren().add(SystemGame.selectedMap.getBackGrand());
        for (Building building:SystemGame.selectedMap.getBuildings()){
            anchorPane.getChildren().add(building.getImage());
        }
        ImageView backGrand= new ImageView(new Image(helloApplication.getClass().getResource("images/download1.png").toURI().toString()));
        backGrand.setFitHeight(269);
        backGrand.setFitWidth(1550);
        backGrand.setLayoutY(531);
        backGrand.setPickOnBounds(true);
        anchorPane.getChildren().add(backGrand);
//        DraggableMaker draggableMaker = new DraggableMaker();
        for (Hero hero:SystemGame.selectedHeroes){
            hero.getNumber().setText(String.valueOf(hero.getSelectedNumber()));
            anchorPane.getChildren().add(hero.getNumber());
            anchorPane.getChildren().add(hero.getImage());
//            draggableMaker.makeDraggable(hero);
        }
        Scene scene=new Scene(anchorPane,1550,800);
//        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("clash Of Clans");
        stage.show();


    }
}
