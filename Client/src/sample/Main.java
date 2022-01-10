package sample;

import classes.AnalisysInfo;
import classes.Connection.Handling;
import classes.OrderData;
import classes.User;
import classes.UserNSP;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Main extends Application implements Runnable{

    public static String ordinf;
    public static String unameinf;

    static public String UserID="0";

    static public boolean admin=false;

    public static ObservableList<OrderData> ordersData= FXCollections.observableArrayList();

    public static ObservableList<UserNSP> usersSNPData = FXCollections.observableArrayList();

    public static ObservableList<OrderData> ordersDataForAnalisys= FXCollections.observableArrayList();

    public static ObservableList<User> usersData= FXCollections.observableArrayList();

    public static AnalisysInfo analisInfo;

    static public Socket connection;

    static public ObjectOutputStream output;

    static public ObjectInputStream input;

    @Override
    public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("/windows/FirrstWindow.fxml"));
        primaryStage.setTitle("Mortgage bank");
        primaryStage.setScene(new Scene(root, 800, 474));

        primaryStage.getIcons().add(new Image("/1.png"));
        primaryStage.show();
    }





    public static void main(String[] args) {
        new Thread(new Main()).start();
        launch(args);
    }


    @Override
    public void run(){
        try{
            connection=new Socket(InetAddress.getByName("127.0.0.1"), 4567);
            output = new ObjectOutputStream(connection.getOutputStream());
            input = new ObjectInputStream(connection.getInputStream());
            while(true){
                Handling.ResponseHandling((String)input.readObject());
            }
        } catch (HeadlessException | ClassNotFoundException | IOException e){
        }
    }


    public static void  sendData(Object ob1){
        try{
            output.flush();
            output.writeObject(ob1);
        }
        catch(IOException e){}
    }
}
