public class Bucket implements FuncOfBucket {

  private static final int SIZE = 'Z' - 'A' + 1;
  private static final String NONE = "none";
  private Node[] nodes;

  public Bucket() {
    nodes = new Node[SIZE];
  }

  @Override
  public void put(Person key, String nummer) {
    Node current = new Node(key, nummer);
    int index = key.hashCode();

    if (nodes[index] == null) {
      nodes[index] = current;
      return;
    }

    Node tmp = nodes[index];

    while (true) {
      if (tmp.key.equals(key)) {
        tmp.value = nummer;
        return;
      }

      if (tmp.next == null) {
        tmp.next = current;
        return;
      }

      tmp = tmp.next;
    }
  }

  @Override
  public String get(Person key) {
    int index = key.hashCode();

    if (nodes[index] == null) {
      return NONE;
    }

    Node tmp = nodes[index];

    while (true) {
      if (tmp.key.equals(key)) {
        return tmp.value;
      }

      if (tmp.next == null) {
        return NONE;
      }

      tmp = tmp.next;
    }

  }

  private static class Node {
    private Person key;
    private String value;
    private Node next;

    public Node(Person key, String value) {
      this.key = key;
      this.value = value;
      this.next = null;
    }
  }

}
