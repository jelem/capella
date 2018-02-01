package com.lev;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in,"utf-8");
    System.out.println("Choose the game from: easy, hard, human");
    String complexity = scanner.next();

    while (true) {
      if (complexity.equals("hard") || complexity.equals("easy") || complexity.equals("human")) {
        break;
      } else {
        System.out.println("Doesn't match, enter again!");
        complexity = scanner.next();
      }
    }

    Player player1 = new Human("Lev", 'X');
    Player player2;

    switch (complexity) {
      case "hard":
        player2 = new AIHard("Siri", 'O');
        break;
      case "easy":
        player2 = new AIEasy("Siri", 'O');
        break;
      default:
        player2 = new Human("Anton", 'O');
        break;
    }

    Game game = new Game(player1, player2);
    String result = game.play();

    System.out.println(result);
  }
}