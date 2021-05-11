package Appenmeier.kapitel73;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Controller {



    @FXML
    private TextField userNameTextField;

    @FXML
    private TextField passwordTextField;

    public void login(ActionEvent event){
        String text;
        text = "Username: " + userNameTextField.getText() + ", Passwort: " + passwordTextField.getText();
        Alert alert = new Alert(Alert.AlertType.INFORMATION, text);
        alert.show();
    }

}
