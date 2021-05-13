package sample;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Spinner<Integer> mySpinner;

    @FXML
    private Label myLabel;

    int currentValue;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10); //1 den 10 a kadar elemanları dizecek

        valueFactory.setValue(1);
        mySpinner.setValueFactory(valueFactory);
        currentValue=mySpinner.getValue();

        myLabel.setText(Integer.toString(currentValue));

        mySpinner.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observableValue, Integer integer, Integer t1) {

                currentValue=mySpinner.getValue();

                myLabel.setText(Integer.toString(currentValue));

            }
        });
    }


}
