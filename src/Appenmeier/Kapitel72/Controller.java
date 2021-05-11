package Appenmeier.Kapitel72;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField initialCapitalTextField;

    @FXML
    private TextField interestRateTextField;

    @FXML
    private TextField runningTimeTextField;

    @FXML
    private Label interestLabel;


    public void calculateInterest(ActionEvent event) {
        //Anfangskapital (1+(Zinssatz/100) ^ Laufzeit - Anfangskapital
        //getText 10000 als String --> parse in double Wert
        try {
            double startkapital = Double.parseDouble(initialCapitalTextField.getText());
            double zinssatz = Double.parseDouble(interestRateTextField.getText());
            double laufzeit = Double.parseDouble(runningTimeTextField.getText());
            double zinsenOhneStartkapitalUndHoch = (1 + zinssatz / 100);
            double zinsenOhneStartkapitalMitHoch = Math.pow(zinsenOhneStartkapitalUndHoch, laufzeit);
            double zinsen = (zinsenOhneStartkapitalMitHoch * startkapital) - startkapital;

            interestLabel.setText(String.valueOf(zinsen));
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Ungültige oder fehlende Eingabe");
            alert.show();
        }
    }




}
