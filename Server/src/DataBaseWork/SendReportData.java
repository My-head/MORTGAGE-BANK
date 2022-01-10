package DataBaseWork;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SendReportData {

    public static String SendString(String substring) throws SQLException {
        String sqlst = "SELECT CREDITSUM FROM bankdb.request WHERE ID="+substring;
        ResultSet res= DataBase.getInstance().getDatabase(sqlst);
        String sendString="5 \n";
        while (res.next()){
            sendString= sendString+
                    res.getString(1)+"\n";

        }
        return sendString;
        //sendData(sendString);
    }

}