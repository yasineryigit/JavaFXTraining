package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.PipedReader;
import java.util.Objects;

public class Controller {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToSample1(ActionEvent event) throws IOException {
        System.out.println("2.ye geç");
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sample1.fxml")));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSample2(ActionEvent event) throws IOException {
        System.out.println("1.ye geç");
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sample2.fxml")));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}
