package ua.pp.darknsoft.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import ua.pp.darknsoft.game.TicTacToe;

public class Controller {

  @FXML
  Button buttonOne;
  @FXML
  Button buttonTwo;
  @FXML
  Button buttonThree;
  @FXML
  Button buttonFour;
  @FXML
  Button buttonFive;
  @FXML
  Button buttonSix;
  @FXML
  Button buttonSeven;
  @FXML
  Button buttonEight;
  @FXML
  Button buttonNine;
  @FXML
  Label infoLabel;
  @FXML
  Button buttonNewGame;
  @FXML
  Label scoreLabelX;
  @FXML
  Label scoreLabelO;

  public void buttonAction_00(ActionEvent actionEvent) {
    int[] coord = new int[]{0, 0};
    if (TicTacToe.validateCoordinates(coord)) {
      TicTacToe.makeMove(coord, TicTacToe.getCurrentPlayer());
      buttonOne.setText(TicTacToe.getCurrentPlayer() + "");
      if (!TicTacToe.calculateWinner()) {
        TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
        infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
      } else {
        gameStop();
      }
    }
  }

  public void buttonAction_10(ActionEvent actionEvent) {
    int[] coord = new int[]{1, 0};
    if (TicTacToe.validateCoordinates(coord)) {
      TicTacToe.makeMove(coord, TicTacToe.getCurrentPlayer());
      buttonFour.setText(TicTacToe.getCurrentPlayer() + "");
      if (!TicTacToe.calculateWinner()) {
        TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
        infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
      } else {
        gameStop();
      }
    }
  }

  public void buttonAction_20(ActionEvent actionEvent) {
    int[] coord = new int[]{2, 0};
    if (TicTacToe.validateCoordinates(coord)) {
      TicTacToe.makeMove(coord, TicTacToe.getCurrentPlayer());
      buttonSeven.setText(TicTacToe.getCurrentPlayer() + "");
      if (!TicTacToe.calculateWinner()) {
        TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
        infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
      } else {
        gameStop();
      }
    }
  }

  public void buttonAction_01(ActionEvent actionEvent) {
    int[] coord = new int[]{0, 1};
    if (TicTacToe.validateCoordinates(coord)) {
      TicTacToe.makeMove(coord, TicTacToe.getCurrentPlayer());
      buttonTwo.setText(TicTacToe.getCurrentPlayer() + "");
      if (!TicTacToe.calculateWinner()) {
        TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
        infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
      } else {
        gameStop();
      }
    }
  }

  public void buttonAction_11(ActionEvent actionEvent) {
    int[] coord = new int[]{1, 1};
    if (TicTacToe.validateCoordinates(coord)) {
      TicTacToe.makeMove(coord, TicTacToe.getCurrentPlayer());
      buttonFive.setText(TicTacToe.getCurrentPlayer() + "");
      if (!TicTacToe.calculateWinner()) {
        TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
        infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
      } else {
        gameStop();
      }
    }
  }

  public void buttonAction_21(ActionEvent actionEvent) {
    int[] coord = new int[]{2, 1};
    if (TicTacToe.validateCoordinates(coord)) {
      TicTacToe.makeMove(coord, TicTacToe.getCurrentPlayer());
      buttonEight.setText(TicTacToe.getCurrentPlayer() + "");
      if (!TicTacToe.calculateWinner()) {
        TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
        infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
      } else {
        gameStop();
      }
    }
  }

  public void buttonAction_02(ActionEvent actionEvent) {
    int[] coord = new int[]{0, 2};
    if (TicTacToe.validateCoordinates(coord)) {
      TicTacToe.makeMove(coord, TicTacToe.getCurrentPlayer());
      buttonThree.setText(TicTacToe.getCurrentPlayer() + "");
      if (!TicTacToe.calculateWinner()) {
        TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
        infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
      } else {
        gameStop();
      }
    }
  }

  public void buttonAction_12(ActionEvent actionEvent) {
    int[] coord = new int[]{1, 2};
    if (TicTacToe.validateCoordinates(coord)) {
      TicTacToe.makeMove(coord, TicTacToe.getCurrentPlayer());
      buttonSix.setText(TicTacToe.getCurrentPlayer() + "");
      if (!TicTacToe.calculateWinner()) {
        TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
        infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
      } else {
        gameStop();
      }
    }

  }

  public void buttonAction_22(ActionEvent actionEvent) {
    int[] coord = new int[]{2, 2};
    if (TicTacToe.validateCoordinates(coord)) {
      TicTacToe.makeMove(coord, TicTacToe.getCurrentPlayer());
      buttonNine.setText(TicTacToe.getCurrentPlayer() + "");
      if (!TicTacToe.calculateWinner()) {
        TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
        infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
      } else {
        gameStop();
      }
    }
  }

  public void buttonAction_newGame(ActionEvent actionEvent) {
    TicTacToe.newGame();
    TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
    infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
    buttonOne.setText("");
    buttonTwo.setText("");
    buttonThree.setText("");
    buttonFour.setText("");
    buttonFive.setText("");
    buttonSix.setText("");
    buttonSeven.setText("");
    buttonEight.setText("");
    buttonNine.setText("");
    buttonOne.setDisable(false);
    buttonTwo.setDisable(false);
    buttonThree.setDisable(false);
    buttonFour.setDisable(false);
    buttonFive.setDisable(false);
    buttonSix.setDisable(false);
    buttonSeven.setDisable(false);
    buttonEight.setDisable(false);
    buttonNine.setDisable(false);
  }

  public void gameStop() {
    buttonOne.setDisable(true);
    buttonTwo.setDisable(true);
    buttonThree.setDisable(true);
    buttonFour.setDisable(true);
    buttonFive.setDisable(true);
    buttonSix.setDisable(true);
    buttonSeven.setDisable(true);
    buttonEight.setDisable(true);
    buttonNine.setDisable(true);
    TicTacToe.setScore();
    infoLabel.setText("Победил игрок: " + TicTacToe.getCurrentPlayer());
    scoreLabelX.setText("X: " + TicTacToe.getScoreX());
    scoreLabelO.setText("O: " + TicTacToe.getScoreO());
  }
}
