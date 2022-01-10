package DataBaseWork;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SendUser {



    public static String  SendString(String substring) throws SQLException {
        String sqlst = "SELECT * FROM bankdb.user";
        ResultSet res= DataBase.getInstance().getDatabase(sqlst);
        String sendString="10\n";
        while (res.next()){
            sendString = sendString+
                    res.getString(1)+"|"+
                    res.getString(2)+"|"+
                    res.getString(3)+"|"+
                    res.getString(4)+"|"+
                    res.getString(5)+"\n";

        }
        return sendString;
        //sendData(sendString);
    }





}

