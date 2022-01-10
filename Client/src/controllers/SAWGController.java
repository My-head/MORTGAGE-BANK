package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static controllers.VOFAWController.analisysInfo;

public class SAWGController {



    @FXML
    private TextField sizeField;

    @FXML
    private TextField A;

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
    private TextField W9;

    @FXML
    private TextField W8;

    @FXML
    private TextField W7;

    @FXML
    private TextField E1;

    @FXML
    private TextField E2;

    @FXML
    private TextField E3;

    @FXML
    private TextField E9;

    @FXML
    private TextField E8;

    @FXML
    private TextField E7;

    @FXML
    private TextField W11;

    @FXML
    private TextField W22;

    @FXML
    private TextField W33;

    @FXML
    private TextField E11;

    @FXML
    private TextField E22;

    @FXML
    private TextField E33;



    @FXML
    private TextField W;

    @FXML
    private TextField E;

    @FXML
    void analisys() {

        analisysInfo.setA(Float.parseFloat(A.getText()));
        A.setText(analisysInfo.getA()+"/"+analisysInfo.getScaleSize());

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


        double demoW1 = (double) analisysInfo.getZ131();
        double demoW2 = (double) analisysInfo.getZ221();
        double demoW3 = (double) analisysInfo.getZ321();
        W1.setText(Double.toString(demoW1));
        W2.setText(Double.toString(demoW2));
        W3.setText(Double.toString(demoW3));
        analisysInfo.setW1(demoW1);
        analisysInfo.setW2(demoW2);
        analisysInfo.setW3(demoW3);
        double demoE1 = (double) analisysInfo.getZ132();
        double demoE2 = (double) analisysInfo.getZ212();
        double demoE3 = (double) analisysInfo.getZ322();
        E1.setText(Double.toString(demoE1));
        E2.setText(Double.toString(demoE2));
        E3.setText(Double.toString(demoE3));
        analisysInfo.setE1(demoE1);
        analisysInfo.setE2(demoE2);
        analisysInfo.setE3(demoE3);

        double demoW9 = (double) analisysInfo.getZ111();
        double demoW8 = (double) analisysInfo.getZ211();
        double demoW7 = (double) analisysInfo.getZ331();
        W9.setText(Double.toString(demoW9));
        W8.setText(Double.toString(demoW8));
        W7.setText(Double.toString(demoW7));
        analisysInfo.setW9(demoW9);
        analisysInfo.setW8(demoW8);
        analisysInfo.setW7(demoW7);
        double demoE9 = (double) analisysInfo.getZ122();
        double demoE8 = (double) analisysInfo.getZ232();
        double demoE7 = (double) analisysInfo.getZ332();
        E9.setText(Double.toString(demoE9));
        E8.setText(Double.toString(demoE8));
        E7.setText(Double.toString(demoE7));
        analisysInfo.setE1(demoE1);
        analisysInfo.setE2(demoE2);
        analisysInfo.setE3(demoE3);






    }

    @FXML
    void risk(){


        double demoW11 = ((double) analisysInfo.getA()*(double) analisysInfo.getZ131())+(1-(double) analisysInfo.getA())*(double) analisysInfo.getZ111();
        double demoW22 = ((double) analisysInfo.getA()*(double) analisysInfo.getZ221())+(1-(double) analisysInfo.getA())*(double) analisysInfo.getZ211();
        double demoW33 = ((double) analisysInfo.getA()*(double) analisysInfo.getZ321())+(1-(double) analisysInfo.getA())*(double) analisysInfo.getZ331();
        W11.setText(Double.toString(demoW11));
        W22.setText(Double.toString(demoW22));
        W33.setText(Double.toString(demoW33));
        analisysInfo.setW11(demoW11);
        analisysInfo.setW22(demoW22);
        analisysInfo.setW33(demoW33);
        double demoE11 =  ((double) analisysInfo.getA()*(double) analisysInfo.getZ132())+(1-(double) analisysInfo.getA())*(double) analisysInfo.getZ122();   ;
        double demoE22 = ((double) analisysInfo.getA()*(double) analisysInfo.getZ212())+(1-(double) analisysInfo.getA())*(double) analisysInfo.getZ232();
        double demoE33= ((double) analisysInfo.getA()*(double) analisysInfo.getZ322())+(1-(double) analisysInfo.getA())*(double) analisysInfo.getZ332();
        E11.setText(Double.toString(demoE11));
        E22.setText(Double.toString(demoE22));
        E33.setText(Double.toString(demoE33));
        analisysInfo.setE11(demoE11);
        analisysInfo.setE22(demoE22);
        analisysInfo.setE33(demoE33);

        double demoW = (analisysInfo.perc3);
        W.setText(Double.toString(demoW));
        analisysInfo.setW(demoW);

        double demoE = (analisysInfo.perc2);;
        E.setText(Double.toString(demoE));
        analisysInfo.setE(demoE);




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
