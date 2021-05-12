package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Controller {

    @FXML
    private Label myLabel;

    @FXML
    private DatePicker myDatePicker;


    public void getDate(ActionEvent event){
        LocalDate myDate = myDatePicker.getValue();
        String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("MMM-dd-yyy"));
        myLabel.setText(myFormattedDate);
    }





}
