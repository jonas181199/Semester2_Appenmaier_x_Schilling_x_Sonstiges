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

        @FXML
        Image image1 = new Image("@../../../../../../../Downloads/768px-NYCS-bull-trans-2.svg.png");

        @FXML
        Image image2 = new Image("@../../../../../../../Downloads/1024px-NYCS-bull-trans-1.svg.png");



        public void rollTheDice(ActionEvent event) {
            Random random = new Random();
            Integer randomNumber = random.nextInt(6) + 1;
            diceValueLabel.setText(randomNumber.toString());

            Image image = new Image(getClass().getResourceAsStream("files/"+ random +".png"));
            diceImageView.setFitHeight(200); //726
            diceImageView.setFitWidth(200); //500
            diceImageView.setImage(image);


        }
}
