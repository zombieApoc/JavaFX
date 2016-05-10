package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static java.awt.SystemColor.text;

public class Controller implements Initializable {

    ObservableList<storeContacts> contacts = FXCollections.observableArrayList();

    @FXML
    public ListView list;

    @FXML
    public TextField name;

    @FXML
    public TextField phone;

    @FXML
    public TextField email;

    public void addContact() {
        contacts.add(new storeContacts(name.getText(), phone.getText(), email.getText()));
        name.setText("");
        phone.setText("");
        email.setText("");
    }

    public void removeContact() {
        storeContacts contact = (storeContacts) list.getSelectionModel().getSelectedItems();
        contacts.remove(contact);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(contacts);
    }


}
