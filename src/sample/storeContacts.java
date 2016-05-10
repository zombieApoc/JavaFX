package sample;


public class storeContacts {

    String text;
    String name;
    String phone;
    String email;

    public storeContacts(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        text = name + "," + phone + "," + email;
    }


    @Override
    public String toString() {
        return text;
    }
}
