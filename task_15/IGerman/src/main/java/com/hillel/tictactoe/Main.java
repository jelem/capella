package com.hillel.tictactoe;

public class Main {

  public static void main(String[] args) {
    Player player1 = new Player("John", 'X');
    Player player2 = new Player("Sam", 'O');

    Game game = new Game(player1, player2);
    String result = game.play();

    System.out.println(result);
  }
}

