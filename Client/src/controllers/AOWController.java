package controllers;

import classes.OrderData;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static sample.Main.*;

public class AOWController implements Initializable {

    @FXML
    private Button SendButton;

    @FXML
    private TextField NameField;

    @FXML
    private TextField IncomeField;

    @FXML
    private ChoiceBox<String> PhysicalChoise;

    @FXML
    private TextField CreditsumField;

    @FXML
    private ChoiceBox<String> IncomeTypeChoice;

    @FXML
    private ChoiceBox<String> CreditsumTypeChoice;


    @FXML
    private ChoiceBox<String> TypeChoice;

    @FXML
    private CheckBox BenefitBox;

    @FXML
    private CheckBox ConditionBox;

    @FXML
    void OpenInfoAboutPrivileges() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/windows/InfoAboutPrivileges.fxml"));
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
    String ReturnTime() {
        return PhysicalChoise.getValue();
    }

    @FXML
    String ReturnCondition() {
        if (ConditionBox.isSelected())
            return "Да";
        else
            return "Нет";
    }

    @FXML
    String ReturnBenefit() {
        if (BenefitBox.isSelected())
            return "Да";
        else
            return "Нет";
    }

    @FXML
    String ReturnIncome() {
        String income;
        income = IncomeField.getText();
            return income;

    }

    @FXML
    String ReturnIncomeType() {
        return IncomeTypeChoice.getValue();
    }

    @FXML
    String ReturnName() {
        if (NameField.getText().length()!=0)
            return NameField.getText();
        else
            return "0";
    }

    @FXML
    String ReturnType() {
        return TypeChoice.getValue();
    }

    @FXML
    String ReturnCreditsum() {
        Pattern p = Pattern.compile("\\d");
        Matcher m;
        String creditsum;
        creditsum = CreditsumField.getText();
        m = p.matcher(creditsum);
        if (!m.find()) {
            CreditsumField.clear();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setHeaderText("Неверно указана сумма кредита");
            alert.showAndWait();
            return "0";
        }else {
            return creditsum;
        }
    }

    @FXML
    String ReturnCreditsumType() {
        return CreditsumTypeChoice.getValue();
    }


    @FXML
    void SendDataAboutOrder()
    {
        Random random=new Random();
        OrderData order=new OrderData();
        order.name=ReturnName();
        order.income=ReturnIncome()+" "+ReturnIncomeType();
        order.creditsum=ReturnCreditsum()+" "+ReturnCreditsumType();
        order.time=ReturnTime();
        order.type=ReturnType();
        order.benefit=ReturnBenefit();
        order.condition=ReturnCondition();
        int demoID=random.nextInt(1000000);
        order.orderID=Integer.toString(demoID);
        sendData(order.toString());
        ordersData.add(order);
        ordersDataForAnalisys.add(order);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Добавление Анкеты");
        alert.setHeaderText("Анкета добавлена");
        alert.showAndWait();
        /*
        SendButton.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/windows/UserWorkWindow.fxml"));
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

         */
    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        PhysicalChoise.getItems().add("10 лет");
        PhysicalChoise.getItems().add("15 лет");
        PhysicalChoise.getItems().add("30 лет");
        PhysicalChoise.setValue("10 лет");
        IncomeTypeChoice.getItems().addAll("BYN", "USD", "EUR", "RUB");
        IncomeTypeChoice.setValue("BYN");
        CreditsumTypeChoice.getItems().addAll("BYN","USD");
        CreditsumTypeChoice.setValue("BYN");
        TypeChoice.getItems().addAll("Кредит для приобретения квартиры","Займ на строящуюся недвижимость","Ипотека для строительства дома","Кредит на приобретение загородной недвижимости","Коммерческий объект","Рефинансирование");
        TypeChoice.setValue("Коммерческий объект");
    }
}

