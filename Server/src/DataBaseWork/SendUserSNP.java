package DataBaseWork;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SendUserSNP {

    public static String SendString(String substring) throws SQLException {
        String sqlst = "SELECT * FROM bankdb.userinform WHERE ID="+substring ;
        ResultSet res= DataBase.getInstance().getDatabase(sqlst);
        String sendString = "20\n";
        while (res.next()) {
            sendString = sendString +
                    res.getString(1) + "|" +
                    res.getString(2) + "|" +
                    res.getString(3) + "\n";

        }
        return sendString;
        //sendData(sendString);
    }
}
