package controllers;

import classes.OrderData;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

import static sample.Main.ordersData;
import static sample.Main.sendData;

public class VAWController {

    @FXML
    private TableView<OrderData> OrdersTable;

    @FXML
    private TableColumn<OrderData, String> ColumnID;

    @FXML
    private TableColumn<OrderData, String> columnName;

    @FXML
    private TableColumn<OrderData, String> columnTime;

    @FXML
    private TableColumn<OrderData, String> columnIncome;

    @FXML
    private TableColumn<OrderData, String> columnCreditsum;

    @FXML
    private TableColumn<OrderData, String> columnType;

    @FXML
    private TableColumn<OrderData, String> columnBenefit;

    @FXML
    private TableColumn<OrderData, String> columnCondition;

    @FXML
    private Button viewButton;

    @FXML
    void viewAction() {
        sendData("15"+OrdersTable.getSelectionModel().getSelectedItem().getOrderID());

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/windows/ViewAnalisysOrderWindow.fxml"));
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
    void initialize() throws InterruptedException {
        Thread.sleep(600);
        ColumnID.setCellValueFactory(new PropertyValueFactory<>("orderID"));

        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnIncome.setCellValueFactory(new PropertyValueFactory<>("income"));
        columnCreditsum.setCellValueFactory(new PropertyValueFactory<>("creditsum"));
        columnTime.setCellValueFactory(new PropertyValueFactory<>("time"));
        columnType.setCellValueFactory(new PropertyValueFactory<>("type"));
        columnBenefit.setCellValueFactory(new PropertyValueFactory<>("benefit"));
        columnCondition.setCellValueFactory(new PropertyValueFactory<>("condition"));
        OrdersTable.setItems(ordersData);
    }
}
