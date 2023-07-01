package com.example.demo;

import com.example.demo.model.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.ResourceBundle;

public class Attack implements Initializable {
    @FXML
    private Button btNext;

    @FXML
    private ImageView mapImage;

    @FXML
    private Label heroLimits;
    @FXML
    private Label hero5number;

    @FXML
    private Label hero1number;

    @FXML
    private Button btHome;

    @FXML
    private Label hero2number;

    @FXML
    private ImageView hero3;

    @FXML
    private ImageView hero2;

    @FXML
    private ImageView hero5;

    @FXML
    private ImageView hero4;

    @FXML
    private Label hero3number;

    @FXML
    private Label hero4number;

    @FXML
    private ImageView hero1;

    @FXML
    private Label selectedHeroN;
    int mapImageIndex =0;
    int numberOfSelectedHero=0;
    int numberOfHero1=0;
    int numberOfHero2=0;
    int numberOfHero3=0;
    int numberOfHero4=0;
    int numberOfHero5=0;
    ArrayList<Map> opponentMaps = new ArrayList<>();
    @FXML
    void btNext() {
        setValue();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(SystemGame.selectedMaps!= null){

            for (Map map:SystemGame.selectedMaps){
                if (!map.getMapId().equals(SystemGame.player.getPlayerID()))
                    opponentMaps.add(map);
            }
            btNext.setVisible(true);
            setValue();
        }
    }
    @FXML
    void btHome(MouseEvent event) throws IOException {
        Parent parent= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("menu.fxml")));
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(parent,1550,800);
        stage.setScene(scene);
        stage.setTitle("menu");
        stage.show();
    }
    void setValue() {
        Random random = new Random();
        mapImageIndex= random.nextInt(0,opponentMaps.size());
        mapImage.setImage(opponentMaps.get(mapImageIndex).getImage());
        selectedHeroN.setText(String.valueOf(numberOfSelectedHero));

        numberOfSelectedHero=0;
        numberOfHero1=0;
        numberOfHero2=0;
        numberOfHero3=0;
        numberOfHero4=0;
        numberOfHero5=0;

        hero1number.setText(String.valueOf(numberOfHero1));
        hero2number.setText(String.valueOf(numberOfHero2));
        hero3number.setText(String.valueOf(numberOfHero3));
        hero4number.setText(String.valueOf(numberOfHero4));
        hero5number.setText(String.valueOf(numberOfHero5));

        mapImage.setVisible(true);
        heroLimits.setText(String.valueOf(opponentMaps.get(mapImageIndex).getHeroLimits()));
        heroLimits.setVisible(true);
    }
    @FXML
    void hero1() {
        if (numberOfSelectedHero+1>opponentMaps.get(mapImageIndex).getHeroLimits()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("you cant select this item");
            alert.show();
        }else {
            numberOfHero1++;
            numberOfSelectedHero++;
            selectedHeroN.setText(String.valueOf(numberOfSelectedHero));
            hero1number.setText(String.valueOf(numberOfHero1));
        }
    }
    @FXML
    void hero5() {
        if (numberOfSelectedHero+1>opponentMaps.get(mapImageIndex).getHeroLimits()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("you cant select this item");
            alert.show();
        }else {
            numberOfHero5++;
            numberOfSelectedHero++;
            selectedHeroN.setText(String.valueOf(numberOfSelectedHero));
            hero5number.setText(String.valueOf(numberOfHero5));
        }
    }
    @FXML
    void hero4() {
        if (numberOfSelectedHero+1>opponentMaps.get(mapImageIndex).getHeroLimits()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("you cant select this item");
            alert.show();
        }else {
            numberOfHero4++;
            numberOfSelectedHero++;
            selectedHeroN.setText(String.valueOf(numberOfSelectedHero));
            hero4number.setText(String.valueOf(numberOfHero4));
        }
    }
    @FXML
    void hero3() {
        if (numberOfSelectedHero+1>opponentMaps.get(mapImageIndex).getHeroLimits()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("you cant select this item");
            alert.show();
        }else {
            numberOfHero3++;
            numberOfSelectedHero++;
            selectedHeroN.setText(String.valueOf(numberOfSelectedHero));
            hero3number.setText(String.valueOf(numberOfHero3));
        }
    }
    @FXML
    void hero2() {
        if (numberOfSelectedHero+1>opponentMaps.get(mapImageIndex).getHeroLimits()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("you cant select this item");
            alert.show();
        }else {
            numberOfHero2++;
            numberOfSelectedHero++;
            selectedHeroN.setText(String.valueOf(numberOfSelectedHero));
            hero2number.setText(String.valueOf(numberOfHero2));
        }
    }
    @FXML
    void mapImage(MouseEvent event) throws IOException {
        SystemGame.selectedMap=SystemGame.maps.get(mapImageIndex);
        Parent parent= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("clashOfClans.fxml")));
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(parent,1550,800);
        stage.setScene(scene);
        stage.setTitle("clash Of Clans");
        stage.show();
    }
}
