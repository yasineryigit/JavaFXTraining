package sample;


import javafx.animation.*;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.net.http.WebSocket;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private WebView webView;

    @FXML
    private TextField textField;

    private WebEngine engine;

    private String homePage;
    private double webZoom;
    private WebHistory history;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        engine = webView.getEngine();
        homePage = "www.google.com";
        textField.setText(homePage);
        webZoom = 1;
        loadPage();

    }

    public void loadPage(){

        //engine.load("https://www.google.com");

        engine.load("http://"+textField.getText());
    }

    public void refreshPage(){
        engine.reload();
    }

    public void zoomIn(){
        webZoom+=0.25;
        webView.setZoom(webZoom);
    }

    public void zoomOut(){
        webZoom-=0.25;
        webView.setZoom(webZoom);
    }

    public void displayHistory(){
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();//her bir WebHistory.Entry objesini observable listeye atıyoruz ve yazdırıyoruz

        for(WebHistory.Entry entry : entries){
            System.out.println(entry.getUrl());
        }
    }

    public void back(){
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();//her bir WebHistory.Entry objesini observable listeye atıyoruz ve yazdırıyoruz
        history.go(-1);
        textField.setText(entries.get(history.getCurrentIndex()).getUrl());
    }

    public void forward(){
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();//her bir WebHistory.Entry objesini observable listeye atıyoruz ve yazdırıyoruz
        history.go(1);
        textField.setText(entries.get(history.getCurrentIndex()).getUrl());
    }

    public void executeJS(){
        engine.executeScript("window.location = \"https://www.youtube.com\";");
    }



}
