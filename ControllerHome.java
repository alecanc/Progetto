package com.example.loginpage;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerHome {
    @FXML
    Label ciaoLabel;

    public void displayName(String username){
ciaoLabel.setText("heelo: " + username);
    }
}
