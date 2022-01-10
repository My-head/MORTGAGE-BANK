package DataBaseWork;

import java.sql.SQLException;
//import static sample.Main.sendData;

public class AddNewUser {




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


        String sqlst = ("INSERT INTO bankdb.user (ID, LOGIN, PASSWORD, EMAIL, PHONENUMBER)" +
                "VALUES (" + subStr[0] + ", '" + subStr[3] + "', '" + subStr[4] + "', '" + subStr[2] + "', '" + subStr[1] + "')");

        DataBase.getInstance().execute(sqlst);
        return "ок";
        //sendData("ok");
    }
}
