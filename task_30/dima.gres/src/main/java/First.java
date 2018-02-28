public class First extends Printer implements  Runnable {

  public First(int loops, long sleeps) {
    super(loops, sleeps);
  }



  @Override
  public void run() {
    int loops = this.getLoops();
    long sleeps = this.getSleeps();

    for (int i = 0; i < loops; i++) {
      try {

        Thread.sleep(sleeps);

        if (mask(i) == 1) {
          System.out.println("#f " + (i + 1));
        }

      } catch (InterruptedException exc) {

        exc.printStackTrace();

      }

    }
  }
}
