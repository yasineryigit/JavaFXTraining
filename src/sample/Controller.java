package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    ProgressBar myProgressBar;

    @FXML
    Label myLabel;

    BigDecimal progress = new BigDecimal(String.format("%.2f",0.0));

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        myProgressBar.setStyle("-fx-accent: #e27878;");
        myLabel.setText("Progress: "+ String.valueOf(progress));
    }

    public void increaseProgress(ActionEvent e) {
        if(progress.doubleValue()<1){ //progress tamamlanmadıysa arttır
            progress = new BigDecimal(String.format("%.2f",progress.doubleValue()+0.1));
            System.out.println(progress.doubleValue());
            myProgressBar.setProgress(progress.doubleValue());
            myLabel.setText("Progress: "+ ((int)Math.round(progress.doubleValue()*100))+"%");
        }


    }
}
