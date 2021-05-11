package Appenmeier.kapitel75;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class UserController implements Initializable {

    @FXML
    private Label userNameLabel;

    private Model model;

    public void initialize(URL location, ResourceBundle resources){
        model = Model.getInstance();
        userNameLabel.setText("Hallo " + model.getUserName());
    }

}
