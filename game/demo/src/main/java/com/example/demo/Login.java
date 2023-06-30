package com.example.demo;

import com.example.demo.controller.InvalidPassword;
import com.example.demo.controller.InvalidUsername;
import com.example.demo.controller.LoginController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class Login {
    @FXML
    private TextField usernameTf;
    @FXML
    private TextField passwordTf;
    @FXML
    void btHome(MouseEvent event) throws IOException {
        Parent parent= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("firstPage.fxml")));
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(parent,1550,800);
        stage.setScene(scene);
        stage.setTitle("firstPage");
        stage.show();
    }

    @FXML
    void loginButton(MouseEvent event) throws IOException {
        try {
            LoginController loginController = new LoginController();
            loginController.checkLogin(usernameTf.getText(),passwordTf.getText());
            Parent parent= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("menu.fxml")));
            Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene=new Scene(parent,1550,800);
            stage.setScene(scene);
            stage.setTitle("menu");
            stage.show();
        } catch (InvalidPassword | InvalidUsername e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("username or password is invalid");
            alert.show();
        }

    }
}
