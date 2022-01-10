package DataBaseWork;

import java.sql.ResultSet;
import java.sql.SQLException;

import static DataBaseWork.DataBase.*;

public class ChekAvailabilityUser {
    public static String Verify(String Data) throws SQLException {
        int count = 0;
        char separator = '|';
        int index = 0;
        do {
            ++count;
            ++index;
            index = Data.indexOf(separator, index);
        }
        while (index != -1);

        String[] subStr = new String[count];
        index = 0;
        int endIndex = 0;
        for (int i = 0; i < count; i++) {
            endIndex = Data.indexOf(separator, index);

            if (endIndex == -1)
                subStr[i] = Data.substring(index);
            else
                subStr[i] = Data.substring(index, endIndex);

            index = endIndex + 1;

        }



        String sqlst = new String("SELECT * FROM bankdb.user WHERE LOGIN='" + subStr[0] + "' and PASSWORD='" + subStr[1] + "'");
        ResultSet res = DataBase.getInstance().getDatabase(sqlst);
        if (res.next()) {
            return "2Y" + res.getString(1);


        } else {
            return "2N";
                    //sendData("2N");
        }
    }
}

