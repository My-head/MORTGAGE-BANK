package controllers;

import classes.OrderData;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import static sample.Main.ordersData;
import static sample.Main.sendData;

public class DOWController {


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
    private Button DeleteButton;

    @FXML
    void DeleteAction() {
        String id;
        id=OrdersTable.getSelectionModel().getSelectedItem().getID();
        String string="6 "+id;
        ordersData.remove(OrdersTable.getSelectionModel().getSelectedItem());
        sendData(string);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Удаление");
        alert.setHeaderText("Анкета удалена");
        alert.showAndWait();
        /*
        DeleteButton.getScene().getWindow().hide();
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
        stage.show();*/
    }

    @FXML
    void initialize() {
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
