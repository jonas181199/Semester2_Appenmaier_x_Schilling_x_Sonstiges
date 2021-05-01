package Appenmeier.Kapitel74;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;


    public class Controller {
        @FXML
        private Label diceValueLabel;

        @FXML
        private ImageView diceImageView;

        public void rollTheDice(ActionEvent event) {
            Random random = new Random();
            Integer randomNumber = random.nextInt(6) + 1;
            diceValueLabel.setText(randomNumber.toString());

            Image image = new Image(getClass().getResourceAsStream("files/"+ randomNumber +".png"));
            diceImageView.setFitHeight(100); //726
            diceImageView.setFitWidth(100); //500
            diceImageView.setImage(image);


        }
}
