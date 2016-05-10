package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static java.awt.SystemColor.text;

public class Controller implements Initializable {

    ObservableList<storeContacts> contacts = FXCollections.observableArrayList();
    File f = new File("contacts.txt");

    @FXML
    public ListView list;

    @FXML
    public TextField name;

    @FXML
    public TextField phone;

    @FXML
    public TextField email;

    public void addContact() throws IOException{
        storeContacts contact = new storeContacts(name.getText(), phone.getText(), email.getText());
        contacts.add(contact);
        name.setText("");
        phone.setText("");
        email.setText("");

        FileWriter fw = new FileWriter(f);
        fw.append(contact.toString());
        fw.close();
    }

    public void removeContact() {
        storeContacts contact = (storeContacts) list.getSelectionModel().getSelectedItem();
        contacts.remove(contact);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(contacts);
    }


}
