package ku.cs.controllers;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.ImageInput;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import ku.cs.App;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.OpenOption;
import java.util.ResourceBundle;

import javafx.scene.control.TextField;

import static ku.cs.App.setRoot;

public class Register {

    @FXML private TextField firstnameTextField;
    @FXML private TextField lastnameTextField;
    @FXML private TextField emailTextField;
    @FXML private TextField usernameTextField;
    @FXML private PasswordField passwordPasswordField;
    @FXML private PasswordField retypepasswordPasswordField;
    @FXML private ImageView imageView;
    @FXML private TextField fileField;
    @FXML  private FileChooser fileChooser;
    @FXML  private File filePath;

    public class FXMLDocumentController implements Initializable {

        @FXML
        private ImageView imageView;

        @Override
        public void initialize(URL url, ResourceBundle rb) {
            Image image = new Image(getClass().getResourceAsStream("/image/defaultprofile.jpg"));
            imageView.setImage(image);
        }
    }

    @FXML
    private void clearTap() throws IOException{
        firstnameTextField.clear();
        lastnameTextField.clear();
        emailTextField.clear();
        usernameTextField.clear();
        passwordPasswordField.clear();
        retypepasswordPasswordField.clear();
    }

    @FXML
    private void backtoSMStareter() throws IOException{
        setRoot("login");
    }

    @FXML
    private void backtoLogin() throws IOException{
        setRoot("login");
    }

    @FXML
    private void exitProgram() throws IOException{
        System.exit(0);
    }


    @FXML
    private void passCode() throws IOException{
        if (passwordPasswordField == retypepasswordPasswordField){
            System.out.println("Password is Correct!!");
        }else if(passwordPasswordField != retypepasswordPasswordField){
            System.out.println("Password is not Correct!!");
        }
    }

    public void browseImage(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");

        File file = fileChooser.showOpenDialog(stage);
        if(file != null){
            Image image = new Image(file.toURI().toString());
            imageView.setImage(image);
        }


        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("PNG file","*.PNG")
                    ,new FileChooser.ExtensionFilter("png file","*.png")
                    ,new FileChooser.ExtensionFilter("JPG file","*.JPG")
                    ,new FileChooser.ExtensionFilter("jpg file","*.jpg")
        );

    }

}
