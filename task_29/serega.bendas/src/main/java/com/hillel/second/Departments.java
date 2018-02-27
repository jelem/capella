package com.hillel.second;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Departments {

  private Node root;

  public Departments(Department root) {
    this.root = new Node(root);
  }

  public void add(Department department) {
    Node newNode = new Node(department);
    if (!isExists(department.getMainDepartment())) {
      throw new RuntimeException("Main department isn't in the uni");
    }
    Node mainNode = getNode(department.getMainDepartment());
    mainNode.departmentSet.add(newNode);


  }

  private Node getNode(Department department) {
    return getNodeFrom(department, root);
  }

  private Node getNodeFrom(Department department, Node root) {
    if (root.department.equals(department)) {
      return root;
    }
    for (Node node : root.departmentSet) {
      Node receivedNode = getNodeFrom(department, node);
      if (receivedNode != null) {
        return receivedNode;
      }
    }
    return null;
  }

  private boolean isExists(Department department) {
    return isIn(department, root);

  }

  private boolean isIn(Department department, Node root) {
    if (root.department.equals(department)) {
      return true;
    }
    for (Node node : root.departmentSet) {
      if (isIn(department, node)) {
        return true;
      }
    }
    return false;
  }

  public void traverseDepartments() {
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    traverseDepartments(queue);
  }

  private void traverseDepartments(Queue<Node> queue) {
    if (queue.isEmpty()) {
      return;
    }
    Node root = queue.poll();
    System.out.println(root.department);
    for (Node node : root.departmentSet) {
      if (node != null) {
        queue.add(node);
      }
    }
    traverseDepartments(queue);
  }

  public void printEmployees(String departmentName) {
    Department department = getDepartment(root, departmentName);
    if (department == null) {
      throw new RuntimeException("Department is not found");
    }
    for (Employee employee : department.getEmployees()) {
      System.out.println(employee);
    }
  }

  private Department getDepartment(Node root, String departmentName) {
    if (root.department.getName().equals(departmentName)) {
      return root.department;
    }
    for (Node node : root.departmentSet) {
      Department department = getDepartment(node, departmentName);
      if (department != null) {
        return department;
      }
    }
    return null;
  }

  public void printUpperMasters(String departmentName) {
    Department department = getDepartment(root, departmentName);
    if (department == null) {
      throw new RuntimeException("Department is not found");
    }
    while (!department.getClass().equals(Rectorate.class)) {
      department = department.getMainDepartment();
      System.out.println(department.getName() + " - " + department.getMaster());
    }
  }


  private static class Node {

    Department department;
    Set<Node> departmentSet = new HashSet<>();

    Node(Department department) {
      this.department = department;
    }
  }
}
