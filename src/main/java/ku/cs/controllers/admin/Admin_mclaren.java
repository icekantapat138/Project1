package ku.cs.controllers.admin;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ku.cs.App;
import ku.cs.model.MclarenClass;

import java.io.IOException;

public class Admin_mclaren {

    @FXML private Label p1NumberLabel;
    @FXML private Label LTNumberLabel;
    @FXML private Label CoupeNumberLabel;
    @FXML private TextField p1AddTextfield;
    @FXML private TextField ltAddTextfield;
    @FXML private TextField coupeAddTextfield;

    private MclarenClass Mclaren;

    @FXML
    public void initialize() {
        Mclaren = new MclarenClass();
    }

    @FXML
    public void p1AddButton(ActionEvent actionEvent) {
        String numberp1Str = p1AddTextfield.getText();
        double numberOfp1car = Double.parseDouble(numberp1Str);
        Mclaren.addP1Number(numberOfp1car);
        showMclarenP1Data();
    }

    @FXML
    public void ltAddButton(ActionEvent actionEvent){
        String numberltStr = ltAddTextfield.getText();
        double numberOfltcar = Integer.parseInt(numberltStr);
        Mclaren.addLTNumber(numberOfltcar);
        showMclarenLTData();
    }

    @FXML
    public void coupeAddButton(ActionEvent actionEvent) {
        String numbercoupeStr = coupeAddTextfield.getText();
        double numberOfcoupe = Integer.parseInt(numbercoupeStr);
        Mclaren.addCoupeNumber(numberOfcoupe);
        showMclarenCoupeData();
    }

    private void showMclarenP1Data() {
        String p1Number = String.format("%.0f",Mclaren.getP1Number());
        p1NumberLabel.setText(p1Number);
    }

    private void showMclarenLTData() {
        String LTNumber = String.format("%.0f", Mclaren.getLTNumber());
        LTNumberLabel.setText(LTNumber);
    }

    private void showMclarenCoupeData() {
        String coupeNumber = String.format("%.0f", Mclaren.getCoupeNumber());
        CoupeNumberLabel.setText(coupeNumber);
    }


    @FXML
    private void adminHome(ActionEvent event)throws IOException {
        App.setRoot("admin_controller");
    }
}
