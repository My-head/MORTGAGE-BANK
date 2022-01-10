package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static controllers.VOFAWController.analisysInfo;

public class SAWVController {



    @FXML
    private TextField sizeField;

    @FXML
    private TextField Z111;

    @FXML
    private TextField Z121;

    @FXML
    private TextField Z131;

    @FXML
    private TextField Z211;

    @FXML
    private TextField Z221;

    @FXML
    private TextField Z231;

    @FXML
    private TextField Z311;

    @FXML
    private TextField Z321;

    @FXML
    private TextField Z331;


    @FXML
    private TextField Z112;

    @FXML
    private TextField Z122;

    @FXML
    private TextField Z132;

    @FXML
    private TextField Z212;

    @FXML
    private TextField Z222;


    @FXML
    private TextField Z232;

    @FXML
    private TextField Z312;

    @FXML
    private TextField Z322;

    @FXML
    private TextField Z332;

    @FXML
    private Button okButton;

    @FXML
    private TextField W1;

    @FXML
    private TextField W2;

    @FXML
    private TextField W3;

    @FXML
    private TextField E1;

    @FXML
    private TextField E2;

    @FXML
    private TextField E3;

    @FXML
    private TextField W;

    @FXML
    private TextField E;
    @FXML
    private TextField WP;

    @FXML
    private TextField EP;


    @FXML
    private Button saveButton;

    @FXML
    void analisys() {

        analisysInfo.setZ111((double) 2.43);
        Z111.setText(String.valueOf(2.43));

        analisysInfo.setZ121((double) 3.71);
        Z121.setText(String.valueOf(3.71));

        analisysInfo.setZ131((double) 4.93);
        Z131.setText(String.valueOf(4.93));

        analisysInfo.setZ211((double) 2.62);
        Z211.setText(String.valueOf(2.62));

        analisysInfo.setZ221((double) 4.82);
        Z221.setText(String.valueOf(4.82));

        analisysInfo.setZ231((double) 4.72);
        Z231.setText(String.valueOf(4.72));


        analisysInfo.setZ321((double) 7.17);
        Z321.setText(String.valueOf(7.17));

        analisysInfo.setZ311((double) 4.45);
        Z311.setText(String.valueOf(4.45));

        analisysInfo.setZ331((double) 3.33);
        Z331.setText(String.valueOf(3.33));

        analisysInfo.setZ112((double) 3.90);
        Z112.setText(String.valueOf(3.90));

        analisysInfo.setZ122((double) 3.71);
        Z122.setText(String.valueOf(3.71));

        analisysInfo.setZ132((double) 4.93);
        Z132.setText(String.valueOf(4.93));

        analisysInfo.setZ212((double) 5.06);
        Z212.setText(String.valueOf(5.06));

        analisysInfo.setZ222((double) 4.82);
        Z222.setText(String.valueOf(4.82));

        analisysInfo.setZ232((double) 4.72);
        Z232.setText(String.valueOf(4.72));

        analisysInfo.setZ312((double) 6.93);
        Z312.setText(String.valueOf(6.93));

        analisysInfo.setZ322((double) 7.17);
        Z322.setText(String.valueOf(7.17));

        analisysInfo.setZ332((double) 3.33);
        Z332.setText(String.valueOf(3.33));


        double demoW1 = (double) analisysInfo.getZ111();
        double demoW2 = (double) analisysInfo.getZ211();
        double demoW3 = (double) analisysInfo.getZ331();
        W1.setText(Double.toString(demoW1));
        W2.setText(Double.toString(demoW2));
        W3.setText(Double.toString(demoW3));
        analisysInfo.setW1(demoW1);
        analisysInfo.setW2(demoW2);
        analisysInfo.setW3(demoW3);
        double demoE1 = (double) analisysInfo.getZ122();
        double demoE2 = (double) analisysInfo.getZ232();
        double demoE3 = (double) analisysInfo.getZ332();
        E1.setText(Double.toString(demoE1));
        E2.setText(Double.toString(demoE2));
        E3.setText(Double.toString(demoE3));
        analisysInfo.setE1(demoE1);
        analisysInfo.setE2(demoE2);
        analisysInfo.setE3(demoE3);


        double demoW = (double) analisysInfo.getZ331();
        W.setText(Double.toString(demoW));
        analisysInfo.setW(demoW);

        double demoE = (double) analisysInfo.getZ232();
        E.setText(Double.toString(demoE));
        analisysInfo.setE(demoE);

        // new AnalisysInfo().comparison();
        double demoWP = (analisysInfo.perc3);
        WP.setText(Double.toString(demoWP));
        analisysInfo.setWP(demoWP);

        double demoEP = (analisysInfo.perc2);
        EP.setText(Double.toString(demoEP));
        analisysInfo.setE(demoEP);





    }

    @FXML
    void returnSize() {

    }

    @FXML
    void initialize() {
        String demoSize = Integer.toString(analisysInfo.getScaleSize());
        sizeField.setText(demoSize);
    }
}
