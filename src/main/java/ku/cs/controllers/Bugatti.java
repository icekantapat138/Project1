package ku.cs.controllers;

import javafx.fxml.FXML;
import ku.cs.App;

import java.io.IOException;

public class Bugatti {
    @FXML
    private void homeHyperlink() throws IOException {
        App.setRoot("website");
    }
}
