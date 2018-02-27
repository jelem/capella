public class Main {

  public static void main(String[] args) {
    long pauses = 200;
    int loops = 100;

    Runnable firtst = new First(loops, pauses);
    Thread thread1 = new Thread(firtst);

    Runnable second = new Second(loops, pauses);
    Thread thread2 = new Thread(second);

    Runnable third = new Third(loops, pauses);
    Thread thread3 = new Thread(third);

    thread1.start();
    thread2.start();
    thread3.start();
  }
}
