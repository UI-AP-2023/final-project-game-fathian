package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, URISyntaxException {
        SystemGame systemGame = new SystemGame();
        systemGame.addMaps();
        systemGame.addHero();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("firstPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1550, 800);
        stage.setTitle("clash of clans");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}