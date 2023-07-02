package com.example.demo;

import com.example.demo.model.SystemGame;
import com.example.demo.model.exception.InvalidMap;
import com.example.demo.model.exception.InvalidPassword;
import com.example.demo.model.exception.InvalidUsername;
import com.example.demo.controller.SignupController;
import com.example.demo.dataBase.Players;
import com.example.demo.model.Map;
import com.example.demo.model.Player;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Signup implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mapImage.setVisible(false);
    }
    int imageIndex=0;
    private Map selectedMap;
    @FXML
    private ImageView mapImage = new ImageView();
    @FXML
    private Button btHome;
    @FXML
    private TextField usernameTf;

    @FXML
    private Button btBack;

    @FXML
    private ImageView selectedImage;

    @FXML
    private Button btNext;

    @FXML
    private TextField passwordTf;

    @FXML
    private Label mapButton;
    @FXML
    void signupButton(MouseEvent event) throws IOException {
        SignupController signup = new SignupController();
        try {
            signup.checkPassword(passwordTf.getText());
            signup.checkUsername(usernameTf.getText());
            signup.checkMap(selectedMap);
            selectedMap.setMapId(usernameTf.getText());
            Player player = new Player(usernameTf.getText(),passwordTf.getText(),1,0,0, selectedMap);
            Players.getInstance().saveUsers(usernameTf.getText(),passwordTf.getText(),1,0,0, selectedMap.getMapId());
            signup.addUser(player);
            SystemGame.selectedMaps.add(selectedMap);
            SystemGame.maps.remove(selectedMap);
            Parent parent= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("menu.fxml")));
            Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene=new Scene(parent,1550,800);
            stage.setScene(scene);
            stage.setTitle("menu");
            stage.show();

        } catch (InvalidPassword | InvalidUsername | InvalidMap e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }
    @FXML
    void mapImage(MouseEvent event) {
        selectedImage.setImage(SystemGame.maps.get(imageIndex).getImage());
        selectedMap=SystemGame.maps.get(imageIndex);
        selectedImage.setVisible(true);
        mapImage.setVisible(false);
        btNext.setVisible(false);
        btBack.setVisible(false);
    }
    @FXML
    void btNext(MouseEvent event) {
        imageIndex++;
        mapImage.setImage(SystemGame.maps.get(imageIndex).getImage());
        if(SystemGame.maps.size()-1==imageIndex){
            btNext.setVisible(false);
        }
        if(0<imageIndex){
            btBack.setVisible(true);
        }
    }
    @FXML
    void btBack(MouseEvent event) {
        imageIndex--;
        mapImage.setImage(SystemGame.maps.get(imageIndex).getImage());
        if(SystemGame.maps.size()>imageIndex){
            btNext.setVisible(true);
        }
        if(0==imageIndex){
            btBack.setVisible(false);
        }
    }
    @FXML
    void mapButton(MouseEvent event){
        if(SystemGame.maps != null){
            mapImage.setImage(SystemGame.maps.get(imageIndex).getImage());
            mapImage.setVisible(true);
            if(SystemGame.maps.size()>imageIndex){
                btNext.setVisible(true);
            }
            if(0<imageIndex){
                btBack.setVisible(true);
            }
        }
    }
    @FXML
    void btHome(MouseEvent event) throws IOException {
        Parent parent= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("firstPage.fxml")));
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(parent,1550,800);
        stage.setScene(scene);
        stage.setTitle("firstPage");
        stage.show();
    }
}
