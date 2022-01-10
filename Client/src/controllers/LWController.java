package controllers;

import classes.Connection.Handling;
import classes.DateForLogin;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.io.IOException;

import static sample.Main.sendData;

public class LWController {

    @FXML
    private Label FirstName;


    @FXML
    private Button RegButton;

    @FXML
    private Button LoginButton;

    @FXML
    private TextField FieldOfLogin;

    @FXML
    private PasswordField FieldOfPassword;


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
        stage.getIcons().add(new Image("/1.png"));
        stage.show();
    };

    @FXML
    void SendDataForLogin() throws InterruptedException {
        DateForLogin newDate = new DateForLogin();
        newDate.login = ReturnLogin();
        newDate.password = ReturnPassword();

        if (newDate.login!="0" && newDate.password!="0") {

            if (newDate.login.equals("admin") && newDate.password.equals("admin")) {

                sendData("10");

                LoginButton.getScene().getWindow().hide();
                FXMLLoader loader1 = new FXMLLoader();
                loader1.setLocation(getClass().getResource("/windows/AdminWorkWindow.fxml"));
                try {
                    loader1.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent root = loader1.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.getIcons().add(new Image("/1.png"));
                stage.show();
            }
            else {
                sendData(newDate.toString());
                Thread.sleep(600);
                if (Handling.bool) {
                    LoginButton.getScene().getWindow().hide();
                    FXMLLoader loader1 = new FXMLLoader();
                    loader1.setLocation(getClass().getResource("/windows/UserWorkWindow.fxml"));
                    try {
                        loader1.load();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Parent root = loader1.getRoot();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root));
                    stage.getIcons().add(new Image("/1.png"));
                    stage.show();
                } else {
                    FieldOfLogin.clear();
                    FieldOfPassword.clear();
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Ошибка");
                    alert.setHeaderText("Неверно введены данные");
                    alert.showAndWait();
                }
            }
        }
    }

    @FXML
    String ReturnLogin() {
        String login;
        login=FieldOfLogin.getText();
        if (!login.isEmpty()) {
            return login;
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setHeaderText("Данные не введены");
            alert.showAndWait();
            return "0";
        }
    }



    @FXML
    String ReturnPassword() {
        String password;
        password = FieldOfPassword.getText();
        if (!password.isEmpty()) {
            return password;
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setHeaderText("Данные не введены");
            alert.showAndWait();
            return "0";
        }
    }
}


