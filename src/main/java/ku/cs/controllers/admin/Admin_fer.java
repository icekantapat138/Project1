package ku.cs.controllers.admin;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ku.cs.App;
import ku.cs.model.FerrariClass;

import java.io.IOException;

public class Admin_fer {

    @FXML private Label sfNumberLabel;
    @FXML private Label gtbNumberLabel;
    @FXML private Label pistaNumberLabel;
    @FXML private TextField sfAddTextfield;
    @FXML private TextField gtbAddTextfield;
    @FXML private TextField pistaAddTextfield;

    private FerrariClass ferrari;

    @FXML
    public void initialize() {
        ferrari = new FerrariClass();
    }

    @FXML
    public void sfAddButton(ActionEvent actionEvent) {
        String numbersfStr = sfAddTextfield.getText();
        double numberOfSFcar = Double.parseDouble(numbersfStr);
        ferrari.addSFNumber(numberOfSFcar);
        showFerrariSFData();
    }

    @FXML
    public void gtbAddButton(ActionEvent actionEvent){
        String numbergtbStr = gtbAddTextfield.getText();
        double numberOfGtbcar = Integer.parseInt(numbergtbStr);
        ferrari.addGtbNumber(numberOfGtbcar);
        showFerrariGtbData();
    }

    @FXML
    public void pistaAddButton(ActionEvent actionEvent) {
        String numberpistaStr = pistaAddTextfield.getText();
        double numberOfPista = Integer.parseInt(numberpistaStr);
        ferrari.addPistaNumber(numberOfPista);
        showFerrariPistaData();
    }

    private void showFerrariSFData() {
        String sfNumber = String.format("%.0f",ferrari.getSf90Number());
        sfNumberLabel.setText(sfNumber);
    }

    private void showFerrariGtbData() {
        String gtbNumber = String.format("%.0f", ferrari.getGtbNumber());
        gtbNumberLabel.setText(gtbNumber);
    }

    private void showFerrariPistaData() {
        String pistaNuber = String.format("%.0f", ferrari.getPistaNumber());
        pistaNumberLabel.setText(pistaNuber);
    }

    @FXML
    private void adminhomeHyperlink() throws IOException{
        App.setRoot("admin_controller");
    }

}
