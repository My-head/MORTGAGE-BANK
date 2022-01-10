package controllers;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

import static sample.Main.ordersDataForAnalisys;



public class grController {


    @FXML
    private LineChart <Integer, Integer> LineChart;

    @FXML
   void  initialize() {



        LineChart.getYAxis().setLabel("Сроки кредитования");
        LineChart.getXAxis().setLabel("Выбранная сумма кредитования (в белорусских рублях)");

        LineChart.setTitle("График сумм и дат кредитования");


        XYChart.Series series = new XYChart.Series();
        series.setName("Сумма кредитования ");

        String ch1 = "USD";
        String ch2 = "EUR";
        String ch3 = "RUB";
        for(int i=0; i< ordersDataForAnalisys.size(); i++) {

            String num = ordersDataForAnalisys.get(i).getCreditsum();


            String tmp =  num ;

            num = num.replaceAll("BYN","").trim();
                num = num.replaceAll("USD","").trim();
                num = num.replaceAll("RUB","").trim();
            num = num.replaceAll("EUR","").trim();

            double iks =(Integer.valueOf(num));

            if (tmp.indexOf(ch1) != -1 ) iks = iks * 2.53;
            if (tmp.indexOf(ch2) != -1 ) iks = iks * 3.09;
            if (tmp.indexOf(ch3) != -1 ) iks = iks * 0.035;




                 String num1 = ordersDataForAnalisys.get(i).getTime().replaceAll("лет","").trim();

            num1 = num1.replaceAll("лет","").trim();

            series.getData().add(new XYChart.Data(iks, Integer.valueOf(num1)));
        }
        LineChart.getData().add(series);
    }
    }
