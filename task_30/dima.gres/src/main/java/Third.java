public class Third extends Printer implements Runnable {

  public Third(int loops, long sleeps) {
    super(loops, sleeps);
  }

  @Override
  public void run() {
    int loops = this.getLoops();
    long sleeps = this.getSleeps();

    for (int i = 0; i < loops; i++) {
      try {

        Thread.sleep(sleeps);

        if (mask(i) == 0) {
          System.out.println("\t\t#t " + (i + 1));
        }

      } catch (InterruptedException exc) {

        exc.printStackTrace();

      }

    }
  }
}
