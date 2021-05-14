package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {//Açılışta sample1 scene'i gösteriyor
        FXMLLoader loader = new  FXMLLoader(getClass().getResource("Scene.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();


        primaryStage.setOnCloseRequest(event -> {logout(primaryStage);}); //stage'i kapatma isteğinde bu metod çalışır


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
