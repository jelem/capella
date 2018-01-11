package sample;

import javafx.scene.control.Alert;

public class Printer {

  public static void printTurn(String symbol) {
    Controller.whoseMove.setText("Player " + symbol + " Your turn!");
  }

  public static void congratulateWinner(Player player) {
    String winner = player.getSymbol();
    Alert winnerDialog = new Alert(Alert.AlertType.INFORMATION);
    winnerDialog.setTitle("");
    winnerDialog.setHeaderText(null);
    winnerDialog.setContentText("Player " + winner + " is champion");
    winnerDialog.show();
  }

  public static void printDraw() {
    Alert drawDialog = new Alert(Alert.AlertType.INFORMATION);
    drawDialog.setTitle("");
    drawDialog.setHeaderText(null);
    drawDialog.setContentText("It's draw");
    drawDialog.show();
  }
}
