package com.hillel.univer;

import java.util.ArrayList;
import java.util.List;

public class Prorectorat extends Department {

  List<Department> prorectList = new ArrayList<>();
  Department parent;

  public Prorectorat(List<Department> prorectList, Department parent) {
    this.prorectList = prorectList;
    this.parent = parent;
  }

  @Override
  public String toString() {
    return "Prorectorat{"
        + "prorectList=" + prorectList
        + ", parent=" + parent
        + '}';
  }
}

