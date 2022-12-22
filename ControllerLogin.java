package com.example.loginpage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerLogin {
    TextField usernameTextField;
private Stage stage;
private Scene scene;
private Parent root;

public void login(ActionEvent event) throws IOException {
    String username= usernameTextField.getText();
//Parent root = new FXMLLoader(getClass().getResource("/com/example/loginpage/Home.fxml"));
   FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/loginpage/Home.fxml"));
    root =loader.load();
    ControllerHome scene2c= loader.getController();
    scene2c.displayName(username);
    //root= FXMLLoader.load(getClass().getResource("Home.fxml"));
    stage= (Stage)((Node)event.getSource()).getScene().getWindow();
    scene= new Scene(root);
    stage.setScene(scene);
    stage.show();
}
    }
