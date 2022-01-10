package controllers;

import classes.User;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static sample.Main.sendData;
import static sample.Main.usersData;

public class    EWController {

    @FXML
    private Button saveButton;

    @FXML
    private Button editButton;

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
    private TextField EmailField;

    @FXML
    private TextField LoginField;

    @FXML
    private TextField PhoneNumberField;

    @FXML
    private TextField PasswordField;

    @FXML
    String ReturnEmail() {
        Pattern p = Pattern.compile("^\\w+[@]{1}[A-Za-z]{1,8}[.]{1}[A-Za-z]{2,6}");
        Matcher m;
        String email;
        email = EmailField.getText();
        m = p.matcher(email);
        if (!m.find()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setHeaderText("Неверно указана электронная почта");
            alert.setContentText("Почта и должна состоять из букв и/или цифр и заканчиваться @*.*");
            alert.showAndWait();
            return "0";
        }else {
            return email;
        }
    }

    @FXML
    String ReturnLogin() {
        Pattern p = Pattern.compile("\\w{1,}");
        Matcher m;
        String login;
        login = LoginField.getText();
        m = p.matcher(login);
        if (!m.find()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setHeaderText("Неверно указан логин");
            alert.setContentText("Логин должен состоять из букв и/или цифр");
            alert.showAndWait();
            return "0";
        }else {
            return login;
        }
    }

    @FXML
    String ReturnPassword() {
        Pattern p = Pattern.compile("\\w{4,}");
        Matcher m;
        String password;
        password = PasswordField.getText();
        m = p.matcher(password);
        if (!m.find()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setHeaderText("Неверно указан пароль");
            alert.setContentText("Пароль должен состоять из букв и/или цифр и быть длиннее 4 символов");
            alert.showAndWait();
            return "0";
        }else {
            return password;
        }
    }

    @FXML
    String ReturnPhoneNumber() {
        Pattern p = Pattern.compile("\\d{8}");
        Matcher m;
        String phone;
        phone = PhoneNumberField.getText();
        m = p.matcher(phone);
        if (!m.find()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setHeaderText("Неверно указан телефон");
            alert.setContentText("Номер телефона должен состоять из 9 цифр");
            alert.showAndWait();
            return "0";
        }else {
            return phone;
        }
    }

    @FXML
    void SaveAction( ) {
        User user=new User();
        user.setPhoneNumber(ReturnPhoneNumber());
        user.setEmail(ReturnEmail());
        user.setPassword(ReturnPassword());
        user.setLogin(ReturnLogin());
        user.setUserID(UsersTable.getSelectionModel().getSelectedItem().getUserID());
        sendData(user.toStringForEdit());
        UsersTable.getSelectionModel().getSelectedItem().setLogin(ReturnLogin());
        UsersTable.getSelectionModel().getSelectedItem().setPassword(ReturnPassword());
        UsersTable.getSelectionModel().getSelectedItem().setEmail(ReturnEmail());
        UsersTable.getSelectionModel().getSelectedItem().setPhoneNumber(ReturnPhoneNumber());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Изменение пользователя");
        alert.setHeaderText("Пользователь изменен");
        alert.showAndWait();
        saveButton.getScene().getWindow().hide();
    }

    @FXML
    void editAction() {
        saveButton.setDisable(false);
        LoginField.setText(UsersTable.getSelectionModel().getSelectedItem().getLogin());
        PasswordField.setText(UsersTable.getSelectionModel().getSelectedItem().getPassword());
        PhoneNumberField.setText(UsersTable.getSelectionModel().getSelectedItem().getPhoneNumber());
        EmailField.setText(UsersTable.getSelectionModel().getSelectedItem().getEmail());
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
