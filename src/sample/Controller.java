package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    Circle blueCircle;
    int X = 0 ;
    int Y = 0 ;

    public void up(ActionEvent e){
        System.out.println("UP");
        blueCircle.setCenterY(Y-=10);
    }
    public void down(ActionEvent e){
        System.out.println("DOWN");
        blueCircle.setCenterY(Y+=10);
    }
    public void right(ActionEvent e){
        System.out.println("RIGHT");
        blueCircle.setCenterX(X+=10);
    }
    public void left(ActionEvent e){
        System.out.println("LEFT");
        blueCircle.setCenterX(X-=10);
    }



}
