package ku.cs.controllers.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import ku.cs.App;
import ku.cs.model.user.Account;
import ku.cs.model.user.CustomerAccount;

import java.io.IOException;

public class Admin_Controller {

    @FXML
    private ImageView imageView;

    @FXML
    void bAdmin(ActionEvent event) throws IOException {
        App.setRoot("admin_bugatti");
    }

    @FXML
    void customerInfo(ActionEvent event) throws IOException {
        App.setRoot("customer_info");
    }

    @FXML
    void ferAdmin(ActionEvent event) throws IOException{
        App.setRoot("admin_fer");
    }

    @FXML
    void lamboAdmin(ActionEvent event) throws IOException{
        App.setRoot("admin_lam");
    }

    @FXML
    void mclaAdmin(ActionEvent event) throws IOException{
        App.setRoot("admin_mclaren");
    }

    @FXML
    void wAdmin(ActionEvent event) throws IOException{
        App.setRoot("admin_w");
    }

    @FXML
    public void logout(ActionEvent event) throws IOException{
        App.setRoot("Automobill");
    }

    public void setAdmin(Account admin) {
    }

    public void setCustomerAcc(CustomerAccount customerAcc) {
    }
}
