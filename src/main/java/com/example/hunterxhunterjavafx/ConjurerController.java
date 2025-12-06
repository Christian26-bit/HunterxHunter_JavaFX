package com.example.hunterxhunterjavafx;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class ConjurerController {
    @FXML
    private AnchorPane rootPane;
    public void goToHome() {
        new SceneChanger(rootPane, "/com/example/hunterxhunterjavafx/Main.fxml");
    }
}
