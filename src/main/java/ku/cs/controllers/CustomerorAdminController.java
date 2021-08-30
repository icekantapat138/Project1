package ku.cs.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import ku.cs.App;
import ku.cs.controllers.admin.AdminLoginController;
import ku.cs.controllers.customer.CustomerLoginController;
import ku.cs.model.user.Account;
import ku.cs.model.user.CustomerAccount;
import ku.cs.service.fileaccount.AccountData;
import ku.cs.service.fileaccount.FileAdminData;
import ku.cs.service.fileaccount.FileCustomerData;

import java.io.IOException;

public class CustomerorAdminController {

    private Account admin;
    private CustomerAccount customerAcc;
    private AccountData accountData;

    @FXML private ImageView image1;
    @FXML private Button customerBtn,adminBtn;

    @FXML
    public void initialize() {
        String img1 = getClass().getResource("/image/MIN.png").toExternalForm();
        image1.setImage(new Image(img1));

        admin = new Account();
        accountData = new FileAdminData("Data","admin.csv");
        admin = accountData.getAdminData();

        customerAcc = new CustomerAccount();
        accountData =new FileCustomerData("Data", "customer.csv");
        customerAcc = accountData.getCustomerData();

    }

    @FXML public void customerBtn(ActionEvent event) throws IOException{
        Button staff = (Button) event.getSource();
        Stage stage = (Stage) staff.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/createaccount.fxml"));
        stage.setTitle("Login");
        CustomerLoginController load = loader.getController();

        load.setAdmin(admin);
        load.setCustomerAcc(customerAcc);
        stage.show();
    }

    @FXML public void adminBtn(ActionEvent event) throws IOException{
        Button am = (Button) event.getSource();
        Stage stage = (Stage) am.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/admin_login.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Admin Login");
        AdminLoginController load = loader.getController();

        load.setAdmin(admin);
        load.setCustomerAcc(customerAcc);
        stage.show();
    }

    public void setAdmin(Account admin) {
        this.admin = admin;
    }

    public void setCustomerAcc(CustomerAccount customerAcc){
        this.customerAcc =  customerAcc;
    }
}
