package com.example.demo.PageController;

import com.example.demo.HelloApplication;
import com.example.demo.model.Map;
import com.example.demo.model.buildings.*;
import com.example.demo.model.heroes.*;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URISyntaxException;

import static com.example.demo.model.SystemGame.heroSelectedAttack;

public class Map3PageController {
    private Hero hero;
    private int numberAddedHero1=0;
    private int numberAddedHero2=0;
    private int numberAddedHero3=0;
    private int numberAddedHero4=0;
    private int numberAddedHero5=0;
    public void addBuildings(Map map) throws URISyntaxException {
        addWalls(map);
        addMortals(map);
        addElixir(map);
        addInferno(map);
        addBackGrand(map);
    }
    private void addWalls(Map map) throws URISyntaxException {
        WallBlue wall1 = new WallBlue();
        wall1.getImage().setId("wall1");
        wall1.getImage().setFitHeight(74.0);
        wall1.getImage().setFitWidth(89.0);
        wall1.getImage().setLayoutX(558.0);
        wall1.getImage().setLayoutY(272.0);
        wall1.getImage().setPickOnBounds(true);
        wall1.getImage().setPreserveRatio(true);

        WallBlue wall2 = new WallBlue();
        wall2.getImage().setId("wall2");
        wall2.getImage().setFitHeight(74.0);
        wall2.getImage().setFitWidth(89.0);
        wall2.getImage().setLayoutX(489.0);
        wall2.getImage().setLayoutY(316.0);
        wall2.getImage().setPickOnBounds(true);
        wall2.getImage().setPreserveRatio(true);

        WallBlue wall3 = new WallBlue();
        wall3.getImage().setId("wall3");
        wall3.getImage().setFitHeight(74.0);
        wall3.getImage().setFitWidth(89.0);
        wall3.getImage().setLayoutX(567.0);
        wall3.getImage().setLayoutY(362.0);
        wall3.getImage().setPickOnBounds(true);
        wall3.getImage().setPreserveRatio(true);

        WallBlue wall4 = new WallBlue();
        wall4.getImage().setId("wall4");
        wall4.getImage().setFitHeight(74.0);
        wall4.getImage().setFitWidth(89.0);
        wall4.getImage().setLayoutX(636.0);
        wall4.getImage().setLayoutY(409.0);
        wall4.getImage().setPickOnBounds(true);
        wall4.getImage().setPreserveRatio(true);

        WallBlue wall5 = new WallBlue();
        wall5.getImage().setId("wall5");
        wall5.getImage().setFitHeight(74.0);
        wall5.getImage().setFitWidth(89.0);
        wall5.getImage().setLayoutX(943.0);
        wall5.getImage().setLayoutY(228.0);
        wall5.getImage().setPickOnBounds(true);
        wall5.getImage().setPreserveRatio(true);

        WallBlue wall6 = new WallBlue();
        wall6.getImage().setId("wall6");
        wall6.getImage().setFitHeight(74.0);
        wall6.getImage().setFitWidth(89.0);
        wall6.getImage().setLayoutX(874.0);
        wall6.getImage().setLayoutY(182.0);
        wall6.getImage().setPickOnBounds(true);
        wall6.getImage().setPreserveRatio(true);

        WallBlue wall7 = new WallBlue();
        wall7.getImage().setId("wall7");
        wall7.getImage().setFitHeight(74.0);
        wall7.getImage().setFitWidth(89.0);
        wall7.getImage().setLayoutX(1022.0);
        wall7.getImage().setLayoutY(272.0);
        wall7.getImage().setPickOnBounds(true);
        wall7.getImage().setPreserveRatio(true);

        WallBlue wall8 = new WallBlue();
        wall8.getImage().setId("wall8");
        wall8.getImage().setFitHeight(74.0);
        wall8.getImage().setFitWidth(89.0);
        wall8.getImage().setLayoutX(893.0);
        wall8.getImage().setLayoutY(362.0);
        wall8.getImage().setPickOnBounds(true);
        wall8.getImage().setPreserveRatio(true);

        WallBlue wall9 = new WallBlue();
        wall9.getImage().setId("wall9");
        wall9.getImage().setFitHeight(74.0);
        wall9.getImage().setFitWidth(89.0);
        wall9.getImage().setLayoutX(962.0);
        wall9.getImage().setLayoutY(318.0);
        wall9.getImage().setPickOnBounds(true);
        wall9.getImage().setPreserveRatio(true);

        WallBlue wall10 = new WallBlue();
        wall10.getImage().setId("wall10");
        wall10.getImage().setFitHeight(74.0);
        wall10.getImage().setFitWidth(89.0);
        wall10.getImage().setLayoutX(620.0);
        wall10.getImage().setLayoutY(228.0);
        wall10.getImage().setPickOnBounds(true);
        wall10.getImage().setPreserveRatio(true);

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
    }
    private void addMortals(Map map) throws URISyntaxException {

        Mortal mortal1 = new Mortal();
        mortal1.getImage().setId("mortal1");
        mortal1.getImage().setFitHeight(113.0);
        mortal1.getImage().setFitWidth(106.0);
        mortal1.getImage().setLayoutX(741.0);
        mortal1.getImage().setLayoutY(419.0);
        mortal1.getImage().setPickOnBounds(true);
        mortal1.getImage().setPreserveRatio(true);

        Mortal mortal2 = new Mortal();
        mortal2.getImage().setId("mortal2");
        mortal2.getImage().setFitHeight(113.0);
        mortal2.getImage().setFitWidth(106.0);
        mortal2.getImage().setLayoutX(741.0);
        mortal2.getImage().setLayoutY(182.0);
        mortal2.getImage().setPickOnBounds(true);
        mortal2.getImage().setPreserveRatio(true);

        map.getBuildings().add(mortal1);
        map.getBuildings().add(mortal2);
    }
    private void addElixir(Map map) throws URISyntaxException {

        Elixir elixir = new Elixir();
        elixir.getImage().setId("elixir");
        elixir.getImage().setFitHeight(113.0);
        elixir.getImage().setFitWidth(106.0);
        elixir.getImage().setLayoutX(847.0);
        elixir.getImage().setLayoutY(275.0);
        elixir.getImage().setPickOnBounds(true);
        elixir.getImage().setPreserveRatio(true);

        map.getBuildings().add(elixir);
    }
    private void addInferno(Map map) throws URISyntaxException {

        Inferno inferno = new Inferno();
        inferno.getImage().setId("inferno");
        inferno.getImage().setFitHeight(113.0);
        inferno.getImage().setFitWidth(106.0);
        inferno.getImage().setLayoutX(732.0);
        inferno.getImage().setLayoutY(296.0);
        inferno.getImage().setPickOnBounds(true);
        inferno.getImage().setPreserveRatio(true);

        map.getBuildings().add(inferno);
    }
    private void addBackGrand(Map map1) throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        map1.getBackGrand().setFitWidth(1550);
        map1.getBackGrand().setFitHeight(800);
        map1.getBackGrand().setImage(new Image(helloApplication.getClass().getResource("images/map3.png").toURI().toString()));
        map1.getBackGrand().setPickOnBounds(true);
        map1.getBackGrand().setOnMouseClicked(event -> {
            if (heroSelectedAttack!=null){
                try {
                    if (heroSelectedAttack instanceof Hero1){
                        if (numberAddedHero1 < heroSelectedAttack.getSelectedNumber()){
                            numberAddedHero1++;
                            hero=new Hero1();
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
                            hero=new Hero2();
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
                            hero=new Hero3();
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
                            hero=new Hero4();
                        }else {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setContentText("you cant use this hero");
                            alert.show();
                        }
                    }
                    else{
                        if (numberAddedHero5 < heroSelectedAttack.getSelectedNumber()){
                            numberAddedHero5++;
                            hero=new Hero5();
                            ((Hero5)hero).setCircle(new ImageView(new Image(helloApplication.getClass().getResource("images/fireBall.png").toURI().toString())));
                            ((Hero5)hero).getCircle().setFitWidth(10);
                            ((Hero5)hero).getCircle().setFitHeight(10);
                            hero.getImage().setLayoutX(event.getX()-hero.getImage().getFitWidth()/2);
                            hero.getImage().setLayoutY(event.getY()-hero.getImage().getFitHeight() /2);
                            hero.getImage().setPickOnBounds(true);
                            hero.getImage().setPreserveRatio(true);
                            ((Hero5)hero).getCircle().setLayoutX(hero.getImage().getLayoutX());
                            ((Hero5)hero).getCircle().setLayoutY(hero.getImage().getLayoutY());
                            ((Hero5)hero).getCircle().setVisible(false);
                            ((AnchorPane)((Node)event.getSource()).getParent()).getChildren().add(((Hero5)hero).getCircle());
                            ((Hero5)hero).setCircle2(new ImageView(new Image(helloApplication.getClass().getResource("images/fireBall.png").toURI().toString())));
                            ((Hero5)hero).getCircle2().setFitWidth(10);
                            ((Hero5)hero).getCircle2().setFitHeight(10);
                            ((Hero5)hero).getCircle2().setVisible(false);
                            ((AnchorPane)((Node)event.getSource()).getParent()).getChildren().add(((Hero5)hero).getCircle2());
                        }else {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setContentText("you cant use this hero");
                            alert.show();
                        }
                    }
                } catch (URISyntaxException e) {
                    throw new RuntimeException(e);
                }
                new Thread((Runnable) hero).start();
                hero.getImage().setLayoutX(event.getX()-hero.getImage().getFitWidth()/2);
                hero.getImage().setLayoutY(event.getY()-hero.getImage().getFitHeight() /2);
                hero.getImage().setPickOnBounds(true);
                hero.getImage().setPreserveRatio(true);
                ((AnchorPane)((Node)event.getSource()).getParent()).getChildren().add(hero.getImage());
            }
        });
    }
}
