package ku.cs.controllers.customer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import ku.cs.controllers.Website;
import ku.cs.model.user.Account;
import ku.cs.model.user.CustomerAccount;
import ku.cs.service.fileaccount.AccountData;
import ku.cs.service.fileaccount.FileCustomerData;

import java.io.IOException;

public class CustomerLoginController {
    private Account admin;
    private CustomerAccount customerAcc;
    private AccountData accountData;
    @FXML private TextField usernameTextField;
    @FXML private PasswordField passwordField;
    @FXML private Button loginBtn, backBtn, resetBtn;
    @FXML private Label statusLabel;

    @FXML public void loginBtn(ActionEvent event) throws IOException{
        if (usernameTextField.getText().equals("") || passwordField.getText().equals("")){
            Alert error = new Alert(Alert.AlertType.ERROR);
            error.setTitle("Notification");
            error.setContentText("Please Enter Username or Password.");
            error.setHeaderText(null);
            error.showAndWait();
        }
        else if(!(customerAcc.searchUser(usernameTextField.getText())) && customerAcc.searchPassword(passwordField.getText())){
            Alert error = new Alert(Alert.AlertType.ERROR);
            error.setTitle("Notification");
            error.setContentText("Username Not Found");
            error.setHeaderText(null);
            error.showAndWait();
        }
        else {
            int checkCondition = 0;
            for (CustomerAccount customer : customerAcc.getCustomerAccounts()){
                if(!customer.getStatus().equals("Block")){
                    if (customer.checkUser(usernameTextField.getText()) && customer.checkPass(passwordField.getText())){
                        checkCondition = 1;
                        customer.setDate();

                        accountData = new FileCustomerData("data", "customer.csv");
                        accountData.writDataSource(customerAcc);

                        System.out.println(customer.getUsername() + " " + customer.getTime());
                        System.out.println(customer.toString());

                        Button login = (Button) event.getSource();
                        Stage stage = (Stage) login.getScene().getWindow();

                        FXMLLoader loader = new FXMLLoader(getClass().getResource("/website.fxml"));
                        stage.setScene(new Scene(loader.load(), 800, 600));
                        stage.setTitle("website");
                        Website load = loader.getController();

                        load.setAdmin(admin);
                        stage.show();
                        break;
                    }
                }
            }
        }
    }
    @FXML public void createaccBtn(ActionEvent event) throws IOException{
        Button ca = (Button) event.getSource();
        Stage stage = (Stage) ca.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/createaccount.fxml"));
        stage.setScene(new Scene(loader.load(),600,800));
        stage.setTitle("Create Account");
    }


    public void setAdmin(Account admin) {
        this.admin = admin;
    }

    public void setCustomerAcc(Account customerAcc){
        this.customerAcc = (CustomerAccount) customerAcc;
    }
}
