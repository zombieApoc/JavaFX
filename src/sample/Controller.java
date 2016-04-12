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

public class Controller implements Initializable{

    @FXML
    public ListView list;

    @FXML
    public TextField name;

    @FXML
    public TextField phone;

    @FXML
    public TextField email;

    @FXML
    public Button add;

    @FXML
    public Button remove;




    ObservableList<storeContacts> contacts = FXCollections.observableArrayList();

    @Override
    public void initialize(URL Location, ResourceBundle) {
        list.setItems(contacts);
    }

    public void addItem() {
        contacts.add(new storeContacts(text.getText()));
        text.setText("");
    }

    public void removeItem() {
        storeContacts item = (ToDoItem) list.getSelectionModel().getSelectedItem();
        contacts.remove(item);
    }

}
