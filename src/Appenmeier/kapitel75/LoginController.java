package Appenmeier.kapitel75;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    private Model model;

    @FXML
    private TextField userNameTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    public void login(ActionEvent event) throws IOException {
        String userName = userNameTextField.getText();
        String password = passwordTextField.getText();

        if (userName.equals("") || password.equals("")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Bitte beide Felder befüllen.");
            alert.show();
        } else {
            model.setUser(userName, password);
            Parent root = FXMLLoader.load(getClass().getResource("UserView.fxml"));
            Scene scene = new Scene(root);
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
            /*Parent root = FXMLLoader.load(getClass().getResource("UserView.fxml"));
            Scene newScene = new Scene(root);
            Scene currentScene = userNameTextField.getScene();
            Stage primaryStage = (Stage) currentScene.getWindow();
            primaryStage.setTitle("Exercise 7.5");
            primaryStage.setScene(newScene);
            primaryStage.show();*/
    }




    public void initialize(URL location, ResourceBundle resources) {
        model = Model.getInstance();

    }


}
