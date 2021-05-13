package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void moveUp(){
        System.out.println("MOVING UP");
    }
    public void moveDown(){
        System.out.println("MOVING DOWN");
    }
    public void moveLeft(){
        System.out.println("MOVING LEFT");
    }
    public void moveRight(){
        System.out.println("MOVING RIGHT");
    }




}
