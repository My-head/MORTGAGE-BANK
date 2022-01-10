package DataBaseWork;

import java.sql.SQLException;

public class AddNewUserSNP {

    public static String AddSNP(String Data) throws SQLException{
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
        int id=Integer.parseInt(subStr[3]);

        String sqlst = "INSERT INTO bankdb.userinform (USURNAME, UNAME, UPATRONYMIC, ID) VALUES ('" + subStr[0] + "', '" + subStr[1] + "', '" + subStr[2] + "', '" + id + "')";
        DataBase.getInstance().execute(sqlst);
        return "ok";


    }
}
