package DataBaseWork;

import java.sql.SQLException;

public class InsertNewOrder {

    public static String InsertInDataBase(String Data) throws SQLException {
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
        int idd=Integer.parseInt(subStr[8]);
        int id=Integer.parseInt(subStr[8]);

        String sqlst = ("INSERT INTO bankdb.request (REQUESTID, USERFULLNAME, INCOME, CREDITSUM, TIME, TARGET, BENEFIT, ORDERCONDITION, ID)" +
                "VALUES (" + Integer.parseInt(subStr[0]) + ", '" + subStr[1] + "', '" + subStr[2] + "', '" + subStr[3] + "', '" + subStr[4] + "', '" + subStr[5] + "', '" + subStr[6] + "', '" + subStr[7] + "', '" + id + "')");

        DataBase.getInstance().execute(sqlst);
        return "ok";
        //sendData("ok");
    }
}
