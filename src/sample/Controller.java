package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;




public class Controller {

    @FXML
    private Label myLabel;
    @FXML
    private TextField textFieldAge;
    @FXML
    private Button buttonSubmit;

    int age;

    public void submit(ActionEvent event) {
        try{
            age = Integer.parseInt(textFieldAge.getText());

            if(age>=18){
                myLabel.setText("You are now signed up!");
            }else{
                myLabel.setText("You must be 18+");
            }
        }
        catch (NumberFormatException e){
            myLabel.setText("Enter only number please");
        }
        catch (Exception e){
            myLabel.setText("Error: " + e.toString());
        }

    }


}
