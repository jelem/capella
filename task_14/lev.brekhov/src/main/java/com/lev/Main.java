package com.lev;

public class Main {

  public static void main(String[] args) {
    Player player1 = new Human("Lev", 'X');
    Player player2 = new AI("Alina", 'O');

    Game game = new Game(player1, player2);
    String result = game.play();

    System.out.println(result);

  }
}