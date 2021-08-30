package ku.cs.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import ku.cs.App;
import ku.cs.model.user.Account;

import java.io.IOException;

public class Website {

    @FXML private ImageView image1;
    @FXML private ImageView image2;
    @FXML private ImageView image3;
    @FXML private ImageView image4;
    @FXML private ImageView image5;
    @FXML private ImageView image6;

    @FXML
    public void initialize() {
        Image min = new Image(getClass().getResourceAsStream("/image/MIN.png"));
        image1.setImage(min);

        Image lam = new Image(getClass().getResourceAsStream("/image/lamborghini-logo.png"));
        image2.setImage(lam);

        Image fer = new Image(getClass().getResourceAsStream("/image/ferrarilogo.png"));
        image3.setImage(fer);

        Image mc = new Image(getClass().getResourceAsStream("/image/mclarenlogo.png"));
        image4.setImage(mc);

        Image w = new Image(getClass().getResourceAsStream("/image/wmotorlogo.png"));
        image5.setImage(w);

        Image bu = new Image(getClass().getResourceAsStream("/image/bugattilogo.png"));
        image6.setImage(w);
    }


    @FXML
    private void logout() throws IOException {
        App.setRoot("automobill");
    }

    @FXML
    private void handleuserHyperlink() throws IOException{
        App.setRoot("user");
    }

    @FXML
    private void handlecartHyperlink() throws IOException{
        App.setRoot("cart");
    }


    @FXML
    private void lamborghiniMoseClick(MouseEvent event) throws IOException{
        App.setRoot("lamborghini");
    }

    @FXML
    private void ferrariMoseClick(MouseEvent event) throws IOException{
        App.setRoot("ferrari");
    }

    @FXML
    private void mclarenMoseClick(MouseEvent event) throws IOException{
        App.setRoot("mclaren");
    }

    @FXML
    private void wmotorMoseClick(MouseEvent event) throws IOException{
        App.setRoot("wmotor");
    }

    @FXML
    private void bugattiMoseClick(MouseEvent event) throws IOException{
        App.setRoot("bugatti");
    }


    @FXML
    private void handlelamborghiniHyperlink() throws IOException {
        App.setRoot("lamborghini");
    }

    @FXML
    private void handleferrariHyperlink() throws IOException {
        App.setRoot("ferrari");
    }

    @FXML
    private void handlemclarenHyperlink() throws IOException {
        App.setRoot("mclaren");
    }

    @FXML
    private void handlewmotorHyperlink() throws IOException {
        App.setRoot("wmotor");
    }

    @FXML
    private void handlebugattiHyperlink() throws IOException {
        App.setRoot("bugatti");
    }


    public void setAdmin(Account admin) {
    }
}
