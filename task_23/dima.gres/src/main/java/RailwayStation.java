import java.util.ArrayList;
import java.util.Iterator;

public class RailwayStation {
  private ArrayList<Express> list;

  public RailwayStation() {
    list = new ArrayList<>(10);
  }

  public void add(Express train) {
    list.add(train);
  }

  public void pop(Express train) {
    list.remove(train);
  }

  public Express cassa(Express train) throws NoExpress {
    int index = -1;
    if (list.isEmpty() || ( index = isFound(train) ) == -1) {
      throw new NoExpress("express not found");
    }
    return list.get(index);
  }

  private int isFound(Express train) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equals(train)) {
        return i;
      }
    }

    return -1;
  }
}
