package com.hillel.hotel;

public class CustomHashMap {

  private Node[] guests;
  private static final int size = 26;

  CustomHashMap() {
    guests = new Node[size];
  }

  public void put(Visitor key, Apartments value) {
    Node node = new Node(key, value, null);
    int index = key.hashCode();

    if (guests[index] == null) {
      guests[index] = node;
      return;
    }

    Node current = guests[index];
    while (current.next != null) {
      if (current.key.equals(key)) {
        current.value = value;
      }
      current = current.next;
    }
    current.next = node;
  }

  public Node get(Visitor key) {
    int index = key.hashCode();
    Node result = guests[index];

    if (result.next == null) {
      return result;
    }

    Node current = guests[index];
    while (!current.key.equals(key)) {
      current = current.next;
    }
    return current;
  }

  public void getInformation(Visitor visitor) {
    System.out.println(visitor.toString());
    Node node = get(visitor);
    Apartments apartments = node.value;
    System.out.println(apartments.toString());
    System.out.println();
  }

  private static class Node {

    private Visitor key;
    private Apartments value;
    private Node next;

    Node(Visitor key, Apartments value, Node next) {
      this.key = key;
      this.value = value;
      this.next = next;
    }
  }

}
