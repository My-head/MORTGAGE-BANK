package controllers;

import classes.OrderData;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static sample.Main.ordersData;


public class VOWController {

    ArrayList<OrderData> arrayList;
    OrderData orderData;

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
    void createOrder() throws IOException {
        String fileName = "Отчет.txt";
        File file = new File(fileName);
        FileWriter writer = new FileWriter(file, false);
        String text = "Клиент " + ordersData.get(1).getName() +  " (годовой доход) - " + ordersData.get(1).getIncome() +  "\n" +
                "Запросы на кредитование:\n";
        for(OrderData rating: ordersData){
            text+="Сумма запрашиваемого кредита: " + rating.getCreditsum()  + ";  срок кредитования: " + rating.getTime() + "; тип кредитования: " + rating.getType() + "\n";
        }
        writer.write(text);
        writer.flush();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Информация");
        alert.setHeaderText("Выписка сохранена");
        alert.showAndWait();
    }


    @FXML
    void initialize() {

        ColumnID.setCellValueFactory(new PropertyValueFactory<>("orderID"));
        ColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        ColumnIncome.setCellValueFactory(new PropertyValueFactory<>("income"));
        ColumnCreditsum.setCellValueFactory(new PropertyValueFactory<>("creditsum"));
        ColumnTime.setCellValueFactory(new PropertyValueFactory<>("time"));
        ColumnType.setCellValueFactory(new PropertyValueFactory<>("type"));
        ColumnBenefit.setCellValueFactory(new PropertyValueFactory<>("benefit"));
        ColumnCondition.setCellValueFactory(new PropertyValueFactory<>("condition"));
        OrdersTable.setItems(ordersData);


    }

}
