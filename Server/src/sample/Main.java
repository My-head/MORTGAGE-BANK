package sample;

import ConnectionWork.ActionSelection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import DataBaseWork.DataBase;

import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;

public class Main extends Application implements Runnable{
    public static int clients = 1;



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Mortgage bank Server");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        new Thread(new Main()).start();
        launch(args);
    }

    @Override
    public void run(){

        ServerSocket s = null;
        try {
            DataBase.getInstance();
            System.out.println("Сервер запущен");
            s = new ServerSocket(4567);
            while (true) {
                Socket socket = s.accept();
                if (socket!=null)
                {
                    System.out.println("Подключился " + clients + " пользователь. " + socket.getInetAddress());
                    new ClientSocket(socket, clients);
                    clients++;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ошибка сервера...");
        }finally {
            try {
                System.out.println("Сервер отключён.");
                assert s != null;
                s.close();
            }catch (IOException e) {
                System.out.println("Ошибка завершения работы сервера...");
            }
        }
    }



}

