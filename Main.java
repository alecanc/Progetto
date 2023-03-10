package com.example.loginpage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/loginpage/LoginPage.fxml"));
            Scene scene= new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch();
    }
}