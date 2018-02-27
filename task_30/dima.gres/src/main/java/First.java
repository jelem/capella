public class First extends Printer implements  Runnable {

  public First(int loops, long sleeps) {
    super();
    this.loops = loops;
    this.sleeps = sleeps;
  }

  private int loops;
  private long sleeps;

  @Override
  public void run() {
    for (int i = 0; i < loops; i++) {
      try {

        Thread.sleep(sleeps);

        if (mask(i) == 0) {
          System.out.println("#f " + i);
        }

      } catch (InterruptedException exc) {

        exc.printStackTrace();

      }

    }
  }
}
