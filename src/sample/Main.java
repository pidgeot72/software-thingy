package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
       Parent root = FXMLLoader.load(getClass().getResource("Untitled.fxml"));
        primaryStage.setScene(new Scene(root, 800,700));
        primaryStage.show();

        try {
                FXMLLoader loader = new
                        FXMLLoader(getClass().getResource("Untitled.fxml"));
                loader.setController(new Controller());

                primaryStage.show();
            } catch(Exception e) {
                e.printStackTrace();
            }



        }

    public static void main(String[] args) {
        launch(args);
        {
        }}

}

