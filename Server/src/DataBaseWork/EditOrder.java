package DataBaseWork;

import java.sql.SQLException;

public class EditOrder {
    public static String EditOrders(String orderData) throws SQLException {
        int count = 0;
        char separator = '|';
        int index = 0;
        do {
            ++count;
            ++index;
            index = orderData.indexOf(separator, index);
        }
        while (index != -1);

        String[] subStr = new String[count];
        index = 0;
        int endIndex = 0;
        for (int i = 0; i < count; i++) {
            endIndex = orderData.indexOf(separator, index);

            if (endIndex == -1)
                subStr[i] = orderData.substring(index);
            else
                subStr[i] = orderData.substring(index, endIndex);

            index = endIndex + 1;

        }

        for (int i = 0; i < subStr.length; i++) {
            System.out.print(subStr[i]);
            System.out.print("\n");
        }
        int id=Integer.parseInt(subStr[0]);
        String sqlst = "UPDATE bankdb.request " +
                "SET USERFULLNAME = '" + subStr[1]+ "', "+
                " INCOME = '" + subStr[2]+ "', "+
                " CREDITSUM = '" + subStr[3]+ "', "+
                " TIME = '" + subStr[4]+ "', "+
                " TARGET = '" + subStr[5]+ "', "+
                " BENEFIT = '" + subStr[6]+ "', "+
                " ORDERCONDITION = '" + subStr[7]+ "' "+
                " WHERE REQUESTID ="+id;

        DataBase.getInstance().execute(sqlst);
        return "ok";

    }
}
