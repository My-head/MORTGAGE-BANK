package DataBaseWork;

import java.sql.SQLException;

public class DeleteUser {
    public static String DeleteUsers(String userID) throws SQLException {
        int id=Integer.parseInt(userID);
        String sqlst = "DELETE FROM bankdb.user WHERE ID="+id;

        DataBase.getInstance().execute(sqlst);
        sqlst = "DELETE FROM bankdb.request WHERE ID="+id;
        DataBase.getInstance().execute(sqlst);


        return "ok";

    }
}
