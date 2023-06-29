package com.example.demo;

import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class FirstPageController implements Initializable{
    @FXML
    private Label signupLabel;
    @FXML
    private Label loginLabel;

    @FXML
    private ImageView loginPage;
//

    @FXML
    void signupLabel(MouseEvent event) {

    }

    @FXML
    void loginLabel(MouseEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        signupLabel=new Label();
//        signupLabel.addEventHandler(new EventType<>());
    }
}
