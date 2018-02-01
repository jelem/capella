package com.lev.task_1;

public class File {

  private Node[] bucket;
  private static final int SIZE = 26;

  public File() {
    bucket = new Node[SIZE];
  }

  public void put(Lodger key, Apartment value) {
    Node guest = new Node(key, value, null);
    int hash = key.hashCode();
    int index = calculateIndex(hash);

    if (bucket[index] == null) {
      bucket[index] = guest;
      return;
    }

    Node current = bucket[index];

    while (true) {
      if (current.key.equals(key)) {
        current.value = value;
        return;
      }
      if (current.next != null) {
        current = current.next;
      } else {
        break;
      }
    }

    current.next = guest;
  }

  private int calculateIndex(int hash) {
    return Math.abs(hash) % SIZE;
  }

  public Apartment get(Lodger key) {
    int hash = key.hashCode();
    int index = calculateIndex(hash);

    Node current = bucket[index];

    while (current != null) {
      if (current.key.equals(key)) {
        return current.value;
      }
      if (current.next != null) {
        current = current.next;
      } else {
        break;
      }
    }
    return null;
  }

  private class Node {

    private Lodger key;
    private Apartment value;
    private Node next;

    public Node(Lodger key, Apartment value, Node next) {
      this.key = key;
      this.value = value;
      this.next = next;
    }
  }


}
