package ku.cs.controllers.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ku.cs.App;
import ku.cs.model.BugattiClass;
import ku.cs.model.WmotorClass;

import java.io.IOException;

public class Admin_bugatti {
    @FXML private Label veyronNumberLabel;
    @FXML private Label chironNumberLabel;
    @FXML private TextField veyronAddTextfield;
    @FXML private TextField chironAddTextfield;

    private BugattiClass Bugatti;

    @FXML
    public void initialize() {
        Bugatti = new BugattiClass();
    }

    @FXML
    public void veyronAddButton(ActionEvent actionEvent) {
        String numberveyronStr = veyronAddTextfield.getText();
        double numberOfveyroncar = Double.parseDouble(numberveyronStr);
        Bugatti.addVeyronNumber(numberOfveyroncar);
        showveyronData();
    }

    @FXML
    public void chironAddButton(ActionEvent actionEvent){
        String numberchironnStr = chironAddTextfield.getText();
        double numberOfchironcar = Integer.parseInt(numberchironnStr);
        Bugatti.addChironNumber(numberOfchironcar);
        showchironData();
    }

    private void showveyronData() {
        String veyronNumber = String.format("%.0f",Bugatti.getVeyronNumber());
        veyronNumberLabel.setText(veyronNumber);
    }

    private void showchironData() {
        String chironNumber = String.format("%.0f", Bugatti.getChironNumber());
        chironNumberLabel.setText(chironNumber);
    }


    @FXML
    void adminHome(ActionEvent event)throws IOException{
        App.setRoot("admin_controller");
    }
}
