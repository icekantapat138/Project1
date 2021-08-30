package ku.cs.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import ku.cs.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static ku.cs.App.setRoot;



public class Login  {

    @FXML private TextField usernameTextField;
    @FXML private PasswordField passwordPasswordField;
    @FXML private CheckBox ShowPasswordbox;
    @FXML private Label usertypeLabel;
    @FXML private ImageView imageView;

    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        Image image = new Image(getClass().getResourceAsStream("/image/MIN.png"));
        imageView.setImage(image);
    }

    public void Login(TextField usernameTextField, PasswordField passwordPasswordField){
        this.usernameTextField = usernameTextField;
        this.passwordPasswordField = passwordPasswordField;
    }

    @FXML
    private void switchToHome() throws IOException{
        setRoot("automobill");
    }

    @FXML
    private void switchToRegister() throws IOException{
        setRoot("Register");
    }

    @FXML
    private void exitProgram() throws IOException{
        System.exit(0);
    }

    @FXML
    private void checkShowPassword(ActionEvent actionEvent){
        if(ShowPasswordbox.isSelected()){
            passwordPasswordField.setPromptText(passwordPasswordField.getText());
            passwordPasswordField.setText("");
            passwordPasswordField.setDisable(true);
        }else{
            passwordPasswordField.setText(passwordPasswordField.getPromptText());
            passwordPasswordField.setPromptText("");
            passwordPasswordField.setDisable(false);
        }

    }

    @FXML
    public void LoginButton(ActionEvent event) throws IOException {
        if(usernameTextField.getText().trim().equals("") || passwordPasswordField.getText().trim().equals("")){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("You don't Enter Username or Password!!");
            alert.show();
            System.out.println("Not Enter username or password");

        }else if(usernameTextField.getText().equals("Admin") && passwordPasswordField.getText().equals("Admin1234")){
            App.setRoot("admin_controller");
        }else{
            App.setRoot("website");
            System.out.println("website");
        }


    }

    @FXML
    private void clearTab() throws IOException{
        usernameTextField.clear();
        passwordPasswordField.clear();

    }
}
