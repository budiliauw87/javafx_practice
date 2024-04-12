package org.example.demo.ui.home;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private Button testButton;

    @FXML
    private ListView listMenu;

    @FXML
    protected void onTesClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Initialize");
        System.out.println("Home Controller");
    }
}