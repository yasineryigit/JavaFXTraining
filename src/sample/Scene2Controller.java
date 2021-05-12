package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;

public class Scene2Controller {

    @FXML
    Label labelName;

    public void displayName(String username){
        labelName.setText("Hello: " + username);
    }



}
