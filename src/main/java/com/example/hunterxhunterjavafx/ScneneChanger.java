package com.example.hunterxhunterjavafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class SceneChanger {
    public SceneChanger(AnchorPane currentView, String fxml) throws IOException {
        AnchorPane nextView = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource(fxml)));
        currentView.getChildren().removeAll();
        currentView.getChildren().setAll(nextView);
    }
}