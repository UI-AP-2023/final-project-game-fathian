package com.example.demo;

import com.example.demo.model.SystemGame;
import com.example.demo.model.heroes.*;
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
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Heroes implements Initializable {
    @FXML
    private Button btBack;
    @FXML
    private Button btNext;

    @FXML
    private ImageView heroImage;

    @FXML
    private Rectangle box;

    @FXML
    private Label healthLabelValue;

    @FXML
    private Label text;
    int imageIndex=0;
    @FXML
    void btNext(MouseEvent event) {
        imageIndex++;
        setValue();
        if(SystemGame.heroes.size()-1==imageIndex){
            btNext.setVisible(false);
        }
        if(0<imageIndex){
            btBack.setVisible(true);
        }
    }

    @FXML
    void btBack(MouseEvent event) {
        imageIndex--;
        setValue();
        if(SystemGame.heroes.size()>imageIndex){
            btNext.setVisible(true);
        }
        if(0==imageIndex){
            btBack.setVisible(false);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(SystemGame.heroes != null){
            if(SystemGame.heroes.size()>imageIndex){
                btNext.setVisible(true);
            }
            if(0<imageIndex){
                btBack.setVisible(true);
            }
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
    void setValue(){
        if (SystemGame.heroes.get(imageIndex) instanceof Hero1){
            heroImage.setImage(((Hero1)(SystemGame.heroes.get(imageIndex))).getImage().getImage());
            heroImage.setVisible(true);
            text.setText(SystemGame.heroes.get(imageIndex).toString());
            text.setVisible(true);
        }else if (SystemGame.heroes.get(imageIndex) instanceof Hero2){
            heroImage.setImage(((Hero2)(SystemGame.heroes.get(imageIndex))).getImage().getImage());
            heroImage.setVisible(true);
            text.setText(SystemGame.heroes.get(imageIndex).toString());
            text.setVisible(true);

        }else if (SystemGame.heroes.get(imageIndex) instanceof Hero3){
            heroImage.setImage(((Hero3)(SystemGame.heroes.get(imageIndex))).getImage().getImage());
            heroImage.setVisible(true);
            text.setText(SystemGame.heroes.get(imageIndex).toString());
            text.setVisible(true);

        }else if (SystemGame.heroes.get(imageIndex) instanceof Hero4){
            heroImage.setImage(((Hero4)(SystemGame.heroes.get(imageIndex))).getImage().getImage());
            heroImage.setVisible(true);
            text.setText(SystemGame.heroes.get(imageIndex).toString());
            text.setVisible(true);

        }else if (SystemGame.heroes.get(imageIndex) instanceof Hero5){
            text.setText(((Hero5)(SystemGame.heroes.get(imageIndex))).toString());
            text.setVisible(true);
            heroImage.setImage(((Hero5)(SystemGame.heroes.get(imageIndex))).getImage().getImage());
            heroImage.setVisible(true);
//            healthLabel.setVisible(true);
//            healthLabelValue.setText((String.valueOf(((Hero5)(SystemGame.heroes.get(imageIndex))).getHealth())));
//            healthLabelValue.setVisible(true);
        }
    }
}
