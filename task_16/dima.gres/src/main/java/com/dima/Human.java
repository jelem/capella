package com.dima;

import java.util.Scanner;

public class Human extends Player {
  public Human(char thisChar) {
    super(thisChar);
  }

  @Override
  public void makeMove(Board board) {
    Scanner scanner = new Scanner(System.in);
    MessageBox.input(this.getThisChar());
    int index = scanner.nextInt();
    while (!board.isValidCoord(index)) {
      MessageBox.error();
      index = scanner.nextInt();
    }
    board.setCell(this.getThisChar(), index);
  }
}
