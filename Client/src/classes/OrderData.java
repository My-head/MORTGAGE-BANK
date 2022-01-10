package classes;

import sample.Main;


public class OrderData {
    public String orderID;
    public String name;
    public String income;
    public String creditsum;
    public String time;
    public String type;
    public String benefit;
    public String condition;

    public String getID(){
        return orderID;
    }

    @Override
    public String toString(){
        String sendString;
        sendString = "3 " + "|" + orderID+"|" + name + "|" + income + "|" + creditsum + "|" + time + "|" +  type
                + "|" +  benefit + "|" + condition+ "|"  + Main.UserID;


        
        Main.ordinf = sendString;



        return sendString;



    }

    public String toStringForEdit(){
        String sendString;
        sendString = "7 " + "|" + orderID+"|" + name + "|" + income + "|" + creditsum + "|" + time + "|" +  type
                + "|" +  benefit + "|" + condition;
        return sendString;
    }



    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getCreditsum() {
        return creditsum;
    }

    public void setCreditsum(String creditsum) {
        this.creditsum = creditsum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
