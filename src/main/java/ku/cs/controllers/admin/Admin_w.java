package ku.cs.controllers.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ku.cs.App;
import ku.cs.model.MclarenClass;
import ku.cs.model.WmotorClass;

import java.io.IOException;

public class Admin_w {
    @FXML private Label lykanNumberLabel;
    @FXML private Label fenyrNumberLabel;
    @FXML private TextField lykanAddTextfield;
    @FXML private TextField fenyrAddTextfield;

    private WmotorClass wmotor;

    @FXML
    public void initialize() {
        wmotor = new WmotorClass();
    }

    @FXML
    public void lykanAddButton(ActionEvent actionEvent) {
        String numberlykanStr = lykanAddTextfield.getText();
        double numberOflykancar = Double.parseDouble(numberlykanStr);
        wmotor.addlykanNumber(numberOflykancar);
        showlykanData();
    }

    @FXML
    public void fenyrAddButton(ActionEvent actionEvent){
        String numberfenyrStr = fenyrAddTextfield.getText();
        double numberOffenyrcar = Integer.parseInt(numberfenyrStr);
        wmotor.addfenyrNumber(numberOffenyrcar);
        showfenyrData();
    }

    private void showlykanData() {
        String lykanNumber = String.format("%.0f",wmotor.getLykanNumber());
        lykanNumberLabel.setText(lykanNumber);
    }

    private void showfenyrData() {
        String fenyrNumber = String.format("%.0f", wmotor.getFenyrNumber());
        fenyrNumberLabel.setText(fenyrNumber);
    }

    @FXML
    void adminHome(ActionEvent event)throws IOException {
        App.setRoot("admin_controller");
    }
}
