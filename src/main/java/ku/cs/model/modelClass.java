package ku.cs.model;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class modelClass {

    private String Usename;
    private String Password;
    private TextField usernameTextField;
    private PasswordField passwordPasswordField;


    public modelClass(String username, String password){
        this.Usename = Usename;
        this.Password = Password;
    }

    public modelClass(TextField usernameTextField, PasswordField passwordPasswordField){
        this.usernameTextField = usernameTextField;
        this.passwordPasswordField = passwordPasswordField;
    }

    public String getUsername() {
        return Usename;
    }

    public String getPassword() {
        return Password;
    }

    public TextField getUsernameTextField() {
        return usernameTextField;
    }

    public PasswordField getPasswordPasswordField() {
        return passwordPasswordField;
    }
}
