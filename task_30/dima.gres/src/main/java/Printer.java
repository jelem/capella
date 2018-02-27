public abstract class Printer {

  private int loops;
  private long sleeps;

  public Printer(int loops, long sleeps) {
    this.loops = loops;
    this.sleeps = sleeps;
  }

  public int getLoops() {
    return loops;
  }

  public long getSleeps() {
    return sleeps;
  }

  public int mask(int itr) {
    return (itr + 1) % 3;
  }

}
