package org.example.demo.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    private Label labelVersion,labelApp;


    @FXML
    private ListView listMenu;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        for(int i = 1; i<=20;i++){
            listMenu.getItems().add("Menu "+ i);
        }
        listMenu.getSelectionModel().select(0);
        System.out.println("Initialize Home Controller");
    }
}