package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;



public class Scene1Controller {

    @FXML
    TextField textFieldUsername;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent e ) throws IOException {
        String username = textFieldUsername.getText();
        System.out.println(username);

        if (!username.equals("")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
            root = loader.load();

            Scene2Controller scene2Controller = loader.getController();
            scene2Controller.displayName(username);

            scene = new Scene(root);
            stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }

    }






}
