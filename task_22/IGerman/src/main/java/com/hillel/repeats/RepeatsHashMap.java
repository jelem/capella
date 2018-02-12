package com.hillel.repeats;

public class RepeatsHashMap {

  private Node[] charNodes;
  private static final int size = 58;


  public boolean getRepeats(String string) {

    char[] arrayLetters = string.toCharArray();
    charNodes = new Node[size];

    put(arrayLetters);

    for (Node node : charNodes) {
      if (node != null && node.value > 1) {
        return true;
      }
    }
    return false;
  }

  private void put(char[] arrayLetters) {
    for (char letter : arrayLetters) {
      Node node = new Node(letter, 1);
      int index = (int) node.key - 65;

      if (charNodes[index] == null) {
        charNodes[index] = node;
      } else {
        charNodes[index].value++;
      }
    }
  }


  private static class Node {

    char key;
    int value;


    Node(char key, int value) {
      this.key = key;
      this.value = value;

    }
  }
}
