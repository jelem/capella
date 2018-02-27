public class Second extends Printer implements Runnable {

  public Second(int loops, long sleeps) {
    super(loops, sleeps);
  }

  @Override
  public void run() {
    int loops = this.getLoops();
    long sleeps = this.getSleeps();

    for (int i = 0; i < loops; i++) {
      try {

        Thread.sleep(sleeps);

        if (mask(i) == 2) {
          System.out.println("/t#s " + (i + 1));
        }

      } catch (InterruptedException exc) {

        exc.printStackTrace();

      }

    }
  }
}
