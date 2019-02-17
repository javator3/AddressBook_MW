package pl.sda.addressbook.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import pl.sda.addressbook.model.Person;
import pl.sda.addressbook.view.PersonView;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class RootViewController implements Initializable {

    @FXML
    private Label nameLabel;
    @FXML
    private Label lastnameLabel;
    @FXML
    private Label streetLabel;
    @FXML
    private Label cityLabel;
    @FXML
    private Label postalCodeLabel;
    @FXML
    private Label telephoneLabel;
    @FXML
    private TableView<Person> personTableView;
    @FXML
    private TableColumn<Person, String> nameColumn;
    @FXML
    private TableColumn<Person, String> lastnameColumn;
    @FXML
    private Button newButton;
    @FXML
    private Button saveButton;

    private PersonView personView;


    public void setPersonView(PersonView personView) {
        this.personView = personView;
        personTableView.setItems(personView.getPersonList());

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        nameColumn.setCellValueFactory(f -> f.getValue().nameProperty());
        lastnameColumn.setCellValueFactory(f -> f.getValue().lastnameProperty());

    }

    public void newButtonAction(ActionEvent actionEvent) throws IOException {
        personView.loadNewPersonView();
    }

    public void saveButtonAction(ActionEvent actionEvent) {
        personView.saveButtonToJson();
    }
}
