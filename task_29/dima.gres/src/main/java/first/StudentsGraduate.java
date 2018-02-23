package first;

public class StudentsGraduate {

  private Node root;

  public StudentsGraduate() {
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
  }
}
