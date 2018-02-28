package ua.pp.darknsoft.ex01;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class CustomTreeMap {

  private Node current;
  Queue<Node> queue = new LinkedList<CustomTreeMap.Node>();
  Deque<Node> deque = new LinkedList<CustomTreeMap.Node>();

  public void add(Integer key, String value) {

    Node newNode = new Node(key, value);

    if (current == null) {
      current = newNode;
      return;
    }

    Node current = this.current;
    while (true) {
      if (current.key.equals(key)) {
        current.value = value;
        return;
      }

      if (key < current.key) {
        if (current.left == null) {
          current.left = newNode;
          return;
        }
        current = current.left;
      } else {
        if (current.right == null) {
          current.right = newNode;
          return;
        }
        current = current.right;
      }
    }
  }

  public void traverse() {
    traverseTree(current);
  }

  public void traverseHi() {
    System.out.print("Width: ");
    traverseQueue(current);
    System.out.println();
    System.out.print("Depth: ");
    traverseDeque(current);
  }

  private void traverseTree(Node current) {
    if (current == null) {
      return;
    }
    traverseTree(current.left);
    System.out.println(current.key + " - " + current.value);
    traverseTree(current.right);
  }

  private void traverseQueue(Node current) {
    if (this.current == null) {
      return;
    }

    queue.clear();
    queue.add(current);
    while (!queue.isEmpty()) {
      Node node = queue.remove();

      System.out.print("[" + node.key + " - " + node.value + "]");
      System.out.print(" ");
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
    }
  }

  private void traverseDeque(Node current) {
    if (this.current == null) {
      return;
    }

    deque.clear();
    deque.add(current);
    while (!deque.isEmpty()) {
      Node node = deque.pop();

      System.out.print("[" + node.key + " - " + node.value + "]");
      System.out.print(" ");
      if (node.left != null) {
        deque.push(node.left);
      }
      if (node.right != null) {
        deque.push(node.right);
      }
    }
  }

  private static class Node {

    private Integer key;
    private String value;

    private Node left;
    private Node right;

    public Node(Integer key, String value) {
      this.key = key;
      this.value = value;
    }
  }

}
