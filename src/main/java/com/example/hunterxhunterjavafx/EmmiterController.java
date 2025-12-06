package com.example.hunterxhunterjavafx;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class EmmiterController {
    @FXML
    private AnchorPane rootPane;
    public void goToHome() throws IOException {
        new SceneChanger(rootPane, "/com/example/hunterxhunterjavafx/Main.fxml");
    }
}
