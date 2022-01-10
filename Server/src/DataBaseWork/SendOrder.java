package DataBaseWork;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SendOrder {

    public static String SendString(String substring) throws SQLException {
        String sqlst = "SELECT * FROM bankdb.request WHERE ID="+substring;
        ResultSet res=DataBase.getInstance().getDatabase(sqlst);
        String sendString="4 \n";
        while (res.next()){
             sendString= sendString+
                    res.getString(1)+"|"+
                    res.getString(2)+"|"+
                    res.getString(3)+"|"+
                    res.getString(4)+"|"+
                    res.getString(5)+"|"+
                    res.getString(6)+"|"+
                    res.getString(7)+"|"+
                    res.getString(8)+"\n";

        }
        return sendString;
        //sendData(sendString);
    }

}
