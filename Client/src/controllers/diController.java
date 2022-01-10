package controllers;

import classes.OrderData;
import javafx.fxml.FXML;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;

import static sample.Main.ordersDataForAnalisys;



public class diController {

    @FXML
    private StackedBarChart<String, Number> StackedBarChart;

    @FXML
    void initialize() {


        StackedBarChart.setTitle("Диаграмма типов кредитования и их популярность");
        StackedBarChart.getXAxis().setLabel("Тип кредитования");
        StackedBarChart.getYAxis().setLabel("Количество клиентов");

      String types = null;
        for(OrderData rating: ordersDataForAnalisys){
            types+= rating.getType() ;
        }
       String t1 = "Коммерческий объект";
       String t2 = "Рефинансирование";
       String t3 = "Займ на строящуюся недвижимость";
       String t4 = "Кредит на приобретение загородной недвижимости";
       String t5 = "Кредит для приобретения квартиры";
       String t6 = "Ипотека для строительства дома";

     int  i1 = types.split(t1).length - 1;
        int  i2 = types.split(t2).length - 1;
        int  i3 = types.split(t3).length - 1;
        int  i4 = types.split(t4).length - 1;
        int  i5 = types.split(t5).length - 1;
        int  i6 = types.split(t6).length - 1;

       // for (int i = 0; i < ordersDataForAnalisys.size(); i++) {
            XYChart.Series< String,  Number > series1 = new XYChart.Series<>();
            series1.setName(ordersDataForAnalisys.get(0).getType());
            series1.getData().add(new XYChart.Data <> (  String.valueOf(0) , i1    ));
            StackedBarChart.getData().add(series1);

        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName(ordersDataForAnalisys.get(1).getType());
        series2.getData().add(new XYChart.Data <String, Number> (  String.valueOf(1) , i2   ));
        StackedBarChart.getData().add(series2);


        XYChart.Series<String, Number> series3 = new XYChart.Series<>();
        series3.setName(ordersDataForAnalisys.get(2).getType());
        series3.getData().add(new XYChart.Data <String, Number> (  String.valueOf(2) , i3   ));
        StackedBarChart.getData().add(series3);

        XYChart.Series<String, Number> series4 = new XYChart.Series<>();
        series4.setName(ordersDataForAnalisys.get(3).getType());
        series4.getData().add(new XYChart.Data <String, Number> (  String.valueOf(3) , i4    ));
        StackedBarChart.getData().add(series4);

        XYChart.Series<String, Number> series5 = new XYChart.Series<>();
        series5.setName(ordersDataForAnalisys.get(4).getType());
        series5.getData().add(new XYChart.Data <String, Number> (  String.valueOf(4) , i5    ));
        StackedBarChart.getData().add(series5);

        XYChart.Series<String, Number> series6 = new XYChart.Series<>();
        series6.setName(ordersDataForAnalisys.get(5).getType());
        series6.getData().add(new XYChart.Data <String, Number> (  String.valueOf(5) , i6    ));
        StackedBarChart.getData().add(series6);
    }

    }



