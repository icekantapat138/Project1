package ku.cs.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import ku.cs.App;

import java.io.IOException;

public class User {
    @FXML
    private void handleusertohomeButton() throws IOException {
        App.setRoot("website");
    }

    @FXML
    private void personButton() throws IOException{
        App.setRoot("person");
    }

}
