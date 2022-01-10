package controllers;

import classes.User;
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

import java.io.IOException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static sample.Main.sendData;

public class RWController {

    public static int i=0;

    @FXML
    private Button RegButton;

    @FXML
    private TextField EmailField;

    @FXML
    private TextField LoginField;

    @FXML
    private TextField PhoneNumberField;

    @FXML
    private PasswordField PasswordTField;

    @FXML
    private Button LogButton;

    @FXML
    void OpenLogWindow() {
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
        stage.show();
    }


    @FXML
    void Registration() {
        i++;
        int count = 0;
        User newUser = new User();
        if (ReturnPhoneNumber() != "0") {
            newUser.phoneNumber = ReturnPhoneNumber();
            count++;
        }
        if (ReturnEmail() != "0") {
            newUser.email = ReturnEmail();
            count++;
        }
        if (ReturnLogin() != "0") {
            newUser.login = ReturnLogin();
            count++;
        }
        if (ReturnPassword() != "0") {
            newUser.password = ReturnPassword();
            count++;
        }
        Random random = new Random();
        int demoID=random.nextInt(1000000);
        newUser.userID=Integer.toString(demoID);
        if (count == 4) {
            sendData(newUser.toString());
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("");
            alert.setHeaderText("Пользователь зарегистрирован");
            alert.setContentText("");
            alert.showAndWait();
        }
        RegButton.getScene().getWindow().hide();
        OpenLogWindow();
    }

    @FXML
    String ReturnPhoneNumber() {
        Pattern p = Pattern.compile("\\d{9}");
        Matcher m;
        String phone;
        phone = PhoneNumberField.getText();
        m = p.matcher(phone);
        if (!m.find()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setHeaderText("Неверно указан телефон");
            alert.setContentText("Номер телефона должен состоять из 9 цифр или более");
            alert.showAndWait();
            return "0";
        }else {
            return phone;
        }
    }

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
            alert.setContentText("Почта должна состоять из латинские букв и/или цифр и заканчиваться @*.*");
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
        password = PasswordTField.getText();
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
}
