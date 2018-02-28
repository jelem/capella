package com.hillel.univer;

import java.util.ArrayList;
import java.util.List;

public class Facultet extends Department {

  List<Department> facultList = new ArrayList<>();
  Department parent;

  public Facultet(List<Department> facultList, Department parent) {
    this.facultList = facultList;
    this.parent = parent;
  }

  @Override
  public String toString() {
    return "Facultet{"
        + "facultList=" + facultList
        + ", parent=" + parent
        + '}';
  }
}

