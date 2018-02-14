package com.hillel;

import java.util.Objects;

public class Book {

  private int id;
  private String bookName;
  private String authorName;
  private int bookPrice;

  public Book(int id, String bookName, String authorName, int bookPrice) {
    this.id = id;
    this.bookName = bookName;
    this.authorName = authorName;
    this.bookPrice = bookPrice;
  }

  public int getId() {
    return id;
  }

  public String getBookName() {
    return bookName;
  }

  public String getAuthorName() {
    return authorName;
  }

  public int getBookPrice() {
    return bookPrice;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Book book = (Book) object;
    return id == book.id
        && bookPrice == book.bookPrice
        && Objects.equals(bookName, book.bookName)
        && Objects.equals(authorName, book.authorName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "Book{" + "id=" + id
        + ", bookName='" + bookName + '\''
        + ", authorName='" + authorName + '\''
        + ", bookPrice=" + bookPrice + '}';
  }
}