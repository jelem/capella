package com.hillel.jdbc;

public class Customer {

  private String name;
  private int bookId;

  public Customer(String name, int bookId) {
    this.name = name;
    this.bookId = bookId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBookId() {
    return bookId;
  }

  public void setBookId(int bookId) {
    this.bookId = bookId;
  }
}
