package com.hillel.breadth;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BreadthFirstTree {

  private Node root;

  public void add(Integer key, String value) {
    Node newNode = new Node(key, value);

    if (root == null) {
      root = newNode;
      return;
    }

    Node current = root;
    while (true) {
      if (current.key.equals(key)) {
        current.value = value;
        return;
      }
      if (current.key > key) {
        if (current.left == null) {
          current.left = newNode;
          return;
        }
        current = current.left;
      }

      if (current.key < key) {
        if (current.right == null) {
          current.right = newNode;
          return;
        }
        current = current.right;
      }
    }
  }

  public void traverseQueue() {
    traverseQueue(root);
  }

  public void traverseQueue(Node current) {
    Queue<Node> queue = new LinkedList<>();
    Node first;
    if (current == null) {
      return;
    } else {
      queue.add(current);
    }

    while (true) {

      if (current.left != null) {
        queue.add(current.left);
      }
      if (current.right != null) {
        queue.add(current.right);
      }
      first = queue.poll();
      System.out.println(first);
      if (queue.peek() != null) {
        current = queue.peek();
      } else {
        return;
      }
    }
  }

  public void traverseStack() {
    traverseStack(root);
  }

  public void traverseStack(Node current) {
    Stack<Node> stack = new Stack<>();
    Node last;
    if (current == null) {
      return;
    } else {
      stack.add(current);
    }

    while (true) {

      if (current.left != null) {
        stack.add(current.left);
      }
      if (current.right != null) {
        stack.add(current.right);
      }
      if (!stack.empty()) {
        last = stack.pop();
        System.out.println(last);
        if (last != root) {
          current = last;
        }
      } else {
        return;
      }
    }
  }


  private static class Node {

    Integer key;
    String value;
    Node right;
    Node left;

    public Node(Integer key, String value) {
      this.key = key;
      this.value = value;

    }

    @Override
    public String toString() {
      return "Node{"
          + "key=" + key
          + ", value='" + value + '\''
          + '}';
    }
  }
}