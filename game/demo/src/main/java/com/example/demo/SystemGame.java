package com.example.demo;

import com.example.demo.model.*;
import com.example.demo.model.buildings.*;
import com.example.demo.model.heroes.*;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

import java.net.URISyntaxException;
import java.util.ArrayList;

public class SystemGame {
    public static Player player;
    public  static Map selectedMap;
    public static Hero heroSelectedAttack;
    public static Hero heroAttack;
    public  static ArrayList<Map> maps = new ArrayList<>();
    public  static ArrayList<Hero> heroes = new ArrayList<>();

    public  static ArrayList<Hero> selectedHeroes = new ArrayList<>();
    public  static ArrayList<Map> selectedMaps = new ArrayList<>();
    public static ArrayList<Player> players = new ArrayList<>();
    private void addBuildings(Map map) throws URISyntaxException {

        addWalls(map);
        addCannons(map);
        addMortals(map);

        WizardTower wizardTower = new WizardTower();
        wizardTower.getImage().setId("wizardTower");
        wizardTower.getImage().setFitHeight(114.0);
        wizardTower.getImage().setFitWidth(106.0);
        wizardTower.getImage().setLayoutX(778.0);
        wizardTower.getImage().setLayoutY(271.0);
        wizardTower.getImage().setPickOnBounds(true);
        wizardTower.getImage().setPreserveRatio(true);
        map.getBuildings().add(wizardTower);

        SpellTower spellTower = new SpellTower();
        spellTower.getImage().setId("spellTower");
        spellTower.getImage().setFitHeight(101.0);
        spellTower.getImage().setFitWidth(87.0);
        spellTower.getImage().setLayoutX(889.0);
        spellTower.getImage().setLayoutY(208.0);
        spellTower.getImage().setPickOnBounds(true);
        spellTower.getImage().setPreserveRatio(true);
        map.getBuildings().add(spellTower);

        GoldStorage goldStorage= new GoldStorage();
        goldStorage.getImage().setId("goldStorage");
        goldStorage.getImage().setFitHeight(103.0);
        goldStorage.getImage().setFitWidth(96.0);
        goldStorage.getImage().setLayoutX(660.0);
        goldStorage.getImage().setLayoutY(197.0);
        goldStorage.getImage().setPickOnBounds(true);
        goldStorage.getImage().setPreserveRatio(true);
        map.getBuildings().add(goldStorage);

    }
    public void addMaps() throws URISyntaxException {
        HelloApplication helloApplication = new HelloApplication();
        Map map1 = new Map(helloApplication.getClass().getResource("images/mapb1.png").toURI().toString(),5,50);
        Map map2 = new Map(helloApplication.getClass().getResource("images/mapb2.png").toURI().toString(),6,50);
        Map map3 = new Map(helloApplication.getClass().getResource("images/mapb3.png").toURI().toString(),7,50);
        Map map4 = new Map(helloApplication.getClass().getResource("images/mapb4.png").toURI().toString(),8,50);


        map1.getBackGrand().setFitWidth(1550);
        map1.getBackGrand().setFitHeight(800);
        map1.getBackGrand().setImage(new Image(helloApplication.getClass().getResource("images/map1.png").toURI().toString()));
        map1.getBackGrand().setPickOnBounds(true);
        map1.getBackGrand().setOnMouseClicked(event -> {
            if (heroSelectedAttack!=null){
                try {
                    if (heroSelectedAttack instanceof Hero1)
                        SystemGame.heroSelectedAttack=new Hero1();
                    else if (heroSelectedAttack instanceof Hero2)
                        SystemGame.heroSelectedAttack=new Hero2();
                    else if (heroSelectedAttack instanceof Hero3)
                        SystemGame.heroSelectedAttack=new Hero3();
                    else if (heroSelectedAttack instanceof Hero4)
                        SystemGame.heroSelectedAttack=new Hero4();
                    else
                        SystemGame.heroSelectedAttack=new Hero5();
                } catch (URISyntaxException e) {
                    throw new RuntimeException(e);
                }
                new Thread((Runnable) heroSelectedAttack).start();
                heroSelectedAttack.getImage().setLayoutX(event.getX()-heroSelectedAttack.getImage().getFitWidth()/2);
                heroSelectedAttack.getImage().setLayoutY(event.getY()-heroSelectedAttack.getImage().getFitHeight() /2);
                heroSelectedAttack.getImage().setPickOnBounds(true);
                heroSelectedAttack.getImage().setPreserveRatio(true);
                ((AnchorPane)((Node)event.getSource()).getParent()).getChildren().add(SystemGame.heroSelectedAttack.getImage());
            }
        });
        addBuildings(map1);
//        addBuildings(map2);
//        addBuildings(map3);
//        addBuildings(map4);

        maps.add(map1);
        maps.add(map2);
        maps.add(map3);
        maps.add(map4);
    }
    public void addHero() throws URISyntaxException {
        Hero1 hero1 = new Hero1();
        Hero2 hero2 = new Hero2();
        Hero3 hero3 = new Hero3();
        Hero4 hero4 = new Hero4();
        Hero5 hero5 = new Hero5();

        heroes.add(hero1);
        heroes.add(hero2);
        heroes.add(hero3);
        heroes.add(hero4);
        heroes.add(hero5);
    }
    public void addWalls(Map map) throws URISyntaxException {
        WallWhite wall1 = new WallWhite();
        wall1.getImage().setId("wall1");
        wall1.getImage().setFitHeight(49.0);
        wall1.getImage().setFitWidth(63.0);
        wall1.getImage().setLayoutX(658.0);
        wall1.getImage().setLayoutY(160.0);
        wall1.getImage().setPickOnBounds(true);
        wall1.getImage().setPreserveRatio(true);

        WallWhite wall2 = new WallWhite();
        wall2.getImage().setId("wall2");
        wall2.getImage().setFitHeight(49.0);
        wall2.getImage().setFitWidth(63.0);
        wall2.getImage().setLayoutX(662.0);
        wall2.getImage().setLayoutY(184.0);
        wall2.getImage().setPickOnBounds(true);
        wall2.getImage().setPreserveRatio(true);

        WallWhite wall3 = new WallWhite();
        wall3.getImage().setId("wall3");
        wall3.getImage().setFitHeight(49.0);
        wall3.getImage().setFitWidth(63.0);
        wall3.getImage().setLayoutX(586.0);
        wall3.getImage().setLayoutY(209.0);
        wall3.getImage().setPickOnBounds(true);
        wall3.getImage().setPreserveRatio(true);

        WallWhite wall4 = new WallWhite();
        wall4.getImage().setId("wall4");
        wall4.getImage().setFitHeight(49.0);
        wall4.getImage().setFitWidth(63.0);
        wall4.getImage().setLayoutX(606.0);
        wall4.getImage().setLayoutY(257.0);
        wall4.getImage().setPickOnBounds(true);
        wall4.getImage().setPreserveRatio(true);

        WallWhite wall5 = new WallWhite();
        wall5.getImage().setId("wall5");
        wall5.getImage().setFitHeight(49.0);
        wall5.getImage().setFitWidth(63.0);
        wall5.getImage().setLayoutX(548.0);
        wall5.getImage().setLayoutY(289.0);
        wall5.getImage().setPickOnBounds(true);
        wall5.getImage().setPreserveRatio(true);

        WallWhite wall6 = new WallWhite();
        wall6.getImage().setId("wall6");
        wall6.getImage().setFitHeight(49.0);
        wall6.getImage().setFitWidth(63.0);
        wall6.getImage().setLayoutX(481.0);
        wall6.getImage().setLayoutY(328.0);
        wall6.getImage().setPickOnBounds(true);
        wall6.getImage().setPreserveRatio(true);

        WallWhite wall7 = new WallWhite();
        wall7.getImage().setId("wall7");
        wall7.getImage().setFitHeight(49.0);
        wall7.getImage().setFitWidth(63.0);
        wall7.getImage().setLayoutX(533.0);
        wall7.getImage().setLayoutY(365.0);
        wall7.getImage().setPickOnBounds(true);
        wall7.getImage().setPreserveRatio(true);

        WallWhite wall8 = new WallWhite();
        wall8.getImage().setId("wall8");
        wall8.getImage().setFitHeight(49.0);
        wall8.getImage().setFitWidth(63.0);
        wall8.getImage().setLayoutX(580.0);
        wall8.getImage().setLayoutY(400.0);
        wall8.getImage().setPickOnBounds(true);
        wall8.getImage().setPreserveRatio(true);

        WallWhite wall9 = new WallWhite();
        wall9.getImage().setId("wall9");
        wall9.getImage().setFitHeight(49.0);
        wall9.getImage().setFitWidth(63.0);
        wall9.getImage().setLayoutX(632.0);
        wall9.getImage().setLayoutY(437.0);
        wall9.getImage().setPickOnBounds(true);
        wall9.getImage().setPreserveRatio(true);

        WallWhite wall10= new WallWhite();
        wall10.getImage().setId("wall10");
        wall10.getImage().setFitHeight(49.0);
        wall10.getImage().setFitWidth(63.0);
        wall10.getImage().setLayoutX(684.0);
        wall10.getImage().setLayoutY(482.0);
        wall10.getImage().setPickOnBounds(true);
        wall10.getImage().setPreserveRatio(true);

        WallWhite wall11= new WallWhite();
        wall11.getImage().setId("wall11");
        wall11.getImage().setFitHeight(49.0);
        wall11.getImage().setFitWidth(63.0);
        wall11.getImage().setLayoutX(749.0);
        wall11.getImage().setLayoutY(482.0);
        wall11.getImage().setPickOnBounds(true);
        wall11.getImage().setPreserveRatio(true);

        WallWhite wall12 = new WallWhite();
        wall12.getImage().setId("wall12");
        wall12.getImage().setFitHeight(49.0);
        wall12.getImage().setFitWidth(63.0);
        wall12.getImage().setLayoutX(834.0);
        wall12.getImage().setLayoutY(482.0);
        wall12.getImage().setPickOnBounds(true);
        wall12.getImage().setPreserveRatio(true);

        WallWhite wall13 = new WallWhite();
        wall13.getImage().setId("wall13");
        wall13.getImage().setFitHeight(49.0);
        wall13.getImage().setFitWidth(63.0);
        wall13.getImage().setLayoutX(924.0);
        wall13.getImage().setLayoutY(445.0);
        wall13.getImage().setPickOnBounds(true);
        wall13.getImage().setPreserveRatio(true);

        WallWhite wall14 = new WallWhite();
        wall14.getImage().setId("wall14");
        wall14.getImage().setFitHeight(49.0);
        wall14.getImage().setFitWidth(63.0);
        wall14.getImage().setLayoutX(987.0);
        wall14.getImage().setLayoutY(412.0);
        wall14.getImage().setPickOnBounds(true);
        wall14.getImage().setPreserveRatio(true);

        WallWhite wall15 = new WallWhite();
        wall15.getImage().setId("wall15");
        wall15.getImage().setFitHeight(49.0);
        wall15.getImage().setFitWidth(63.0);
        wall15.getImage().setLayoutX(1050.0);
        wall15.getImage().setLayoutY(365.0);
        wall15.getImage().setPickOnBounds(true);
        wall15.getImage().setPreserveRatio(true);

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
    }
    public void addCannons(Map map) throws URISyntaxException {
        Cannon cannon1 = new Cannon();
        cannon1.getImage().setId("cannon1");
        cannon1.getImage().setFitHeight(77.0);
        cannon1.getImage().setFitWidth(97.0);
        cannon1.getImage().setLayoutX(633.0);
        cannon1.getImage().setLayoutY(306.0);
        cannon1.getImage().setPickOnBounds(true);
        cannon1.getImage().setPreserveRatio(true);

        Cannon cannon2 = new Cannon();
        cannon2.getImage().setId("cannon2");
        cannon2.getImage().setFitHeight(77.0);
        cannon2.getImage().setFitWidth(97.0);
        cannon2.getImage().setLayoutX(940.0);
        cannon2.getImage().setLayoutY(326.0);
        cannon2.getImage().setPickOnBounds(true);
        cannon2.getImage().setPreserveRatio(true);

        map.getBuildings().add(cannon1);
        map.getBuildings().add(cannon2);
    }
    public void addMortals(Map map) throws URISyntaxException {

        Mortal mortal1 = new Mortal();
        mortal1.getImage().setId("mortal1");
        mortal1.getImage().setFitHeight(94.0);
        mortal1.getImage().setFitWidth(69.0);
        mortal1.getImage().setLayoutX(791.0);
        mortal1.getImage().setLayoutY(178.0);
        mortal1.getImage().setPickOnBounds(true);
        mortal1.getImage().setPreserveRatio(true);

        Mortal mortal2 = new Mortal();
        mortal2.getImage().setId("mortal2");
        mortal2.getImage().setFitHeight(94.0);
        mortal2.getImage().setFitWidth(69.0);
        mortal2.getImage().setLayoutX(784.0);
        mortal2.getImage().setLayoutY(402.0);
        mortal2.getImage().setPickOnBounds(true);
        mortal2.getImage().setPreserveRatio(true);

        map.getBuildings().add(mortal1);
        map.getBuildings().add(mortal2);
    }

}
