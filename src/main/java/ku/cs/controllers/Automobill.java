package ku.cs.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import ku.cs.App;

import java.io.IOException;

public class Automobill {

    @FXML private ImageView image;

    @FXML
    public void initialize() {
        String path = getClass().getResource("/image/bgMIN.jpg").toExternalForm();
        image.setImage(new Image(path));
    }

    @FXML
    private void switchToLogin() throws IOException{
        App.setRoot("login");
    }

    @FXML
    private void switchToProfile() throws IOException{
        App.setRoot("profile");
    }

    @FXML
    private void exitProgram() throws IOException{
        System.exit(0);
    }

}
