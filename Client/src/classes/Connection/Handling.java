package classes.Connection;

import classes.AnalisysInfo;
import classes.OrderData;
import classes.User;
import classes.UserNSP;
import sample.Main;

import static sample.Main.*;

public class Handling {
    public static boolean bool;
    public static void ResponseHandling(String response){
        bool=false;
        System.out.println(response);
        switch(response.substring(0,2)){
            case "2N":
                Main.UserID="0";
                bool=false;
                break;
            case "2Y":
                Main.UserID=response.substring(2);
                bool=true;
                break;
            case "4 ":
                String separator = "\n";
                String[] subStr;
                String[] elements;
                String orders=response.substring(2);
                subStr=orders.split(separator);
                for(int i=1; i< subStr.length; i++){
                    OrderData order = new OrderData();
                    subStr[i].replaceAll("\n", "");
                    elements=subStr[i].split("\\|");
                    order.setOrderID(elements[0]);
                    order.setName(elements[1]);
                    order.setIncome(elements[2]);
                    order.setCreditsum(elements[3]);
                    order.setTime(elements[4]);
                    order.setType(elements[5]);
                    order.setBenefit(elements[6]);
                    order.setCondition(elements[7]);
                    ordersData.add(order);

                }

                break;

            case "5 ":
                String separatorr = "\n";
                String[] subStrr;
                String[] elementsr;
                String ordersr=response.substring(2);
                subStrr=ordersr.split(separatorr);
                for(int i=1; i< subStrr.length; i++){
                    OrderData order = new OrderData();
                    subStrr[i].replaceAll("\n", "");
                    elementsr=subStrr[i].split("\\|");
                    order.setOrderID(elementsr[0]);
                    order.setName(elementsr[1]);
                    order.setIncome(elementsr[2]);
                    order.setCreditsum(elementsr[3]);
                    order.setTime(elementsr[4]);
                    order.setType(elementsr[5]);
                    order.setBenefit(elementsr[6]);
                    order.setCondition(elementsr[7]);
                    ordersData.add(order);
                }

                break;

            case "10":
                String separatorTwo = "\n";
                String[] subStrTwo;
                String[] elementsTwo;
                String users=response.substring(2);
                subStrTwo=users.split(separatorTwo);
                for(int i=1; i< subStrTwo.length; i++){
                    User user = new User();
                    subStrTwo[i].replaceAll("\n", "");
                    elementsTwo=subStrTwo[i].split("\\|");
                    user.setUserID(elementsTwo[0]);
                    user.setLogin(elementsTwo[1]);
                    user.setPassword(elementsTwo[2]);
                    user.setEmail(elementsTwo[3]);
                    user.setPhoneNumber(elementsTwo[4]);
                    usersData.add(user);
                }
                break;
            case "13":

                String separatorO = "\n";
                String[] subStrO;
                String[] elements0;
                String orders0=response.substring(2);
                subStrO=orders0.split(separatorO);
                for(int i=1; i< subStrO.length; i++){
                    OrderData order = new OrderData();
                    subStrO[i].replaceAll("\n", "");
                    elements0=subStrO[i].split("\\|");
                    order.setOrderID(elements0[0]);
                    order.setName(elements0[1]);
                    order.setIncome(elements0[2]);
                    order.setCreditsum(elements0[3]);
                    order.setTime(elements0[4]);
                    order.setType(elements0[5]);
                    order.setBenefit(elements0[6]);
                    order.setCondition(elements0[7]);
                    ordersDataForAnalisys.add(order);

                }
                break;
            case "15":                String sep="\\|";
                String[] elementsA;
                String ordersA=response.substring(3);
                elementsA=ordersA.split(sep);
                for(int i=1; i< elementsA.length; i++){
                    AnalisysInfo analisysInfo = new AnalisysInfo();
                    analisysInfo.setOrderID(elementsA[1]);
                    analisysInfo.setZ121(Integer.parseInt(elementsA[2]));
                    analisysInfo.setZ131(Integer.parseInt(elementsA[3]));
                    analisysInfo.setZ211(Integer.parseInt(elementsA[4]));
                    analisysInfo.setZ231(Integer.parseInt(elementsA[5]));
                    analisysInfo.setZ311(Integer.parseInt(elementsA[6]));
                    analisysInfo.setZ321(Integer.parseInt(elementsA[7]));

                    analisysInfo.setZ122(Integer.parseInt(elementsA[8]));
                    analisysInfo.setZ132(Integer.parseInt(elementsA[9]));
                    analisysInfo.setZ212(Integer.parseInt(elementsA[10]));
                    analisysInfo.setZ232(Integer.parseInt(elementsA[11]));
                    analisysInfo.setZ312(Integer.parseInt(elementsA[12]));
                    analisysInfo.setZ322(Integer.parseInt(elementsA[13]));


                    analisysInfo.setW1(Double.parseDouble(elementsA[26]));
                    analisysInfo.setW2(Double.parseDouble(elementsA[27]));
                    analisysInfo.setW3(Double.parseDouble(elementsA[28]));

                    analisInfo=analisysInfo;
                }
                break;


            case "20":
                String separatorSNP = "\n";
                String[] subStrSNP;
                String[] elementsSNP;
                String usersSNP=response.substring(2);
                subStrSNP=usersSNP.split(separatorSNP);
                for(int i=1; i< subStrSNP.length; i++){
                    UserNSP newUserNSP = new UserNSP();
                    subStrSNP[i].replaceAll("\n", "");
                    elementsSNP=subStrSNP[i].split("\\|");
                    newUserNSP.setUSurname(elementsSNP[0]);
                    newUserNSP.setUName(elementsSNP[1]);
                    newUserNSP.setUPatronymic(elementsSNP[2]);

                    usersSNPData.add(newUserNSP);
                }
                break;
            default: break;
        }
        return;
    }
}
