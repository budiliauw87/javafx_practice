package org.example.demo.ui.splash;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.example.demo.ui.home.HomeApplication;

public class Splash extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HomeApplication.class.getResource("/layout/splash-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
        System.out.println("Start Splash");
    }

    public static void main(String[] args) {
        launch();
    }
}
