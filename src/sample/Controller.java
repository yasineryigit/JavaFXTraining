package sample;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Controller {

    @FXML
    ImageView myImageView;
    Button myButton;

    Image image1  = new Image(getClass().getResourceAsStream("hulk1.jpg"));
    Image image2  = new Image(getClass().getResourceAsStream("hulk2.jpg"));

    public void displayImage(){
        if(myImageView.getImage()!=image1){
            myImageView.setImage(image1);
        }else{
            myImageView.setImage(image2);
        }

    }


}
