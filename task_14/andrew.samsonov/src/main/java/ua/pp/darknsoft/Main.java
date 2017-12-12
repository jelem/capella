package ua.pp.darknsoft;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  public void start(Stage primaryStage) throws Exception {
    Parent parent = FXMLLoader.load(getClass().getResource("/fxml/xo.fxml"));

    Scene scene = new Scene(parent);
    primaryStage.setTitle("Capella - - TicTacToe -  - Hillel");
    primaryStage.setScene(scene);
    primaryStage.setMaxHeight(760);
    primaryStage.setMaxWidth(600);
    primaryStage.setMinHeight(760);
    primaryStage.setMinWidth(600);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
