package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;




public class Controller {

    @FXML
    private Label myLabel;
    @FXML
    private CheckBox myCheckBox;

    public void change(ActionEvent e){
        if (myCheckBox.isSelected()) {
            myLabel.setText("ON");
        } else {
            myLabel.setText("OFF");
        }
    }


}
