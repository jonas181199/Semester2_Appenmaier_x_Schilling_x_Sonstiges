package Appenmeier.FXMLxunnöetig;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class thirtyapril extends Application {

    public void init() throws Exception{
        System.out.println("Init()");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Start()");
        Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Demo");

        primaryStage.show();
    }


}
