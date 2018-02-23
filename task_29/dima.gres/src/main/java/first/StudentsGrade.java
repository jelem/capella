package first;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StudentsGrade {

  private Node root;

  public StudentsGrade() {
    root = null;
  }

  public void add(String name, int grade) {
    Node newNode = new Node(name, grade);

    if (root == null) {
      root = newNode;
      return;
    }

    Node curent = root;

    while (true) {
      if (grade < curent.grade) {

        if (curent.left == null) {
          curent.left = newNode;
          break;
        }

        curent = curent.left;

      } else {

        if (curent.right == null) {
          curent.right = newNode;
          break;
        }

        curent = curent.right;

      }
    }
  }

  public void traversy() {
    orderTravercy(root);
  }

  private void orderTravercy(Node node) {
    if (node == null) {
      return;
    }

    if (node.left != null) {
      orderTravercy(node.left);
    }

    System.out.println(node);

    if (node.right != null) {
      orderTravercy(node.right);
    }
  }

  public void queueTraversy() {
    Queue<Node> queue = new LinkedList();

    queue.add(root);

    while (!queue.isEmpty()) {
      Node current = queue.remove();
      System.out.println(current);

      if (current.left != null) {
        queue.add(current.left);
      }

      if (current.right != null) {
        queue.add(current.right);
      }
    }
  }

  public void stackTraversy() {
    Stack<Node> stack = new Stack<>();

    stack.add(root);

    while (!stack.isEmpty()) {
      Node current = stack.pop();
      System.out.println(current);

      if (current.left != null) {
        stack.add(current.left);
      }

      if (current.right != null) {
        stack.add(current.right);
      }
    }
  }


  private static class Node {
    String name;
    int grade;

    Node left;
    Node right;

    public Node(String name, int grade) {
      this.name = name;
      this.grade = grade;
      left = right = null;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getGraduate() {
      return grade;
    }

    public void setGraduate(int grade) {
      this.grade = grade;
    }

    @Override
    public String toString() {
      return "Node{"
          + "name='"
          + name
          + '\''
          + ", grade="
          + grade
          + '}'
          ;
    }
  }
}
