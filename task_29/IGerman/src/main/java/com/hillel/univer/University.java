package com.hillel.univer;

import java.util.ArrayList;
import java.util.List;

public class University extends Department {

  List<Department> univerList = new ArrayList<>();

  public University(List<Department> university) {
    this.univerList = university;
  }

  @Override
  public String toString() {
    return "University{"
        + "univerList=" + univerList
        + '}';
  }
}


