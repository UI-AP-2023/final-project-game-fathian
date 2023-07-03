package com.example.demo.PageController;

import com.example.demo.HelloApplication;
import com.example.demo.model.Map;
import com.example.demo.model.buildings.GoldStorage;
import com.example.demo.model.buildings.WallStone;
import com.example.demo.model.buildings.WizardTower;
import com.example.demo.model.heroes.*;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

import java.net.URISyntaxException;

import static com.example.demo.model.SystemGame.heroSelectedAttack;

public class Map4PageController {
    private int numberAddedHero1=0;
    private int numberAddedHero2=0;
    private int numberAddedHero3=0;
    private int numberAddedHero4=0;
    private int numberAddedHero5=0;
    public void addBuildings(Map map) throws URISyntaxException {
        addWalls(map);
        addWizardTower(map);
        addGoldStorage(map);
        addBackGrand(map);
    }
    private void addWalls(Map map) throws URISyntaxException {
        WallStone wall1 = new WallStone();
        wall1.getImage().setId("wall1");
        wall1.getImage().setFitHeight(69.0);
        wall1.getImage().setFitWidth(61.0);
        wall1.getImage().setLayoutX(887.0);
        wall1.getImage().setLayoutY(330.0);
        wall1.getImage().setPickOnBounds(true);
        wall1.getImage().setPreserveRatio(true);

        WallStone wall2 = new WallStone();
        wall2.getImage().setId("wall2");
        wall2.getImage().setFitHeight(69.0);
        wall2.getImage().setFitWidth(61.0);
        wall2.getImage().setLayoutX(795.0);
        wall2.getImage().setLayoutY(389.0);
        wall2.getImage().setPickOnBounds(true);
        wall2.getImage().setPreserveRatio(true);

        WallStone wall3 = new WallStone();
        wall3.getImage().setId("wall3");
        wall3.getImage().setFitHeight(69.0);
        wall3.getImage().setFitWidth(61.0);
        wall3.getImage().setLayoutX(616.0);
        wall3.getImage().setLayoutY(234.0);
        wall3.getImage().setPickOnBounds(true);
        wall3.getImage().setPreserveRatio(true);

        WallStone wall4 = new WallStone();
        wall4.getImage().setId("wall4");
        wall4.getImage().setFitHeight(69.0);
        wall4.getImage().setFitWidth(61.0);
        wall4.getImage().setLayoutX(663.0);
        wall4.getImage().setLayoutY(205.0);
        wall4.getImage().setPickOnBounds(true);
        wall4.getImage().setPreserveRatio(true);

        WallStone wall5 = new WallStone();
        wall5.getImage().setId("wall5");
        wall5.getImage().setFitHeight(69.0);
        wall5.getImage().setFitWidth(61.0);
        wall5.getImage().setLayoutX(573.0);
        wall5.getImage().setLayoutY(259.0);
        wall5.getImage().setPickOnBounds(true);
        wall5.getImage().setPreserveRatio(true);

        WallStone wall6 = new WallStone();
        wall6.getImage().setId("wall6");
        wall6.getImage().setFitHeight(69.0);
        wall6.getImage().setFitWidth(61.0);
        wall6.getImage().setLayoutX(778.0);
        wall6.getImage().setLayoutY(210.0);
        wall6.getImage().setPickOnBounds(true);
        wall6.getImage().setPreserveRatio(true);

        WallStone wall7 = new WallStone();
        wall7.getImage().setId("wall7");
        wall7.getImage().setFitHeight(69.0);
        wall7.getImage().setFitWidth(61.0);
        wall7.getImage().setLayoutX(826.0);
        wall7.getImage().setLayoutY(239.0);
        wall7.getImage().setPickOnBounds(true);
        wall7.getImage().setPreserveRatio(true);

        WallStone wall8 = new WallStone();
        wall8.getImage().setId("wall8");
        wall8.getImage().setFitHeight(69.0);
        wall8.getImage().setFitWidth(61.0);
        wall8.getImage().setLayoutX(564.0);
        wall8.getImage().setLayoutY(320.0);
        wall8.getImage().setPickOnBounds(true);
        wall8.getImage().setPreserveRatio(true);

        WallStone wall9 = new WallStone();
        wall9.getImage().setId("wall9");
        wall9.getImage().setFitHeight(69.0);
        wall9.getImage().setFitWidth(61.0);
        wall9.getImage().setLayoutX(877.0);
        wall9.getImage().setLayoutY(278.0);
        wall9.getImage().setPickOnBounds(true);
        wall9.getImage().setPreserveRatio(true);

        WallStone wall10 = new WallStone();
        wall10.getImage().setId("wall10");
        wall10.getImage().setFitHeight(69.0);
        wall10.getImage().setFitWidth(61.0);
        wall10.getImage().setLayoutX(616.0);
        wall10.getImage().setLayoutY(355.0);
        wall10.getImage().setPickOnBounds(true);
        wall10.getImage().setPreserveRatio(true);

        WallStone wall11 = new WallStone();
        wall11.getImage().setId("wall11");
        wall11.getImage().setFitHeight(69.0);
        wall11.getImage().setFitWidth(61.0);
        wall11.getImage().setLayoutX(668.0);
        wall11.getImage().setLayoutY(389.0);
        wall11.getImage().setPickOnBounds(true);
        wall11.getImage().setPreserveRatio(true);

        WallStone wall12 = new WallStone();
        wall12.getImage().setId("wall12");
        wall12.getImage().setFitHeight(69.0);
        wall12.getImage().setFitWidth(61.0);
        wall12.getImage().setLayoutX(840.0);
        wall12.getImage().setLayoutY(360.0);
        wall12.getImage().setPickOnBounds(true);
        wall12.getImage().setPreserveRatio(true);

        map.getBuildings().add(wall1);
        map.getBuildings().add(wall2);
        map.getBuildings().add(wall3);
        map.getBuildings().add(wall4);
        map.getBuildings().add(wall5);
        map.getBuildings().add(wall6);
        map.getBuildings().add(wall7);
        map.getBuildings().add(wall8);
        map.getBuildings().add(wall9);
        map.getBuildings().add(wall10);
        map.getBuildings().add(wall11);
        map.getBuildings().add(wall12);
    }
    private void addWizardTower(Map map) throws URISyntaxException {
        WizardTower wizardTower1 = new WizardTower();
        wizardTower1.getImage().setId("wizardTower1");
        wizardTower1.getImage().setFitHeight(82.0);
        wizardTower1.getImage().setFitWidth(106.0);
        wizardTower1.getImage().setLayoutX(512.0);
        wizardTower1.getImage().setLayoutY(256.0);
        wizardTower1.getImage().setPickOnBounds(true);
        wizardTower1.getImage().setPreserveRatio(true);
        map.getBuildings().add(wizardTower1);

        WizardTower wizardTower2 = new WizardTower();
        wizardTower2.getImage().setId("wizardTower2");
        wizardTower2.getImage().setFitHeight(82.0);
        wizardTower2.getImage().setFitWidth(106.0);
        wizardTower2.getImage().setLayoutX(729.0);
        wizardTower2.getImage().setLayoutY(149.0);
        wizardTower2.getImage().setPickOnBounds(true);
        wizardTower2.getImage().setPreserveRatio(true);
        map.getBuildings().add(wizardTower2);

        WizardTower wizardTower3 = new WizardTower();
        wizardTower3.getImage().setId("wizardTower3");
        wizardTower3.getImage().setFitHeight(82.0);
        wizardTower3.getImage().setFitWidth(106.0);
        wizardTower3.getImage().setLayoutX(729.0);
        wizardTower3.getImage().setLayoutY(389.0);
        wizardTower3.getImage().setPickOnBounds(true);
        wizardTower3.getImage().setPreserveRatio(true);
        map.getBuildings().add(wizardTower3);

        WizardTower wizardTower4 = new WizardTower();
        wizardTower4.getImage().setId("wizardTower4");
        wizardTower4.getImage().setFitHeight(82.0);
        wizardTower4.getImage().setFitWidth(106.0);
        wizardTower4.getImage().setLayoutX(927.0);
        wizardTower4.getImage().setLayoutY(279.0);
        wizardTower4.getImage().setPickOnBounds(true);
        wizardTower4.getImage().setPreserveRatio(true);
        map.getBuildings().add(wizardTower4);
    }
    private void addGoldStorage(Map map) throws URISyntaxException {

        GoldStorage goldStorage= new GoldStorage();
        goldStorage.getImage().setId("goldStorage");
        goldStorage.getImage().setFitHeight(157.0);
        goldStorage.getImage().setFitWidth(146.0);
        goldStorage.getImage().setLayoutX(690.0);
        goldStorage.getImage().setLayoutY(231.0);
        goldStorage.getImage().setPickOnBounds(true);
        goldStorage.getImage().setPreserveRatio(true);
        map.getBuildings().add(goldStorage);
    }
    private void addBackGrand(Map map4) throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        map4.getBackGrand().setFitWidth(1550);
        map4.getBackGrand().setFitHeight(800);
        map4.getBackGrand().setImage(new Image(helloApplication.getClass().getResource("images/map4.png").toURI().toString()));
        map4.getBackGrand().setPickOnBounds(true);
        map4.getBackGrand().setOnMouseClicked(event -> {
            if (heroSelectedAttack!=null){
                try {
                    if (heroSelectedAttack instanceof Hero1){
                        if (numberAddedHero1 < heroSelectedAttack.getSelectedNumber()){
                            numberAddedHero1++;
                            heroSelectedAttack=new Hero1();
                        }
                        else {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setContentText("you cant use this hero");
                            alert.show();
                        }
                    }
                    else if (heroSelectedAttack instanceof Hero2){
                        if (numberAddedHero2 < heroSelectedAttack.getSelectedNumber()){
                            numberAddedHero2++;
                            heroSelectedAttack=new Hero2();
                        }
                        else {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setContentText("you cant use this hero");
                            alert.show();
                        }
                    }
                    else if (heroSelectedAttack instanceof Hero3){
                        if (numberAddedHero3 < heroSelectedAttack.getSelectedNumber()){
                            numberAddedHero3++;
                            heroSelectedAttack=new Hero3();
                        }
                        else {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setContentText("you cant use this hero");
                            alert.show();
                        }
                    }
                    else if (heroSelectedAttack instanceof Hero4)
                    {
                        if (numberAddedHero4 < heroSelectedAttack.getSelectedNumber()){
                            numberAddedHero4++;
                            heroSelectedAttack=new Hero4();
                        }
                        else {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setContentText("you cant use this hero");
                            alert.show();
                        }
                    }
                    else{
                        if (numberAddedHero5 < heroSelectedAttack.getSelectedNumber()){
                            numberAddedHero5++;
                            heroSelectedAttack=new Hero5();
                        }
                        else {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setContentText("you cant use this hero");
                            alert.show();
                        }
                    }
                } catch (URISyntaxException e) {
                    throw new RuntimeException(e);
                }
                new Thread((Runnable) heroSelectedAttack).start();
                heroSelectedAttack.getImage().setLayoutX(event.getX()-heroSelectedAttack.getImage().getFitWidth()/2);
                heroSelectedAttack.getImage().setLayoutY(event.getY()-heroSelectedAttack.getImage().getFitHeight() /2);
                heroSelectedAttack.getImage().setPickOnBounds(true);
                heroSelectedAttack.getImage().setPreserveRatio(true);
                ((AnchorPane)((Node)event.getSource()).getParent()).getChildren().add(heroSelectedAttack.getImage());
            }
        });
    }
}
