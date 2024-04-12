package org.example.demo.controller;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SplashController implements Initializable {
    @FXML
    AnchorPane anchorLayout;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("SplashController start loading");
        FadeTransition fadeIn = new FadeTransition(Duration.seconds(1), anchorLayout);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);
        fadeIn.setCycleCount(1);
        fadeIn.play();

        //After fade in
        fadeIn.setOnFinished((e) -> finishSplash());

    }


    void finishSplash() {
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                FadeTransition fadeOut = new FadeTransition(Duration.seconds(1), anchorLayout);
                fadeOut.setFromValue(1);
                fadeOut.setToValue(0);
                fadeOut.setCycleCount(1);
                fadeOut.play();

                fadeOut.setOnFinished((e) -> {
                    System.out.println("open another page");
                    Platform.runLater(() -> {
                        Stage stage = new Stage();
                        Parent root = null;
                        try {
                            root = FXMLLoader.load(getClass().getResource("/layout/hello-view.fxml"));
                        } catch (IOException ex) {
                            Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.setMaximized(true);
                        stage.show();
                        anchorLayout.getScene().getWindow().hide();

                    });
                });
            } catch (InterruptedException ex) {
                Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
    }
}
