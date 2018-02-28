package ua.pp.darknsoft.ex02;

import ua.pp.darknsoft.ex02.structure.Department;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class UniversityStructure implements ManagementOfTheUniversity {

  private Node node;

  public UniversityStructure() {

  }

  public void addDepartment(Department department, Department headDepartment) {
    if (node == null) {
      node = new Node(department);
      System.out.println("Create ROOT for: " + department.getClass().getSimpleName());
      return;
    }
    Node currentNode = node;
    Queue<Node> deque = new LinkedList<Node>();
    while (currentNode.department.getClass() != department.getClass().getSuperclass()) {
      if (currentNode.next == null) {
        System.out.println("no head");
        return;
      }

      int index = -1;
      for (int i = 0; i < currentNode.next.size(); i++) {
        deque.add(currentNode.next.get(i));
        if (currentNode.next.get(i).department.equals(headDepartment)) {
          index = i;
          break;
        }
      }
      if (index == -1) {
        currentNode = deque.poll().next.getFirst();
      } else {
        currentNode = currentNode.next.get(index);
      }
    }
    currentNode.next.add(new Node(department));

    System.out.print("Success for: " + department.getName());
    System.out.println(" Parent:" + currentNode.department.getName());

  }


  private static class Node {

    private LinkedList<Node> next;
    private Department department;

    public Node(Department department) {
      this.department = department;
      next = new LinkedList<>();
    }
  }

  public List<Department> getSubDepartments(Department department) {
    List<Department> list = new LinkedList<>();
    Node currentNode = node;
    while (currentNode.department.getClass() != department.getClass()) {
      if (currentNode.next == null) {
        System.out.println("no head");
        return Collections.emptyList();
      }
      int index = 0;
      for (int i = 0; i < currentNode.next.size(); i++) {
        if (currentNode.next.get(i).department.equals(department)) {
          index = i;
          break;
        }
      }

      if (index == -1) {
        return Collections.EMPTY_LIST;
      }
      currentNode = currentNode.next.get(index);
    }

    for (Node node : currentNode.next) {
      list.add(node.department);
    }
    return list;
  }

  @Override
  public void printAllUnit() {

  }

  @Override
  public void printEmployees(Department department) {

  }

  @Override
  public void printBoss(Department department) {

  }
}
