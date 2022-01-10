package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import static sample.Main.*;

public class AWWController {

    @FXML
    private Button ExitButton;

    @FXML
    private Button AddUser;

    @FXML
    private Button AdminViewWindow;

    @FXML
    private Button DeleteUserButton;

    @FXML
    private Button EditUserButton;

    @FXML
    private Button AnalysisOrdersButton;

    @FXML
    void CloseAdminWindow() {
        admin=false;
        usersData.clear();
        ExitButton.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/windows/FirrstWindow.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.getIcons().add(new Image("/1.png"));
        stage.show();
    }

    @FXML
    void OpenAddUserWindow() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/windows/AAAAddUserWindow.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.getIcons().add(new Image("/1.png"));
        stage.show();
    }

    @FXML
    void OpenAdminViewWindow( ) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/windows/AdminViewWindow.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.getIcons().add(new Image("/1.png"));
        stage.show();
    }

    @FXML
    void OpenAnalysisOrdersWindow( ) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/windows/ViewOrdersForAnalisysWindow.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.getIcons().add(new Image("/1.png"));
        stage.show();
    }

    @FXML
    void OpenDeleteWindow( ) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/windows/DeleteWindow.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.getIcons().add(new Image("/1.png"));
        stage.show();
    }

    @FXML
    void OpenEditWindow() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/windows/EditWindow.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.getIcons().add(new Image("/1.png"));
        stage.show();
    }

    @FXML
    void initialize() {



    }
}
