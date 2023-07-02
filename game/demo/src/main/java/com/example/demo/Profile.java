package com.example.demo;

import com.example.demo.model.SystemGame;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Profile implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.username.setText(SystemGame.player.getPlayerID());
        this.password.setText(SystemGame.player.getPassword());
        this.level.setText(String.valueOf(SystemGame.player.getLevel()));
        this.wins.setText(String.valueOf(SystemGame.player.getWins()));
        this.losses.setText(String.valueOf(SystemGame.player.getLosses()));
        this.map.setImage(SystemGame.player.getMap().getImage());
    }
    @FXML
    private Label wins;

    @FXML
    private Label password;

    @FXML
    private Label level;

    @FXML
    private Label losses;

    @FXML
    private ImageView map;

    @FXML
    private Button btHome;

    @FXML
    private Label username;

    @FXML
    void btHome(MouseEvent event) throws IOException {
        Parent parent= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("menu.fxml")));
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(parent,1550,800);
        stage.setScene(scene);
        stage.setTitle("menu");
        stage.show();
    }
}
