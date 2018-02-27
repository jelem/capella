package com.hillel.first;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CustomTreeMap {

  private Node root;
  private Queue<Node> traversingList;
  private Stack<Node> traversingStack;

  public void add(Integer key, String value) {
    Node newNode = new Node(key, value);
    if (root == null) {
      root = new Node(key, value);
      return;
    }

    Node current = root;
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
        }
        current = current.right;
      }
    }
  }

  public void traverseQueue() {
    traversingList = new LinkedList<>();
    traverseTreeQueue(root);
  }

  private void traverseTreeQueue(Node current) {
    if (current == null) {
      return;
    }
    System.out.println(current.key + " - " + current.value);
    if (current.left != null) {
      traversingList.add(current.left);
    }
    if (current.right != null) {
      traversingList.add(current.right);
    }
    if (traversingList.isEmpty()) {
      return;
    }
    traverseTreeQueue(traversingList.poll());
  }

  public void traverseStack() {
    traversingStack = new Stack<>();
    traverseTreeStack(root);
  }

  private void traverseTreeStack(Node current) {
    if (current == null) {
      return;
    }
    System.out.println(current.key + " - " + current.value);
    if (current.left != null) {
      traversingStack.push(current.left);
    }
    if (current.right != null) {
      traversingStack.push(current.right);
    }
    if (traversingStack.empty()) {
      return;
    }
    traverseTreeStack(traversingStack.pop());
  }

  private static class Node {

    private Integer key;
    private String value;

    private Node left;
    private Node right;

    Node(Integer key, String value) {
      this.key = key;
      this.value = value;
    }
  }
}
