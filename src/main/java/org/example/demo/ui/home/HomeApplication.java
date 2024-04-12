package org.example.demo.ui.home;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HomeApplication.class.getResource("/layout/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Practice Example JavaFX!");
        stage.setScene(scene);
        stage.show();
        System.out.println("Home Application");
    }

    public static void main(String[] args) {
        launch();
    }
}