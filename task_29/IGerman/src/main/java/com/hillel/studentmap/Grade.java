package com.hillel.studentmap;

public class Grade {

  private int grade;

  public Grade(int grade) {
    this.grade = grade;
  }

  @Override
  public String toString() {
    return "Grade{"
        + "grade=" + grade
        + '}';
  }
}
