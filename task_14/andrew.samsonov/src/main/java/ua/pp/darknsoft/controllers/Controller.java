package ua.pp.darknsoft.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import ua.pp.darknsoft.game.TicTacToe;

public class Controller {

  @FXML
  Button buttonId_00;
  @FXML
  Button buttonId_01;
  @FXML
  Button buttonId_02;
  @FXML
  Button buttonId_10;
  @FXML
  Button buttonId_11;
  @FXML
  Button buttonId_12;
  @FXML
  Button buttonId_20;
  @FXML
  Button buttonId_21;
  @FXML
  Button buttonId_22;
  @FXML
  Label infoLabel;
  @FXML
  Button buttonNewGame;

  public void buttonAction_00(ActionEvent actionEvent) {
    int[] coord = new int[]{0, 0};
    if (TicTacToe.validateCoordinates(coord)) {
      TicTacToe.makeMove(coord, TicTacToe.getCurrentPlayer());
      buttonId_00.setText(TicTacToe.getCurrentPlayer() + "");
      if (!TicTacToe.calculateWinner()) {
        TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
        infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
      } else {
        infoLabel.setText("Победил игрок: " + TicTacToe.getCurrentPlayer());
        gameStop();
      }
    }
  }

  public void buttonAction_10(ActionEvent actionEvent) {
    int[] coord = new int[]{1, 0};
    if (TicTacToe.validateCoordinates(coord)) {
      TicTacToe.makeMove(coord, TicTacToe.getCurrentPlayer());
      buttonId_10.setText(TicTacToe.getCurrentPlayer() + "");
      if (!TicTacToe.calculateWinner()) {
        TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
        infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
      } else {
        infoLabel.setText("Победил игрок: " + TicTacToe.getCurrentPlayer());
        gameStop();
      }
    }
  }

  public void buttonAction_20(ActionEvent actionEvent) {
    int[] coord = new int[]{2, 0};
    if (TicTacToe.validateCoordinates(coord)) {
      TicTacToe.makeMove(coord, TicTacToe.getCurrentPlayer());
      buttonId_20.setText(TicTacToe.getCurrentPlayer() + "");
      if (!TicTacToe.calculateWinner()) {
        TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
        infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
      } else {
        infoLabel.setText("Победил игрок: " + TicTacToe.getCurrentPlayer());
        gameStop();
      }
    }
  }

  public void buttonAction_01(ActionEvent actionEvent) {
    int[] coord = new int[]{0, 1};
    if (TicTacToe.validateCoordinates(coord)) {
      TicTacToe.makeMove(coord, TicTacToe.getCurrentPlayer());
      buttonId_01.setText(TicTacToe.getCurrentPlayer() + "");
      if (!TicTacToe.calculateWinner()) {
        TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
        infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
      } else {
        infoLabel.setText("Победил игрок: " + TicTacToe.getCurrentPlayer());
        gameStop();
      }
    }
  }

  public void buttonAction_11(ActionEvent actionEvent) {
    int[] coord = new int[]{1, 1};
    if (TicTacToe.validateCoordinates(coord)) {
      TicTacToe.makeMove(coord, TicTacToe.getCurrentPlayer());
      buttonId_11.setText(TicTacToe.getCurrentPlayer() + "");
      if (!TicTacToe.calculateWinner()) {
        TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
        infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
      } else {
        infoLabel.setText("Победил игрок: " + TicTacToe.getCurrentPlayer());
        gameStop();
      }
    }
  }

  public void buttonAction_21(ActionEvent actionEvent) {
    int[] coord = new int[]{2, 1};
    if (TicTacToe.validateCoordinates(coord)) {
      TicTacToe.makeMove(coord, TicTacToe.getCurrentPlayer());
      buttonId_21.setText(TicTacToe.getCurrentPlayer() + "");
      if (!TicTacToe.calculateWinner()) {
        TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
        infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
      } else {
        infoLabel.setText("Победил игрок: " + TicTacToe.getCurrentPlayer());
        gameStop();
      }
    }
  }

  public void buttonAction_02(ActionEvent actionEvent) {
    int[] coord = new int[]{0, 2};
    if (TicTacToe.validateCoordinates(coord)) {
      TicTacToe.makeMove(coord, TicTacToe.getCurrentPlayer());
      buttonId_02.setText(TicTacToe.getCurrentPlayer() + "");
      if (!TicTacToe.calculateWinner()) {
        TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
        infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
      } else {
        infoLabel.setText("Победил игрок: " + TicTacToe.getCurrentPlayer());
        gameStop();
      }
    }
  }

  public void buttonAction_12(ActionEvent actionEvent) {
    int[] coord = new int[]{1, 2};
    if (TicTacToe.validateCoordinates(coord)) {
      TicTacToe.makeMove(coord, TicTacToe.getCurrentPlayer());
      buttonId_12.setText(TicTacToe.getCurrentPlayer() + "");
      if (!TicTacToe.calculateWinner()) {
        TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
        infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
      } else {
        infoLabel.setText("Победил игрок: " + TicTacToe.getCurrentPlayer());
        gameStop();
      }
    }

  }

  public void buttonAction_22(ActionEvent actionEvent) {
    int[] coord = new int[]{2, 2};
    if (TicTacToe.validateCoordinates(coord)) {
      TicTacToe.makeMove(coord, TicTacToe.getCurrentPlayer());
      buttonId_22.setText(TicTacToe.getCurrentPlayer() + "");
      if (!TicTacToe.calculateWinner()) {
        TicTacToe.switchCurrentPlayer(TicTacToe.getCurrentPlayer());
        infoLabel.setText("Ход за игроком: " + TicTacToe.getCurrentPlayer());
      } else {
        infoLabel.setText("Победил игрок: " + TicTacToe.getCurrentPlayer());
        gameStop();
      }
    }
  }

  public void buttonAction_newGame(ActionEvent actionEvent) {
    TicTacToe.newGame();
    buttonId_00.setText("");
    buttonId_01.setText("");
    buttonId_02.setText("");
    buttonId_10.setText("");
    buttonId_11.setText("");
    buttonId_12.setText("");
    buttonId_20.setText("");
    buttonId_21.setText("");
    buttonId_22.setText("");
    buttonId_00.setVisible(true);
    buttonId_01.setVisible(true);
    buttonId_02.setVisible(true);
    buttonId_10.setVisible(true);
    buttonId_11.setVisible(true);
    buttonId_12.setVisible(true);
    buttonId_20.setVisible(true);
    buttonId_21.setVisible(true);
    buttonId_22.setVisible(true);
  }

  public void gameStop() {
    buttonId_00.setVisible(false);
    buttonId_01.setVisible(false);
    buttonId_02.setVisible(false);
    buttonId_10.setVisible(false);
    buttonId_11.setVisible(false);
    buttonId_12.setVisible(false);
    buttonId_20.setVisible(false);
    buttonId_21.setVisible(false);
    buttonId_22.setVisible(false);
  }
}
