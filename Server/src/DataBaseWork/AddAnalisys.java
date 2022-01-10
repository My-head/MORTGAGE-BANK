package DataBaseWork;

import java.sql.ResultSet;
import java.sql.SQLException;

import static DataBaseWork.DataBase.*;

public class AddAnalisys {

    public static String Add(String Data) throws SQLException {
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

        for (int i = 0; i < subStr.length; i++) {
            System.out.print(subStr[i]);
            System.out.print("\n");
        }

        String sqlst = ("SELECT * FROM bankdb.request WHERE REQUESTID='" + subStr[1] + "';");
        ResultSet res= DataBase.getInstance().getDatabase(sqlst);
        if (res.next()) {
            String sqlstr = subStr[0] + ", " + res.getString(9) + ");";
            DataBase.getInstance().execute(sqlstr);
        }
        return "ок";
    }
}
