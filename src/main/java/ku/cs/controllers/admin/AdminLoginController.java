package ku.cs.controllers.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import ku.cs.model.user.Account;
import ku.cs.model.user.CustomerAccount;

import java.io.IOException;

public class AdminLoginController {
    @FXML private TextField usernameTextField;
    @FXML private PasswordField passwordField;
    @FXML private Button loginBtn, backBtn, resetBtn;
    @FXML private Label statusLabel;

    private Account admin;
    private CustomerAccount customerAcc;

    @FXML public void loginBtn(ActionEvent event) throws IOException {
        statusLabel.setText("");
        System.out.println(customerAcc.getCustomerAccounts());

        if (usernameTextField.getText().equals("") || passwordField.getText().equals("")){
            Alert error = new Alert(Alert.AlertType.ERROR);
            error.setTitle("Notification");
            error.setContentText("Please Enter Username or Password");
            error.setHeaderText(null);
            error.showAndWait();
        }
        else {
            if (admin.checkUser(usernameTextField.getText()) && admin.checkPass(passwordField.getText())) {
                statusLabel.setText("");
                Button login = (Button) event.getSource();
                Stage stage = (Stage) login.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/Admin_Controller.fxml"));
                stage.setScene(new Scene(loader.load()));
                stage.setTitle("Admin Controller");
                Admin_Controller load = loader.getController();

                load.setAdmin(admin);
                load.setCustomerAcc(customerAcc);

                stage.show();
            } else if (!admin.checkUser(usernameTextField.getText()) && admin.checkPass(passwordField.getText())) {

                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setContentText("Username Not Found");
                error.setHeaderText(null);
                error.showAndWait();

            } else if (admin.checkUser(usernameTextField.getText()) && !(admin.checkPass(passwordField.getText()))) {

                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setContentText("Password Incorrect");
                error.setHeaderText(null);
                error.showAndWait();
            }
            else {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setContentText("Username and Password Incorrect");
                error.setHeaderText(null);
                error.showAndWait();

            }
        }
    }

    public void setAdmin(Account admin) {
        this.admin = admin;
    }

    public void setCustomerAcc(CustomerAccount customerAcc){
        this.customerAcc =  customerAcc;
    }
}
