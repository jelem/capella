public class Main {

  public static void main(String[] args) {
    Player player1 = new Ai("Andrey", 'X');
    Player player2 = new Ai("Vasili", 'O');

    GameProcess game = new GameProcess(player1, player2);
    game.play();
  }
}
