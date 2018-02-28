package com.hillel.univer;

import java.util.ArrayList;
import java.util.List;

public class Cafedra extends Department {

  List<Department> cafedraList = new ArrayList<>();
  Department parent;

  public Cafedra(List<Department> cafedraList, Department parent) {
    this.cafedraList = cafedraList;
    this.parent = parent;
  }

  @Override
  public String toString() {
    return "Cafedra{"
        + "cafedraList=" + cafedraList
        + ", parent=" + parent
        + '}';
  }
}

