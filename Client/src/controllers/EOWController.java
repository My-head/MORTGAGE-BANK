package controllers;

import classes.OrderData;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static sample.Main.ordersData;
import static sample.Main.sendData;

public class EOWController {

    @FXML
    private Button saveButton;

    @FXML
    private Button editButton;

    @FXML
    private TableView<OrderData> OrdersTable;

    @FXML
    private TableColumn<OrderData, String> ColumnID;

    @FXML
    private TableColumn<OrderData, String> ColumnName;

    @FXML
    private TableColumn<OrderData, String> ColumnIncome;

    @FXML
    private TableColumn<OrderData, String> ColumnCreditsum;

    @FXML
    private TableColumn<OrderData, String> ColumnTime;

    @FXML
    private TableColumn<OrderData, String> ColumnType;

    @FXML
    private TableColumn<OrderData, String> ColumnBenefit;

    @FXML
    private TableColumn<OrderData, String> ColumnCondition;

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
    void editAction() {
        saveButton.setDisable(false);
        NameField.setText(OrdersTable.getSelectionModel().getSelectedItem().getName());
        PhysicalChoise.setValue(OrdersTable.getSelectionModel().getSelectedItem().getTime());
        String[] incomeInfo=OrdersTable.getSelectionModel().getSelectedItem().getIncome().split(" ");
        IncomeField.setText(incomeInfo[0]);
        IncomeTypeChoice.setValue(incomeInfo[1]);
        String[] creditsumInfo=OrdersTable.getSelectionModel().getSelectedItem().getCreditsum().split(" ");
        CreditsumField.setText(creditsumInfo[0]);
        CreditsumTypeChoice.setValue(creditsumInfo[1]);
        TypeChoice.setValue(OrdersTable.getSelectionModel().getSelectedItem().getType());
        if (OrdersTable.getSelectionModel().getSelectedItem().getBenefit().equals("Да")){
            BenefitBox.setSelected(true);
        } else {
            BenefitBox.setSelected(false);
        }
        if (OrdersTable.getSelectionModel().getSelectedItem().getCondition().equals("Да")){
            ConditionBox.setSelected(true);
        }else{
            ConditionBox.setSelected(false);
        }
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
    void SaveAction( ) {
        OrderData order=new OrderData();
        order.setName(ReturnName());
        order.income=ReturnIncome()+" "+ReturnIncomeType();
        order.creditsum=ReturnCreditsum()+" "+ReturnCreditsumType();
        order.time=ReturnTime();
        order.type=ReturnType();
        order.benefit=ReturnBenefit();
        order.condition=ReturnCondition();
        order.setOrderID(OrdersTable.getSelectionModel().getSelectedItem().getID());
        sendData(order.toStringForEdit());
        OrdersTable.getSelectionModel().getSelectedItem().setName(ReturnName());
        OrdersTable.getSelectionModel().getSelectedItem().setIncome(ReturnIncome()+" "+ReturnIncomeType());
        OrdersTable.getSelectionModel().getSelectedItem().setCreditsum(ReturnCreditsum()+" "+ReturnCreditsumType());
        OrdersTable.getSelectionModel().getSelectedItem().setTime(ReturnTime());
        OrdersTable.getSelectionModel().getSelectedItem().setType(ReturnType());
        OrdersTable.getSelectionModel().getSelectedItem().setBenefit(ReturnBenefit());
        OrdersTable.getSelectionModel().getSelectedItem().setCondition(ReturnCondition());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Изменение Анкеты");
        alert.setHeaderText("Анкета изменена");
        alert.showAndWait();

        saveButton.getScene().getWindow().hide();
/*

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

    @FXML
    void initialize(){
        ColumnID.setCellValueFactory(new PropertyValueFactory<>("orderID"));
        ColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        ColumnIncome.setCellValueFactory(new PropertyValueFactory<>("income"));
        ColumnCreditsum.setCellValueFactory(new PropertyValueFactory<>("creditsum"));
        ColumnTime.setCellValueFactory(new PropertyValueFactory<>("time"));
        ColumnType.setCellValueFactory(new PropertyValueFactory<>("type"));
        ColumnBenefit.setCellValueFactory(new PropertyValueFactory<>("benefit"));
        ColumnCondition.setCellValueFactory(new PropertyValueFactory<>("condition"));
        OrdersTable.setItems(ordersData);

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
