package DataBaseWork;

import java.sql.SQLException;

public class EditUser {
    public static String EditUsers(String userData) throws SQLException {
        int count = 0;
        char separator = '|';
        int index = 0;
        do {
            ++count;
            ++index;
            index = userData.indexOf(separator, index);
        }
        while (index != -1);

        String[] subStr = new String[count];
        index = 0;
        int endIndex = 0;
        for (int i = 0; i < count; i++) {
            endIndex = userData.indexOf(separator, index);

            if (endIndex == -1)
                subStr[i] = userData.substring(index);
            else
                subStr[i] = userData.substring(index, endIndex);

            index = endIndex + 1;

        }

        for (int i = 0; i < subStr.length; i++) {
            System.out.print(subStr[i]);
            System.out.print("\n");
        }
        int id=Integer.parseInt(subStr[0]);
        String sqlst = "UPDATE bankdb.user " +
                "SET PHONENUMBER = '" + subStr[1]+ "', "+
                " EMAIL = '" + subStr[2]+ "', "+
                " LOGIN = '" + subStr[3]+ "', "+
                " PASSWORD = '" + subStr[4]+ "' "+
                "WHERE ID="+id;

        DataBase.getInstance().execute(sqlst);
        return "ok";
        //sendData("ok");
    }
}
