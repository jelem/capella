package sample;

import javafx.scene.control.Button;

public class Board {

  private static final String XXX = "XXX";
  private static final String OOO = "OOO";
  private static final String FREE = " ";
  private Button[][] buttons;

  public Board(Button[][] buttons) {
    this.buttons = buttons;
    this.cleanButtons();
    this.enableButttons();
  }

  private void cleanButtons() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        this.buttons[i][j].setText(FREE);
      }
    }
  }

  public void enableButttons() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        buttons[i][j].setDisable(false);
      }
    }
  }

  public void disableButttons() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        buttons[i][j].setDisable(true);
      }
    }
  }

  public boolean isWinningCombination() {
    StringBuilder leftDiag = new StringBuilder();
    StringBuilder rightDiag = new StringBuilder();
    for (int i = 0; i < 3; i++) {
      StringBuilder horizontalSum = new StringBuilder();
      StringBuilder verticalSum = new StringBuilder();
      leftDiag.append(buttons[i][i].getText());
      rightDiag.append(buttons[i][2 - i].getText());
      for (int j = 0; j < 3; j++) {
        horizontalSum.append(buttons[i][j].getText());
        verticalSum.append(buttons[j][i].getText());
      }
      if (horizontalSum.toString().equals(XXX)
          || verticalSum.toString().equals(XXX)
          || horizontalSum.toString().equals(OOO)
          || verticalSum.toString().equals(OOO)) {
        return true;
      }
    }
    return leftDiag.toString().equals(OOO)
        || rightDiag.toString().equals(OOO)
        || leftDiag.toString().equals(XXX)
        || rightDiag.toString().equals(XXX);
  }

  public boolean isFilled() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (buttons[i][j].getText()
            .equals(FREE)) {
          return false;
        }
      }
    }
    return true;
  }

  public boolean isFree(int firstCoordinate, int secondCoordinate) {
    return buttons[firstCoordinate][secondCoordinate].getText()
        .equals(FREE);
  }

  public void setMove(String symbol, int firstCoord, int secondCoord) {
    buttons[firstCoord][secondCoord].setText(symbol);
    buttons[firstCoord][secondCoord].setDisable(true);
  }

  public String valueAt(int firstCoord, int secondCoord) {
    return buttons[firstCoord][secondCoord].getText();
  }

  public Button[][] getButtons() {
    return buttons;
  }
}
