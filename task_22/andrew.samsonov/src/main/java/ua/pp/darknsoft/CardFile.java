package ua.pp.darknsoft;


import java.util.ArrayList;
import java.util.List;

public class CardFile {

  private static final int ALPHA = 26;
  private Node[] table = (Node[]) new Node[ALPHA];

  static class Node {

    final int hash;
    final HotelGuest key;
    HotelRoom value;
    Node next;

    Node(int hash, HotelGuest key, HotelRoom value, Node next) {
      this.hash = hash;
      this.key = key;
      this.value = value;
      this.next = next;
    }
  }

  public void put(HotelGuest key, HotelRoom value) {
    int index = calculateIndex(key.hashCode());
    if (table[index] == null) {
      table[index] = new Node(key.hashCode(), key, value, null);
    } else {
      Node oldElement = null;
      for (Node element = table[index]; element != null; element = element.next) {
        oldElement = element;
        HotelGuest tempKey;
        if (element.hash == key.hashCode() && ((tempKey = element.key) == key || key
            .equals(tempKey))) {
          element.value = value;
          return;
        }
      }
      oldElement.next = new Node(key.hashCode(), key, value, null);
    }
  }

  public HotelRoom get(HotelGuest key) {
    int index = calculateIndex(key.hashCode());
    for (Node element = table[index]; element != null; element = element.next) {
      HotelGuest tempKey;
      if (element.hash == key.hashCode() && ((tempKey = element.key) == key || key
          .equals(tempKey))) {

        return element.value;
      }
    }
    return null;
  }

  public List<HotelGuest> getCell(Cell cell) {
    List<HotelGuest> list = new ArrayList<>();
    for (Node element = table[calculateIndex(cell.hashCode())]; element != null;
        element = element.next) {
      list.add(element.key);
    }
    return list;
  }

  private int calculateIndex(int key) {
    return Math.abs(key) % ALPHA;
  }
}
