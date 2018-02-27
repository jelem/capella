public class Main {

  public static void main(String[] args) {
    long pauses = 250;
    int loops = 10;

    Runnable firtst = new First(loops, pauses);
    Thread thread1 = new Thread(firtst);

    thread1.start();
  }
}
