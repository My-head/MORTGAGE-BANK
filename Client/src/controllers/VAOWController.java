package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import static sample.Main.analisInfo;

public class VAOWController {

    @FXML
    private TextField sizeField;

    @FXML
    private TextField Z121;

    @FXML
    private TextField Z131;

    @FXML
    private TextField Z211;

    @FXML
    private TextField Z231;

    @FXML
    private TextField Z311;

    @FXML
    private TextField Z321;

    @FXML
    private TextField Z122;

    @FXML
    private TextField Z132;

    @FXML
    private TextField Z212;

    @FXML
    private TextField Z232;

    @FXML
    private TextField Z312;

    @FXML
    private TextField Z322;

    @FXML
    private TextField f11;

    @FXML
    private TextField f21;

    @FXML
    private TextField f31;

    @FXML
    private TextField f12;

    @FXML
    private TextField f22;

    @FXML
    private TextField f32;

    @FXML
    private TextField v11;

    @FXML
    private TextField v21;

    @FXML
    private TextField v31;

    @FXML
    private TextField v12;

    @FXML
    private TextField v22;

    @FXML
    private TextField v32;

    @FXML
    private TextField W1;

    @FXML
    private TextField W2;

    @FXML
    private TextField W3;

    @FXML
    void initialize() {
        Z121.setText(analisInfo.getZ121()+"/"+analisInfo.getScaleSize());
        Z131.setText(analisInfo.getZ131()+"/"+analisInfo.getScaleSize());
        Z211.setText(analisInfo.getZ211()+"/"+analisInfo.getScaleSize());
        Z231.setText(analisInfo.getZ231()+"/"+analisInfo.getScaleSize());
        Z311.setText(analisInfo.getZ311()+"/"+analisInfo.getScaleSize());
        Z321.setText(analisInfo.getZ321()+"/"+analisInfo.getScaleSize());

        Z121.setText(analisInfo.getZ121()+"/"+analisInfo.getScaleSize());
        Z131.setText(analisInfo.getZ131()+"/"+analisInfo.getScaleSize());
        Z211.setText(analisInfo.getZ211()+"/"+analisInfo.getScaleSize());
        Z231.setText(analisInfo.getZ231()+"/"+analisInfo.getScaleSize());
        Z311.setText(analisInfo.getZ311()+"/"+analisInfo.getScaleSize());
        Z321.setText(analisInfo.getZ321()+"/"+analisInfo.getScaleSize());

        W1.setText(String.valueOf(analisInfo.getW1()));
        W2.setText(String.valueOf(analisInfo.getW2()));
        W3.setText(String.valueOf(analisInfo.getW3()));
    }
}
