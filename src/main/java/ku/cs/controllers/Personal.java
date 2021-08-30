package ku.cs.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import ku.cs.App;
import ku.cs.model.Person;

public class Personal implements Initializable {

    @FXML private TableView<Person> tableView;
    @FXML private TableColumn<Personal, String> firstnameColumn;
    @FXML private TableColumn<Personal, String> lastnameColumn;
    @FXML private TableColumn<Personal, String> usernameColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        firstnameColumn.setCellValueFactory(new PropertyValueFactory<Personal, String>("firstname"));
        lastnameColumn.setCellValueFactory(new PropertyValueFactory<Personal, String>("lastname"));
        usernameColumn.setCellValueFactory(new PropertyValueFactory<Personal, String>("username"));
        tableView.setItems(ObservableList);
    }

    ObservableList<Person> ObservableList = FXCollections.observableArrayList(
            new Person("Steve", "Job", "SteveJ"),
            new Person("Mark", "Zuckerburg", "MKZUCK"),
            new Person("Sehun", "Ooh", "OOHSEHUN" ),
            new Person("Chanyeol", "Park", "REALPCY"),
            new Person("Taeyoung", "Lee", "taeexo")
    );

    @FXML
    private void website() throws IOException{
        App.setRoot("website");
    }


}

