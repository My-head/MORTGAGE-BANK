package classes;

public class DateForLogin {
    public String login;
    public String password;

    @Override
    public String toString(){
        String sendString;
        sendString = "2 " + "|" + login + "|" + password;
        return sendString;
    }
}
