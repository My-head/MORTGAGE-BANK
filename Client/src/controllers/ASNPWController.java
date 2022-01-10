package controllers;

import classes.UserNSP;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static sample.Main.sendData;
import static sample.Main.usersSNPData;

public class ASNPWController implements Initializable {

    @FXML
    private Button SNPButton;

    @FXML
    private TextField NameField;

    @FXML
    private TextField PatronymicField;

    @FXML
    private TextField SurnameField;

    @FXML
    void AddUserSNP() {
        UserNSP newUserNSP = new UserNSP();
newUserNSP.usurname=ReturnSurname();
newUserNSP.uname=ReturnName();
newUserNSP.upatronymic=ReturnPatronymic();
        sendData(newUserNSP.toString());
usersSNPData.add(newUserNSP);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Добавление ФИО");
        alert.setHeaderText("ФИО добавлено");
        alert.showAndWait();
    }

    @FXML
    String ReturnName() {
        Pattern p = Pattern.compile("\\D{1,}");
        Matcher m;
        String name;
        name = NameField.getText();
        m = p.matcher(name);
        if (!m.find()) {
            NameField.clear();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setHeaderText("Неверно указано имя");
            alert.setContentText("Имя должено состоять из букв ");
            alert.showAndWait();
            return "0";
        }else {
            return name;
        }
    }

    @FXML
    String ReturnSurname() {
        Pattern p = Pattern.compile("\\D{1,}");
        Matcher m;
        String surname;
        surname = SurnameField.getText();
        m = p.matcher(surname);
        if (!m.find()) {
            SurnameField.clear();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setHeaderText("Неверно указана фамилия");
            alert.setContentText("Фамилия должена состоять из букв ");
            alert.showAndWait();
            return "0";
        }else {
            return surname;
        }
    }

    @FXML
    String ReturnPatronymic() {
        Pattern p = Pattern.compile("\\D{1,}");
        Matcher m;
        String patronymic;
        patronymic = PatronymicField.getText();
        m = p.matcher(patronymic);
        if (!m.find()) {
            PatronymicField.clear();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setHeaderText("Неверно указано отчество");
            alert.setContentText("Отчество должено состоять из букв ");
            alert.showAndWait();
            return "0";
        }else {
            return patronymic;
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }




}
