import java.util.ArrayList;

public class RailwayStation {
  private ArrayList<Express> list;

  public RailwayStation() {
    list = new ArrayList<>(10);
  }

  public void add(Express train) {
    list.add(train);
  }

  public void pop(Express train) {

  }
}
