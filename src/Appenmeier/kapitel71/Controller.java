package Appenmeier.kapitel71;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class Controller {
    @FXML
    private Label diceValueLabel;


    public void rollTheDice(ActionEvent event) {
        Random random = new Random();
        Integer randomNumber = random.nextInt(6) + 1;
        diceValueLabel.setText(randomNumber.toString());
    }


}
