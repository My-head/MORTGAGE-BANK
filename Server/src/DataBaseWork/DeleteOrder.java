package DataBaseWork;

import java.sql.SQLException;

public class DeleteOrder {
    public static String DeleteOrders(String orderID) throws SQLException {
        int id=Integer.parseInt(orderID);
        String sqlst = "DELETE FROM bankdb.request WHERE REQUESTID="+id;

        DataBase.getInstance().execute(sqlst);


        return "ok";

    }
}
