package ku.cs.controllers.admin;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ku.cs.App;
import ku.cs.model.LamborghiniClass;

import java.io.IOException;

public class Admin_lam {

    @FXML private Label avensNumberLabel;
    @FXML private Label evoNumberLabel;
    @FXML private Label urusNumberLabel;
    @FXML private TextField avensAddTextfield;
    @FXML private TextField evoAddTextfield;
    @FXML private TextField urusAddTextfield;

    private LamborghiniClass lamBorghini;

    @FXML
    public void initialize() {
        lamBorghini = new LamborghiniClass();
    }

    @FXML
    public void avensAddButton(ActionEvent actionEvent) {
        String numberavensStr = avensAddTextfield.getText();
        double numberOfAvenscar = Double.parseDouble(numberavensStr);
        lamBorghini.addAvensNumber(numberOfAvenscar);
        showLamborghiniAvensData();
    }

    @FXML
    public void EVOaddButton(ActionEvent actionEvent){
        String numberevoString = evoAddTextfield.getText();
        double numberOfEVOcar = Integer.parseInt(numberevoString);
        lamBorghini.addEVONumber(numberOfEVOcar);
        showLamborghiniEvoData();
    }

    @FXML
    public void urusAddButton(ActionEvent actionEvent) {
        String numberurusString = urusAddTextfield.getText();
        double numberOfUruscar = Integer.parseInt(numberurusString);
        lamBorghini.addUrusNumber(numberOfUruscar);
        showLamborghiniUrusData();
    }

    private void showLamborghiniAvensData() {
        String avensNumber = String.format("%.0f",lamBorghini.getAvensNumber());
        avensNumberLabel.setText(avensNumber);
    }

    private void showLamborghiniEvoData() {
        String evoNumber = String.format("%.0f", lamBorghini.getEvoNumber());
        evoNumberLabel.setText(evoNumber);
    }

    private void showLamborghiniUrusData() {
        String urusNuber = String.format("%.0f", lamBorghini.getUrusNuber());
        urusNumberLabel.setText(urusNuber);
    }

    @FXML
    private void homeHyperlink() throws IOException{
        App.setRoot("admin_controller");
    }

}
