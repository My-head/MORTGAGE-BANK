package controllers;

import classes.User;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import static sample.Main.*;

public class DWController {


    @FXML
    private Button DeleteButton;

    @FXML
    private TableView<User> UsersTable;

    @FXML
    private TableColumn<User, String> ColumnID;

    @FXML
    private TableColumn<User, String> ColumnLogin;

    @FXML
    private TableColumn<User, String> ColumnPassword;

    @FXML
    private TableColumn<User, String> ColumnEmail;

    @FXML
    private TableColumn<User, String> ColumnPhoneNumber;

    @FXML
    void DeleteAction() {
        String id;
        id=UsersTable.getSelectionModel().getSelectedItem().getUserID();
        String string="11"+id;
        usersData.remove(UsersTable.getSelectionModel().getSelectedItem());
        sendData(string);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Удаление");
        alert.setHeaderText("Пользователь удален");
        alert.showAndWait();
    }

    @FXML
    void initialize() {

        ColumnID.setCellValueFactory(new PropertyValueFactory<>("userID"));
        ColumnLogin.setCellValueFactory(new PropertyValueFactory<>("login"));
        ColumnPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        ColumnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        ColumnPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        UsersTable.setItems(usersData);
    }
}
