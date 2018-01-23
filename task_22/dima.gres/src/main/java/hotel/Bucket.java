package hotel;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bucket implements FuncOfBucket, Iterable {

  private static final int SIZE = Person.Zet - Person.Alpha + 1;
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
      if (tmp == null) {
        return NONE;
      }

      if (tmp.key.equals(key)) {
        return tmp.value;
      }

      tmp = tmp.next;
    }
  }

  private class AheadIterator implements Iterator {
    private int index;
    private Node current;

    public AheadIterator() {
      index = 0;
      current = nodes[index];
    }

    @Override
    public boolean hasNext() {
      return index < SIZE || current != null
          ;
    }

    @Override
    public Object next() {

      while ( current == null && index < SIZE ) {
        if (current == null && index < SIZE) {
          ++index;

          if (index < SIZE) {
            current = nodes[index];
          }
        }
      }

      if (current == null) {
        throw new NoSuchElementException("element not found");
      } else if (current.next != null) {
        Person buf = current.key;
        current = current.next;
        return buf;
      } else {
        Person tmp = current.key;
        index++;
        if (index < SIZE) {
          current = nodes[index];
        }
        return tmp;
      }
    }
  }

  @Override
  public Iterator iterator() {
    return new AheadIterator();
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
