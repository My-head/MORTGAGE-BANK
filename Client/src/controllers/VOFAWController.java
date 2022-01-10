package controllers;

import classes.AnalisysInfo;
import classes.OrderData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static sample.Main.ordersDataForAnalisys;
import static sample.Main.sendData;

public class VOFAWController {



    static AnalisysInfo analisysInfo = new AnalisysInfo();

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
    void initialize() {
        ColumnID.setCellValueFactory(new PropertyValueFactory<>("orderID"));
        ColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        ColumnIncome.setCellValueFactory(new PropertyValueFactory<>("income"));
        ColumnCreditsum.setCellValueFactory(new PropertyValueFactory<>("creditsum"));
        ColumnTime.setCellValueFactory(new PropertyValueFactory<>("time"));
        ColumnType.setCellValueFactory(new PropertyValueFactory<>("type"));
        ColumnBenefit.setCellValueFactory(new PropertyValueFactory<>("benefit"));
        ColumnCondition.setCellValueFactory(new PropertyValueFactory<>("condition"));

        OrdersTable.setItems(ordersDataForAnalisys);
    }

    @FXML
    void  refreshOrders() {
        sendData("13");

        sendData("5 ");
    }




    @FXML
    void analisysAction(ActionEvent event) {
        analisysInfo.setOrderID(OrdersTable.getSelectionModel().getSelectedItem().getID());
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/windows/ScaleSizeWindow.fxml"));
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
    void grAction(){


        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/windows/gr.fxml"));

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
    void diAction(){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/windows/di.fxml"));
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
    void createRep() throws IOException {
        String fileName = "Отчет о запрашиваемых суммах кредитования.txt";
        File file = new File(fileName);
        FileWriter writer = new FileWriter(file, false);
        String text = "Запрашиваемые суммы кредитования:\n";
        for(OrderData rating: ordersDataForAnalisys){
            text+="Сумма и валюта запрашиваемого кредита: " + rating.getCreditsum()  + ";  ФИО клиента " + rating.getName() + ";\n";
        }
        writer.write(text);
        writer.flush();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Информация");
        alert.setHeaderText("Отчет сохранен");
        alert.showAndWait();
    }

}
