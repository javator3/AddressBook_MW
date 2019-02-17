package pl.sda.addressbook.view;

import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.sda.addressbook.controller.NewPersonController;
import pl.sda.addressbook.controller.RootViewController;
import pl.sda.addressbook.model.Person;
import pl.sda.addressbook.model.PersonString;

import java.io.File;
import java.io.IOException;

public class PersonView {

    private ObservableList<Person> personList = FXCollections.observableArrayList();
    private Stage stage;
    private Stage personStage = new Stage();


    public PersonView(Stage stage) {
        this.stage = stage;
//        personList.add(new Person("Magda", "Valis", "Letniskowa", "Toruń", "87-100", "507718184"));
//        personList.add(new Person("Marta", "Waliszewska", "Letniskowa", "Toruń", "87-100", "987654321"));
//        personList.add(new Person("Celinka", "Valis", "Syrenia", "Wszechocean", "87-100", "123456789"));

        ObjectMapper mapper = new ObjectMapper();
        File file = new File("addressbook.json");
        PersonString[] person = null;
        try {
            person = mapper.readValue(file, PersonString[].class);
            for (PersonString p: person) {
                personList.add(new Person(p.getName(), p.getLastname(), p.getStreet(), p.getCity(), p.getPostalcode(), p.getTelephone()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public PersonView() {
    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }

    public void loadView() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/RootView.fxml"));
        loader.load();
        Parent parent = loader.getRoot();
        stage.setScene(new Scene(parent, 800, 400));



        RootViewController rootViewController = loader.getController();
        rootViewController.setPersonView(this);
        stage.show();
    }

    public void loadNewPersonView() {


        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/NewPerson.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent parent = loader.getRoot();
        personStage.setScene(new Scene(parent, 600, 400));
        personStage.show();
        NewPersonController newPersonController = loader.getController();
        newPersonController.setPersonView(this);

    }

    public void cancelButton() {
        personStage.close();

    }

    public void saveButtonToJson() {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("addressbook.json");
        try {
            mapper.writeValue(file, personList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
