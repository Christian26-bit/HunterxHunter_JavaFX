package com.example.hunterxhunterjavafx;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Main-view" +
                ".fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML private AnchorPane Homepage;

    public void goToConjurer() throws IOException {
        new SceneChanger(Homepage, "/com/example/hunterxhunterjavafx/Conjuration-view.fxml");
    }
    public void goToEnhancer() throws IOException {
        new SceneChanger(Homepage, "/com/example/hunterxhunterjavafx/Enhancer-view.fxml");
    }
}
