package ku.cs.controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.fxml.Initializable;
import ku.cs.App;

import java.io.IOException;

public class Profile {

    @FXML private ImageView image1;
    @FXML private ImageView image2;
    @FXML private ImageView image3;

    @FXML
    public void initialize() {
        String ice = getClass().getResource("/image/ice.jpg").toExternalForm();
        image1.setImage(new Image(ice));

        String mew = getClass().getResource("/image/mew.jpg").toExternalForm();
        image2.setImage(new Image(mew));

        String noon = getClass().getResource("/image/noon.jpg").toExternalForm();
        image3.setImage(new Image(noon));
    }

    @FXML
    private void backTohome() throws IOException{
        App.setRoot("automobill");
    }
}
