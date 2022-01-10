package classes;

public class User{
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String userID;
    public String login;
    public String password;
    public String email;
    public String phoneNumber;

    public String usurname;
    public String uname;
    public String upatronymic;



    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        String sendString;
        sendString = "1 " + "|" + userID + "|" + phoneNumber + "|" + email + "|" + login + "|" + password;
        return sendString;
    }




    public String toStringForEdit(){
        String sendString;
        sendString = "12" + "|" + userID + "|" + phoneNumber + "|" + email + "|" + login + "|" + password;
        return sendString;
    }
}