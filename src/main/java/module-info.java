module org.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;

    exports org.example.demo.ui.home;
    opens org.example.demo.ui.home to javafx.fxml;

    exports org.example.demo.ui.splash;
    opens org.example.demo.ui.splash to javafx.fxml;
}