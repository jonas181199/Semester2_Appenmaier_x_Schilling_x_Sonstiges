package Appenmeier.Kapitel72;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
        //Anfangskapital(1+(Zinssatz/100)^Laufzeit - Anfangskapital
        //getText 10000 als String --> parse in double Wert
        double startkapital = Double.parseDouble(initialCapitalTextField.getText());
        double zinssatz = Double.parseDouble(interestRateTextField.getText());
        double laufzeit = Double.parseDouble(runningTimeTextField.getText());
        double zinsenOhneStartkapital = (1 + zinssatz / 100);
        double result = Math.pow(zinsenOhneStartkapital, 10);
        double zinsen = (result * startkapital) - startkapital;

        interestLabel.setText(String.valueOf(zinsen));
    }




}
