package com.example.hunterxhunterjavafx;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class EmmiterController {
    @FXML
    private AnchorPane Homepage;
    public void goToHome() throws IOException {
        new SceneChanger(Homepage, "/com/example/hunterxhunterjavafx/Main.fxml");
    }
}
