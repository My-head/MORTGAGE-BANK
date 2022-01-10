package ConnectionWork;

import DataBaseWork.*;

import java.sql.SQLException;

public class ActionSelection {
    public String DataProcessing(String string) throws SQLException {
        String firstSymbol;
        firstSymbol=string.substring(0,2);
        switch(firstSymbol){
            case "1 ":
                return AddNewUser.Add(string.substring(3));
            case "2 ":
                return ChekAvailabilityUser.Verify(string.substring(3));
            case "3 ":
                return InsertNewOrder.InsertInDataBase(string.substring(3));
            case "4 ":
                return SendOrder.SendString(string.substring(2));
            case "6 ":
                return DeleteOrder.DeleteOrders(string.substring(2));
            case "7 ":
                return EditOrder.EditOrders(string.substring(3));
            case "10":
                return SendUser.SendString(string.substring(2));
            case "11":
                return DeleteUser.DeleteUsers(string.substring(2));
            case "12":
                return EditUser.EditUsers(string.substring(3));
            case "13":
                return SendAllOrders.SendString(string.substring(2));
            case "14":
                AddAnalisys.Add(string.substring(2));
                break;
            case "5 ":
                return SendReportData.SendString(string.substring(2));

            case "21":
                return AddNewUserSNP.AddSNP(string.substring(3));

            case "20":
                return SendUserSNP.SendString(string.substring(2));
        }
        return "";
    }
}
