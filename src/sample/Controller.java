package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label myLabel;

    @FXML
    private ChoiceBox<String> myChoiceBox;

    private String[] food = {"pizza","sushi","burger"};


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {//Bu controller'a sahip view gösterildiğinde bu da çalışır

        myChoiceBox.getItems().addAll(food);//choiceBox'a verileri dizi aracılığıyla veriyoruz

        myChoiceBox.setOnAction(this::getFood); //choiceBox'ta seçim yapılınca getFood metodunu çağır
    }

    public void getFood(ActionEvent e){
        String myFood = myChoiceBox.getValue();
        myLabel.setText("Your choice is: " + myFood);
    }
}
