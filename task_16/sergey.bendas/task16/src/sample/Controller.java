package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class Controller {


  private static final String X = "X";
  private static final String O = "O";
  private ObservableList<String> playerTypeList = FXCollections
      .observableArrayList("Human", "Computer Easy", "Computer Hard");
  @FXML
  public ChoiceBox<String> player1Choice;

  public static Label whoseMove;

  @FXML
  private Label label1;
  private Game game;
  @FXML
  public ChoiceBox<String> player2Choice;
  @FXML
  Button btn11;
  @FXML
  Button btn12;
  @FXML
  Button btn13;
  @FXML
  Button btn21;
  @FXML
  Button btn22;
  @FXML
  Button btn23;
  @FXML
  Button btn31;
  @FXML
  Button btn32;
  @FXML
  Button btn33;
  @FXML
  private
  Button[][] buttons = new Button[3][3];

  @FXML
  public void initialize() {
    player1Choice.setItems(playerTypeList);
    player2Choice.setItems(playerTypeList);
    player1Choice.setValue("Human");
    player2Choice.setValue("Human");
    buttons[0][0] = btn11;
    buttons[0][1] = btn12;
    buttons[0][2] = btn13;
    buttons[1][0] = btn21;
    buttons[1][1] = btn22;
    buttons[1][2] = btn23;
    buttons[2][0] = btn31;
    buttons[2][1] = btn32;
    buttons[2][2] = btn33;
    whoseMove = label1;
  }


  public void btn11Click(ActionEvent actionEvent) {

    game.makeMove(0, 0);
  }

  public void btn12Click(ActionEvent actionEvent) {

    game.makeMove(0, 1);
  }

  public void btn13Click(ActionEvent actionEvent) {
    game.makeMove(0, 2);
  }

  public void btn21Click(ActionEvent actionEvent) {
    game.makeMove(1, 0);
  }

  public void btn22Click(ActionEvent actionEvent) {
    game.makeMove(1, 1);
  }

  public void btn23Click(ActionEvent actionEvent) {
    game.makeMove(1, 2);
  }

  public void btn31Click(ActionEvent actionEvent) {
    game.makeMove(2, 0);
  }

  public void btn32Click(ActionEvent actionEvent) {
    game.makeMove(2, 1);
  }

  public void btn33Click(ActionEvent actionEvent) {
    game.makeMove(2, 2);
  }

  public void btnStartClick(ActionEvent actionEvent) {
    Player player1 = PlayerCreator.createPlayer(player1Choice.getValue(), X);
    Player player2 = PlayerCreator.createPlayer(player2Choice.getValue(), O);

    game = new Game(buttons, player1, player2);
    game.startGame();

  }

}

