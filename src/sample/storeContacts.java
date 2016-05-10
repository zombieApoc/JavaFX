package sample;

/**
 * Created by Ultramar on 4/11/16.
 */
public class storeContacts {

    String text = (("%s, %s, %s"), name ,phone, email);

    public void storeContacts(String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return text;
    }
}
