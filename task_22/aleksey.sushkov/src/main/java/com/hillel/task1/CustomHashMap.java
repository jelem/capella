package com.hillel.task1;

public class CustomHashMap {

  private Node[] customers;
  private final static int SIZE = 26;

  public CustomHashMap() {
    customers = new Node[SIZE];
  }


  public void put(Guest key, Appartments value) {
    Node node = new Node(key, value, null);
    int hashCode = key.hashCode();
    int index = calculateIndex(hashCode);

    if (customers[index] == null) {
      customers[index] = node;
      return;
    }

    Node current = customers[index];
    while (current != null) {
      if (current.key.equals(key)) {
        current.value = value;
        return;
      }
      current = current.next;
    }

    customers[index] = node;
  }

  private int calculateIndex(int hashCode) {
    return Math.abs(hashCode) % SIZE;
  }

  public Appartments get(Guest key) {
    int hashCode = key.hashCode();
    int index = calculateIndex(hashCode);

    Node node = customers[index];

    while (node != null) {
      if (node.key.equals(key)) {
        return node.value;
      }
      node = node.next;
    }
    return null;
  }

  public void dataBase(Guest guest) {
    System.out.println(guest.toString());
    Appartments app = get(guest);
    System.out.println(app.toString() + "\n");
  }

  private class Node {
    private Guest key;
    private Appartments value;
    private Node next;

    public Node(Guest key, Appartments value, Node next) {
      this.key = key;
      this.value = value;
      this.next = next;
    }
  }
}
