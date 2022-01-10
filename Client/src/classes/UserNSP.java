package classes;

import sample.Main;

public class UserNSP {


    public String usurname;
    public String uname;
    public String upatronymic;

public String getID(){
    return usurname;
}

    @Override
    public String toString(){
    String sendString;

    sendString ="21" + "|" + usurname + "|" + uname + "|" +upatronymic + "|" + Main.UserID;

Main.unameinf = sendString;
return sendString;
}

public String toStringForEdit(){
    String sendString;
    sendString ="112" + "|" + usurname + "|" + uname + "|" +upatronymic;
return sendString;
}



    public String getUSurname() {
        return usurname;
    }
    public void   setUSurname(String usurname) {
        this.usurname = usurname;
    }

    public String getUName() {
        return uname;
    }
    public void   setUName(String uname) {
        this.uname = uname;
    }

    public String getUPatronymic() {
        return upatronymic;
    }
    public void   setUPatronymic(String upatronymic) {
        this.upatronymic = upatronymic;
    }

}
