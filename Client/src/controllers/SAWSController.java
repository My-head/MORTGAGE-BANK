package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static controllers.VOFAWController.analisysInfo;

public class SAWSController {



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
    private TextField Z113;

    @FXML
    private TextField Z123;

    @FXML
    private TextField Z133;

    @FXML
    private TextField Z213;

    @FXML
    private TextField Z223;

    @FXML
    private TextField Z233;

    @FXML
    private TextField Z313;

    @FXML
    private TextField Z323;

    @FXML
    private TextField Z333;


    @FXML
    private TextField Z114;

    @FXML
    private TextField Z124;

    @FXML
    private TextField Z134;

    @FXML
    private TextField Z214;

    @FXML
    private TextField Z224;


    @FXML
    private TextField Z234;

    @FXML
    private TextField Z314;

    @FXML
    private TextField Z324;

    @FXML
    private TextField Z334;



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


        double demoW1 = (double) analisysInfo.getZ311();
        double demoW2 = (double) analisysInfo.getZ321();
        double demoW3 = (double) analisysInfo.getZ131();
        W1.setText(Double.toString(demoW1));
        W2.setText(Double.toString(demoW2));
        W3.setText(Double.toString(demoW3));
        analisysInfo.setW1(demoW1);
        analisysInfo.setW2(demoW2);
        analisysInfo.setW3(demoW3);
        double demoE1 = (double) analisysInfo.getZ312();
        double demoE2 = (double) analisysInfo.getZ322();
        double demoE3 = (double) analisysInfo.getZ132();
        E1.setText(Double.toString(demoE1));
        E2.setText(Double.toString(demoE2));
        E3.setText(Double.toString(demoE3));
        analisysInfo.setE1(demoE1);
        analisysInfo.setE2(demoE2);
        analisysInfo.setE3(demoE3);







    }

    @FXML
    void risk(){

        analisysInfo.setZ113((double) analisysInfo.getZ311()-(double) 2.43);
        Z113.setText(String.valueOf((double) analisysInfo.getZ311()-2.43));

        analisysInfo.setZ123((double) analisysInfo.getZ321()-(double) 3.71);
        Z123.setText(String.valueOf((double) analisysInfo.getZ321()-3.71));

        analisysInfo.setZ133((double) analisysInfo.getZ131()-(double) 4.93);
        Z133.setText(String.valueOf((double) analisysInfo.getZ131()-4.93));

        analisysInfo.setZ213((double) analisysInfo.getZ311()-(double) 2.62);
        Z213.setText(String.valueOf((double) analisysInfo.getZ311()-2.62));

        analisysInfo.setZ223((double) analisysInfo.getZ321()-(double) 4.82);
        Z223.setText(String.valueOf((double) analisysInfo.getZ321()-4.82));

        analisysInfo.setZ233((double) analisysInfo.getZ131()-(double) 4.72);
        Z233.setText(String.valueOf((double) analisysInfo.getZ131()-4.72));


        analisysInfo.setZ323((double) analisysInfo.getZ321()-(double) 7.17);
        Z323.setText(String.valueOf((double) analisysInfo.getZ321()-7.17));

        analisysInfo.setZ313((double) analisysInfo.getZ311()-(double) 4.45);
        Z313.setText(String.valueOf((double) analisysInfo.getZ311()-4.45));

        analisysInfo.setZ333((double) analisysInfo.getZ131()-(double) 3.33);
        Z333.setText(String.valueOf((double) analisysInfo.getZ131() - 3.33));

        analisysInfo.setZ114((double) analisysInfo.getZ312()-(double) 3.90);
        Z114.setText(String.valueOf((double) analisysInfo.getZ312()-3.90));

        analisysInfo.setZ124((double) analisysInfo.getZ322()-(double) 3.71);
        Z124.setText(String.valueOf((double) analisysInfo.getZ322()-3.71));

        analisysInfo.setZ134((double) analisysInfo.getZ132()-(double) 4.93);
        Z134.setText(String.valueOf((double) analisysInfo.getZ132()-4.93));

        analisysInfo.setZ214((double) analisysInfo.getZ312()-(double) 5.06);
        Z214.setText(String.valueOf((double) analisysInfo.getZ312()-5.06));

        analisysInfo.setZ224((double) analisysInfo.getZ322()-(double) 4.82);
        Z224.setText(String.valueOf((double) analisysInfo.getZ322()-4.82));

        analisysInfo.setZ234((double) analisysInfo.getZ132()-(double) 4.72);
        Z234.setText(String.valueOf((double) analisysInfo.getZ132()-4.72));

        analisysInfo.setZ314((double) analisysInfo.getZ312()-(double) 6.93);
        Z314.setText(String.valueOf((double) analisysInfo.getZ312()-6.93));

        analisysInfo.setZ324((double) analisysInfo.getZ322()-(double) 7.17);
        Z324.setText(String.valueOf((double) analisysInfo.getZ322()-7.17));

        analisysInfo.setZ334((double) analisysInfo.getZ132()-(double) 3.33);
        Z334.setText(String.valueOf((double) analisysInfo.getZ132()-3.33));

        double demoW11 = (double) analisysInfo.getZ124();
        double demoW22 = (double) analisysInfo.getZ223();
        double demoW33 = (double) analisysInfo.getZ333();
        W11.setText(Double.toString(demoW11));
        W22.setText(Double.toString(demoW22));
        W33.setText(Double.toString(demoW33));
        analisysInfo.setW11(demoW11);
        analisysInfo.setW22(demoW22);
        analisysInfo.setW33(demoW33);
        double demoE11 = (double) analisysInfo.getZ124();
        double demoE22 = (double) analisysInfo.getZ224();
        double demoE33= (double) analisysInfo.getZ333();
        E11.setText(Double.toString(demoE11));
        E22.setText(Double.toString(demoE22));
        E33.setText(Double.toString(demoE33));
        analisysInfo.setE11(demoE11);
        analisysInfo.setE22(demoE22);
        analisysInfo.setE33(demoE33);

        double demoW = (double) analisysInfo.getZ333();
        W.setText(Double.toString(demoW));
        analisysInfo.setW(demoW);

        double demoE = (double) analisysInfo.getZ333();
        E.setText(Double.toString(demoE));
        analisysInfo.setE(demoE);


        double demoWP = (analisysInfo.perc3);
        WP.setText(Double.toString(demoWP));
        analisysInfo.setWP(demoWP);

        double demoEP = (analisysInfo.perc3);
        EP.setText(Double.toString(demoEP));
        analisysInfo.setE(demoEP);

    }


    @FXML
    void returnSize() {

    }

    @FXML
    void saveAnalisys() {
        saveButton.getScene().getWindow().hide();
    }

    @FXML
    void initialize() {
        String demoSize = Integer.toString(analisysInfo.getScaleSize());
        sizeField.setText(demoSize);
    }
}
