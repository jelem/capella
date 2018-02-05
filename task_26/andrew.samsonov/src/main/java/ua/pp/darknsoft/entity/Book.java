package ua.pp.darknsoft.entity;

import java.math.BigDecimal;

/**
 * Created by Andrew on 05.02.2018.
 */
public class Book {

  private int id;
  private String name;
  private int authorId;
  private BigDecimal price;

  public Book(int id, String name, int authorId, BigDecimal price) {
    this.id = id;
    this.name = name;
    this.authorId = authorId;
    this.price = price;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Book)) {
      return false;
    }

    Book book = (Book) obj;

    if (id != book.id) {
      return false;
    }
    if (authorId != book.authorId) {
      return false;
    }
    if (!name.equals(book.name)) {
      return false;
    }
    return price != null ? price.equals(book.price) : book.price == null;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + name.hashCode();
    result = 31 * result + authorId;
    result = 31 * result + (price != null ? price.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Book{"
        + "id=" + id
        + ", name='" + name + '\''
        + ", authorId=" + authorId
        + ", price=" + price
        + '}';
  }
}
