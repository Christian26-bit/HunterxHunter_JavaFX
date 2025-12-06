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
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML private AnchorPane Homepage;
    @FXML private AnchorPane rootPane;

    public void goToConjurer() throws IOException {
        new SceneChanger(rootPane, "/com/example/hunterxhunterjavafx/Conjuration-view.fxml");
    }
    public void goToEnhancer() throws IOException {
        new SceneChanger(Homepage, "/com/example/hunterxhunterjavafx/Enhancer-view.fxml");
    }
    public void goToManipulator() throws IOException {
        new SceneChanger(Homepage, "/com/example/hunterxhunterjavafx/Manipulator-view.fxml");
    }
    public void goToSpecialization() throws IOException {
        new SceneChanger(Homepage, "/com/example/hunterxhunterjavafx/Specialization-view.fxml");
    }
    public void goToTransmutator() throws IOException {
        new SceneChanger(Homepage, "/com/example/hunterxhunterjavafx/Transmutator-view.fxml");
    }
    public void goToEmmiter() throws IOException {
        new SceneChanger(Homepage, "/com/example/hunterxhunterjavafx/Emmiter-view.fxml");
    }
}
