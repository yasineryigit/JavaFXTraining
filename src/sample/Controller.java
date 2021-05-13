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

    public void newMethod(){
        System.out.println("You selected the new menu item");
    }


}
