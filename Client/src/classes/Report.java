package classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Report implements Runnable {

    @Override

    public void run() {
        File file = new File("REPORT " + " " +  new OrderData().getName() + ".txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
                FileWriter add = new FileWriter(file,  true);
                add.write("Сгенерированный отчет №" + new OrderData().getOrderID() + '\n');

                add.write("Шкала = " + new OrderData().getOrderID() + '\n');


                add.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}