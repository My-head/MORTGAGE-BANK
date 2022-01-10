package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class FWController {

    @FXML
    private Label EnterSys;

    @FXML
    private Label FirstName;


    @FXML
    private Button LogButton;

    @FXML
    private Button RegButton;

    @FXML
    void OpenLoginWindow() {
        LogButton.getScene().getWindow().hide();


        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/windows/LoginWindow.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.getIcons().add(new Image("/1.png"));
        stage.showAndWait();

    }

    @FXML
    void OpenRegWindow() {
        RegButton.getScene().getWindow().hide();
        FXMLLoader loader1 = new FXMLLoader();
        loader1.setLocation(getClass().getResource("/windows/RegistrationWindow.fxml"));
        try {
            loader1.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader1.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
