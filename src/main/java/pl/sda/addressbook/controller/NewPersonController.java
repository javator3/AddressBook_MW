package pl.sda.addressbook.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import pl.sda.addressbook.model.Person;
import pl.sda.addressbook.view.PersonView;

import java.net.URL;
import java.util.ResourceBundle;

public class NewPersonController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField lastnameTextField;
    @FXML
    private TextField streetTextField;
    @FXML
    private TextField cityTextField;
    @FXML
    private TextField postalcodeTextField;
    @FXML
    private TextField telephoneTextField;
    @FXML
    private Button saveButton;
    @FXML
    private Button cancelButton;

    private PersonView personView;

    public void setPersonView(PersonView personView) {
        this.personView = personView;
        // personView.getPersonList();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void saveButtonAction(ActionEvent actionEvent) {

        personView.getPersonList().add(new Person(
                nameTextField.getText(),
                lastnameTextField.getText(),
                streetTextField.getText(),
                cityTextField.getText(),
                postalcodeTextField.getText(),
                telephoneTextField.getText()));

        nameTextField.clear();
        lastnameTextField.clear();
        streetTextField.clear();
        cityTextField.clear();
        postalcodeTextField.clear();
        telephoneTextField.clear();

    }

    public void cancelButtonAction(ActionEvent actionEvent) {
        personView.cancelButton();
    }
}
