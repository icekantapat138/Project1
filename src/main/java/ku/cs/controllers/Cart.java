package ku.cs.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ku.cs.App;
import ku.cs.model.CartClass;

import java.io.IOException;

public class Cart {

    @FXML private Label totalpricewdeliverytohomeLabel;
    @FXML private Label amountpriceLabel;
    @FXML private TextField amountpriceTextfield;

    private CartClass cart;

    @FXML
    public void initialize() {
        cart = new CartClass();
    }

    @FXML
    public void handletestButton(ActionEvent actionEvent){
        String priceStr = amountpriceTextfield.getText();
        String priceStrs = amountpriceTextfield.getText();
        double deliveryprice = Double.parseDouble(priceStr);
        double amountprices = Double.parseDouble(priceStrs);
        cart.addpricedelivery(deliveryprice);
        cart.addamountprice(amountprices);
        showpricedeliveryData();
        showamountpriceLabel();
    }

    private void showamountpriceLabel(){
        String amountpriceNumber = String.format("%.2f", cart.getAmountprice());
        amountpriceLabel.setText(amountpriceNumber);
    }

    private void showpricedeliveryData(){
        String deliverypriceNumber = String.format("%.2f", cart.getAdddeliveryprice());
        totalpricewdeliverytohomeLabel.setText(deliverypriceNumber);
    }

    @FXML
    private void placeOrder() throws IOException{
        App.setRoot("website");
    }

}