package DataBaseWork;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import java.sql.*;


public class DataBase {

    private static DataBase database;
    private static Connection con;
    private static Statement statement;
    private static String URL="jdbc:mysql://localhost:3306/bankdb";
    private static String USER="user";
    protected static String PASSWORD="Sql12345";
//проблемы
/*
    private DataBase openDatabase() throws  SQLException
    {
        //в переменную con "заключаем соединение"

        con = DriverManager.getConnection(URL,USER, PASSWORD);
        return database;
    }
*/
    private DataBase() throws SQLException {


        con = DriverManager.getConnection(URL,USER, PASSWORD);

    }

    public static DataBase getInstance() throws SQLException {
        if (database == null) {
            database = new DataBase();
        }
        return database;
    }

    public Connection getConnection() {
        return con;
    }
    public void setConnection(Connection connection) {
        this.con = connection;
    }




    public  ResultSet getDatabase(String str) throws SQLException {

        ResultSet res = null;
        try {
            statement = con.createStatement();
            res = statement.executeQuery(str);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }


        return res;
    }



    public  void execute(String str)
    {
        try {
            statement = con.createStatement();
            statement.execute(str);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}