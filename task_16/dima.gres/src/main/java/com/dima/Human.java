package com.dima;

import java.util.Scanner;

public class Human extends Player {
  private Scanner scanner = new Scanner(System.in, "UTF-8");

  @Override
  public void makeMove(Board board) {
    Conversation.inputMessage(this.getSignature());
    int buf = scanner.nextInt();
    while ( !board.isValid(buf) ) {
      Conversation.errorMessage(this.getSignature());
      Conversation.inputMessage(this.getSignature());
      buf = scanner.nextInt();
    }
    board.fill(getSignature() ,buf);
  }

  public Human(char ch) {
    super(ch);
  }
}
