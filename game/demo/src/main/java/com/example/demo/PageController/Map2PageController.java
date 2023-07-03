package com.example.demo.PageController;

import com.example.demo.HelloApplication;
import com.example.demo.model.Map;
import com.example.demo.model.buildings.*;
import com.example.demo.model.heroes.*;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

import java.net.URISyntaxException;

import static com.example.demo.model.SystemGame.heroSelectedAttack;

public class Map2PageController {
    private int numberAddedHero1=0;
    private int numberAddedHero2=0;
    private int numberAddedHero3=0;
    private int numberAddedHero4=0;
    private int numberAddedHero5=0;
    public void addBuildings(Map map) throws URISyntaxException {
        addWalls(map);
        addSpellTower(map);
        addGigaInferno(map);
        addHiddenTesla(map);
        addXBow(map);
        addBackGrand(map);
    }
    private void addWalls(Map map) throws URISyntaxException {
        WallStone wall1 = new WallStone();
        wall1.getImage().setId("wall1");
        wall1.getImage().setFitHeight(65.0);
        wall1.getImage().setFitWidth(86.0);
        wall1.getImage().setLayoutX(467.0);
        wall1.getImage().setLayoutY(287.0);
        wall1.getImage().setPickOnBounds(true);
        wall1.getImage().setPreserveRatio(true);

        WallStone wall2 = new WallStone();
        wall2.getImage().setId("wall2");
        wall2.getImage().setFitHeight(65.0);
        wall2.getImage().setFitWidth(86.0);
        wall2.getImage().setLayoutX(536.0);
        wall2.getImage().setLayoutY(222.0);
        wall2.getImage().setPickOnBounds(true);
        wall2.getImage().setPreserveRatio(true);

        WallStone wall3 = new WallStone();
        wall3.getImage().setId("wall3");
        wall3.getImage().setFitHeight(65.0);
        wall3.getImage().setFitWidth(86.0);
        wall3.getImage().setLayoutX(662.0);
        wall3.getImage().setLayoutY(445.0);
        wall3.getImage().setPickOnBounds(true);
        wall3.getImage().setPreserveRatio(true);

        WallStone wall4 = new WallStone();
        wall4.getImage().setId("wall4");
        wall4.getImage().setFitHeight(65.0);
        wall4.getImage().setFitWidth(86.0);
        wall4.getImage().setLayoutX(628.0);
        wall4.getImage().setLayoutY(222.0);
        wall4.getImage().setPickOnBounds(true);
        wall4.getImage().setPreserveRatio(true);

        WallStone wall5 = new WallStone();
        wall5.getImage().setId("wall5");
        wall5.getImage().setFitHeight(65.0);
        wall5.getImage().setFitWidth(86.0);
        wall5.getImage().setLayoutX(570.0);
        wall5.getImage().setLayoutY(388.0);
        wall5.getImage().setPickOnBounds(true);
        wall5.getImage().setPreserveRatio(true);

        WallStone wall6 = new WallStone();
        wall6.getImage().setId("wall6");
        wall6.getImage().setFitHeight(65.0);
        wall6.getImage().setFitWidth(86.0);
        wall6.getImage().setLayoutX(554.0);
        wall6.getImage().setLayoutY(305.0);
        wall6.getImage().setPickOnBounds(true);
        wall6.getImage().setPreserveRatio(true);

        WallStone wall7 = new WallStone();
        wall7.getImage().setId("wall7");
        wall7.getImage().setFitHeight(65.0);
        wall7.getImage().setFitWidth(86.0);
        wall7.getImage().setLayoutX(874.0);
        wall7.getImage().setLayoutY(420.0);
        wall7.getImage().setPickOnBounds(true);
        wall7.getImage().setPreserveRatio(true);

        WallStone wall8 = new WallStone();
        wall8.getImage().setId("wall8");
        wall8.getImage().setFitHeight(65.0);
        wall8.getImage().setFitWidth(86.0);
        wall8.getImage().setLayoutX(710.0);
        wall8.getImage().setLayoutY(102.0);
        wall8.getImage().setPickOnBounds(true);
        wall8.getImage().setPreserveRatio(true);

        WallStone wall9 = new WallStone();
        wall9.getImage().setId("wall9");
        wall9.getImage().setFitHeight(65.0);
        wall9.getImage().setFitWidth(86.0);
        wall9.getImage().setLayoutX(785.0);
        wall9.getImage().setLayoutY(142.0);
        wall9.getImage().setPickOnBounds(true);
        wall9.getImage().setPreserveRatio(true);

        WallStone wall10 = new WallStone();
        wall10.getImage().setId("wall10");
        wall10.getImage().setFitHeight(65.0);
        wall10.getImage().setFitWidth(86.0);
        wall10.getImage().setLayoutX(864.0);
        wall10.getImage().setLayoutY(180.0);
        wall10.getImage().setPickOnBounds(true);
        wall10.getImage().setPreserveRatio(true);

        WallStone wall11 = new WallStone();
        wall11.getImage().setId("wall11");
        wall11.getImage().setFitHeight(65.0);
        wall11.getImage().setFitWidth(86.0);
        wall11.getImage().setLayoutX(940.0);
        wall11.getImage().setLayoutY(232.0);
        wall11.getImage().setPickOnBounds(true);
        wall11.getImage().setPreserveRatio(true);

        WallStone wall12 = new WallStone();
        wall12.getImage().setId("wall12");
        wall12.getImage().setFitHeight(65.0);
        wall12.getImage().setFitWidth(86.0);
        wall12.getImage().setLayoutX(999.0);
        wall12.getImage().setLayoutY(275.0);
        wall12.getImage().setPickOnBounds(true);
        wall12.getImage().setPreserveRatio(true);

        WallStone wall13 = new WallStone();
        wall13.getImage().setId("wall13");
        wall13.getImage().setFitHeight(65.0);
        wall13.getImage().setFitWidth(86.0);
        wall13.getImage().setLayoutX(751.0);
        wall13.getImage().setLayoutY(380.0);
        wall13.getImage().setPickOnBounds(true);
        wall13.getImage().setPreserveRatio(true);

        WallStone wall14 = new WallStone();
        wall14.getImage().setId("wall14");
        wall14.getImage().setFitHeight(65.0);
        wall14.getImage().setFitWidth(86.0);
        wall14.getImage().setLayoutX(974.0);
        wall14.getImage().setLayoutY(368.0);
        wall14.getImage().setPickOnBounds(true);
        wall14.getImage().setPreserveRatio(true);

        WallStone wall15 = new WallStone();
        wall15.getImage().setId("wall15");
        wall15.getImage().setFitHeight(65.0);
        wall15.getImage().setFitWidth(86.0);
        wall15.getImage().setLayoutX(1068.0);
        wall15.getImage().setLayoutY(315.0);
        wall15.getImage().setPickOnBounds(true);
        wall15.getImage().setPreserveRatio(true);

        WallStone wall16 = new WallStone();
        wall16.getImage().setId("wall16");
        wall16.getImage().setFitHeight(65.0);
        wall16.getImage().setFitWidth(86.0);
        wall16.getImage().setLayoutX(650.0);
        wall16.getImage().setLayoutY(148.0);
        wall16.getImage().setPickOnBounds(true);
        wall16.getImage().setPreserveRatio(true);

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
        map.getBuildings().add(wall13);
        map.getBuildings().add(wall14);
        map.getBuildings().add(wall15);
        map.getBuildings().add(wall16);
    }
    private void addSpellTower(Map map) throws URISyntaxException {
        SpellTower spellTower = new SpellTower();
        spellTower.getImage().setId("spellTower");
        spellTower.getImage().setFitHeight(89.0);
        spellTower.getImage().setFitWidth(92.0);
        spellTower.getImage().setLayoutX(657.0);
        spellTower.getImage().setLayoutY(305.0);
        spellTower.getImage().setPickOnBounds(true);
        spellTower.getImage().setPreserveRatio(true);
        map.getBuildings().add(spellTower);
    }
    private void addGigaInferno(Map map) throws URISyntaxException {
        GigaInferno gigaInferno = new GigaInferno();
        gigaInferno.getImage().setId("gigaInferno");
        gigaInferno.getImage().setFitHeight(150.0);
        gigaInferno.getImage().setFitWidth(200.0);
        gigaInferno.getImage().setLayoutX(744.0);
        gigaInferno.getImage().setLayoutY(222.0);
        gigaInferno.getImage().setPickOnBounds(true);
        gigaInferno.getImage().setPreserveRatio(true);
        map.getBuildings().add(gigaInferno);
    }
    private void addHiddenTesla(Map map) throws URISyntaxException {
        HiddenTesla hiddenTesla = new HiddenTesla();
        hiddenTesla.getImage().setId("hiddenTesla");
        hiddenTesla.getImage().setFitHeight(133.0);
        hiddenTesla.getImage().setFitWidth(69.0);
        hiddenTesla.getImage().setLayoutX(731.0);
        hiddenTesla.getImage().setLayoutY(142.0);
        hiddenTesla.getImage().setPickOnBounds(true);
        hiddenTesla.getImage().setPreserveRatio(true);
        map.getBuildings().add(hiddenTesla);
    }
    private void addXBow(Map map) throws URISyntaxException {
        XBow xBow = new XBow();
        xBow.getImage().setId("XBow");
        xBow.getImage().setFitHeight(111.0);
        xBow.getImage().setFitWidth(117.0);
        xBow.getImage().setLayoutX(876.0);
        xBow.getImage().setLayoutY(284.0);
        xBow.getImage().setPickOnBounds(true);
        xBow.getImage().setPreserveRatio(true);
        map.getBuildings().add(xBow);
    }
    private void addBackGrand(Map map2) throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        map2.getBackGrand().setFitWidth(1550);
        map2.getBackGrand().setFitHeight(800);
        map2.getBackGrand().setImage(new Image(helloApplication.getClass().getResource("images/map2.png").toURI().toString()));
        map2.getBackGrand().setPickOnBounds(true);
        map2.getBackGrand().setOnMouseClicked(event -> {
            if (heroSelectedAttack!=null){
                try {
                    if (heroSelectedAttack instanceof Hero1){
                        if (numberAddedHero1 < heroSelectedAttack.getSelectedNumber()){
                            numberAddedHero1++;
                            heroSelectedAttack=new Hero1();
                        }else {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setContentText("you cant use this hero");
                            alert.show();
                        }

                    }
                    else if (heroSelectedAttack instanceof Hero2){
                        if (numberAddedHero2 < heroSelectedAttack.getSelectedNumber()){
                            numberAddedHero2++;
                            heroSelectedAttack=new Hero2();
                        }else {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setContentText("you cant use this hero");
                            alert.show();
                        }
                    }
                    else if (heroSelectedAttack instanceof Hero3){
                        if (numberAddedHero3 < heroSelectedAttack.getSelectedNumber()){
                            numberAddedHero3++;
                            heroSelectedAttack=new Hero3();
                        }else {
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
                        }else {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setContentText("you cant use this hero");
                            alert.show();
                        }
                    }
                    else{
                        if (numberAddedHero5 < heroSelectedAttack.getSelectedNumber()){
                            numberAddedHero5++;
                            heroSelectedAttack=new Hero5();
                        }else {
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
