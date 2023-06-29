package com.example.demo;

import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
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
    void signupLabel(MouseEvent event) throws IOException {
        if (event.getEventType().equals(MouseEvent.MOUSE_ENTERED)){
            signupLabel.setTranslateX(3);
            signupLabel.setTranslateY(3);
        }else if (event.getEventType().equals(MouseEvent.MOUSE_EXITED)){
            signupLabel.setTranslateX(-3);
            signupLabel.setTranslateY(-3);

        }else if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
            Parent parent= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("signup.fxml")));
            Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene=new Scene(parent,1550,800);
            stage.setScene(scene);
            stage.setTitle("signup");
            stage.show();
        }

    }

    @FXML
    void loginLabel(MouseEvent event) throws IOException {
        if (event.getEventType().equals(MouseEvent.MOUSE_ENTERED)){
            loginLabel.setTranslateX(3);
            loginLabel.setTranslateY(3);
        }else if (event.getEventType().equals(MouseEvent.MOUSE_EXITED)){
            loginLabel.setTranslateX(-3);
            loginLabel.setTranslateY(-3);
        }else if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)){
            Parent parent= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
            Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene=new Scene(parent,1550,800);
            stage.setScene(scene);
            stage.setTitle("login");
            stage.show();
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        signupLabel=new Label();
//        signupLabel.addEventHandler(new EventType<>());
    }
}
