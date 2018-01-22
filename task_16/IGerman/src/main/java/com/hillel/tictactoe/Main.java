package com.hillel.tictactoe;

public class Main {

  public static void main(String[] args) {

    Player player1 = new Player("Bob", 'X');
    Game game = new Game(player1);

    String result = game.play();

    System.out.println(result);
  }

}
