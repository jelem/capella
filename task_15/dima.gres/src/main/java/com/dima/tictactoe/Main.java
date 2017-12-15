package com.dima.tictactoe;

public class Main {

  public static void main(String[] args) {

    Game game = new Game();
    game.start();
    game.mainLoop();
    game.over();

  }
}
