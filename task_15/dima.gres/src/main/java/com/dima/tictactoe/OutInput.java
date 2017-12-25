package com.dima.tictactoe;

import java.util.Scanner;

public class OutInput {

  private  int rows = 0;
  private int cols = 0;
  private Scanner scanner = new Scanner(System.in, "UTF-8");

  public void out(Board field, Player current) {
    drawBoard(field);
    messageOfInvitationToInput(current.getSignature());
  }

  private void drawBoard(Board field) {
    for (int i = 0; i < field.getRow(); i++) {
      for (int j = 0; j < field.getCol(); j++) {
        if (field.getCell(i, j) != field.getTerminate()) {
          System.out.print(" " + field.getCell(i, j) + " ");
        } else {
          System.out.print(i + " " + j);
        }
        if (j == 0 || j == 1 ) {
          System.out.print("|");
        }
      }
      System.out.println("\n___________");
    }
  }

  public void in(Board field , Player current) {
    scanf();
    while ( !field.isCorrectCoords(rows, cols) ) {
      messageErrorInput(current.getSignature());
      scanf();
    }
    field.setCell(current.getSignature(), rows, cols);
  }

  private void scanf() {
    rows = scanner.nextInt();
    cols = scanner.nextInt();
  }

  private void messageErrorInput(char ch) {
    System.out.println(ch + " repeat to input correct data: ");
  }

  private void messageOfInvitationToInput(char ch) {
    System.out.print(ch + " input (row, col): ");
  }


  public void outResult(Player winner) {
    if (winner == null) {
      System.out.println("...Draw..");
    } else {
      System.out.println("Congratulations " + winner.getSignature() + ". You're the champion " + winner.getName());
    }
  }

  public void setNamePlayer(Player player) {
    Scanner scanner = new Scanner(System.in, "UTF-8");
    String name = scanner.next();
    player.setName(name);
  }

  public void whatIsYourName(String num) {
    System.out.print("What is your name " + num + " player: ");
  }
}
