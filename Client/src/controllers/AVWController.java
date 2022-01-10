package controllers;

import classes.User;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import static sample.Main.usersData;

public class AVWController {


    @FXML
    private TableView<User> UsersTable;

    @FXML
    private TableColumn<User, String> ColumnID;

/*
    @FXML
    private TableColumn<User, String> ColumnSurname;


    @FXML
    private TableColumn<User, String> ColumnName;


    @FXML
    private TableColumn<User, String> ColumnPatronymic;
*/


    @FXML
    private TableColumn<User, String> ColumnLogin;

    @FXML
    private TableColumn<User, String> ColumnPassword;

    @FXML
    private TableColumn<User, String> ColumnEmail;

    @FXML
    private TableColumn<User, String> ColumnPhoneNumber;

    @FXML
    void initialize() {
        ColumnID.setCellValueFactory(new PropertyValueFactory<>("userID"));
/*
ColumnSurname.setCellValueFactory(new PropertyValueFactory<>("usurname"));
ColumnName.setCellValueFactory(new PropertyValueFactory<>("uname"));
ColumnPatronymic.setCellValueFactory(new PropertyValueFactory<>("upatronymic"));*/
        ColumnLogin.setCellValueFactory(new PropertyValueFactory<>("login"));
        ColumnPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        ColumnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        ColumnPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        UsersTable.setItems(usersData);
    }



}
