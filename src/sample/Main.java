package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {//Açılışta sample1 scene'i gösteriyor
        Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        primaryStage.setOnCloseRequest(event -> {
            event.consume();
            logout(primaryStage);
        });//kapatma tuşuna basılınca logout metodunu çağıracak

    }


    public static void main(String[] args) {

        launch(args);
    }

    public void logout(Stage stage) {//verilen stage'den çıkma metodu

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout");
        alert.setContentText("Do you want to save before existing?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            //kapatmak istediğimiz stage'i alacağız
            stage.close();
        }
    }

}
