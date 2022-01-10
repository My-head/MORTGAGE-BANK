package sample;



import ConnectionWork.ActionSelection;

import java.io.*;
import java.net.*;
import java.sql.SQLException;

public class ClientSocket extends Thread {

    private int number;
    public Socket socket;
    public ObjectInputStream in;
    public ObjectOutputStream out;

    public ClientSocket(Socket s, int number) throws IOException {
        this.number = number;
        socket = s;
        in = new ObjectInputStream(socket.getInputStream());
        out = new ObjectOutputStream(socket.getOutputStream());
        start();
    }


    @Override
    public void run() {
        try {
            ActionSelection actionMenu = new ActionSelection();
            while(true) {
                sendData(actionMenu.DataProcessing((String)in.readObject()));
            }
        }
        catch (IOException | SQLException | ClassNotFoundException e) {
            System.out.println("Пользователь " + number + " отключился.");
        } finally {
            try {
                socket.close();
            }
            catch (IOException e) {
                System.err.println("Сокет не закрыт");
            }
        }
    }

    public void sendData(String ob1){
        try{
            out.flush();
            out.writeObject(ob1);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}