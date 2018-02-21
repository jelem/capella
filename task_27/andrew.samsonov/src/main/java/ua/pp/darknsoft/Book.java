package ua.pp.darknsoft;

public class Book {

  private String name;
  private String authorName;
  private boolean available;
  private int price;

  public Book(String name, String authorName, boolean available, int price) {
    this.name = name;
    this.authorName = authorName;
    this.available = available;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getAuthorName() {
    return authorName;
  }

  public boolean isAvailable() {
    return available;
  }

  public int getPrice() {
    return price;
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

    if (available != book.available) {
      return false;
    }
    if (price != book.price) {
      return false;
    }
    if (!name.equals(book.name)) {
      return false;
    }
    return authorName.equals(book.authorName);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + authorName.hashCode();
    result = 31 * result + (available ? 1 : 0);
    result = 31 * result + price;
    return result;
  }

  @Override
  public String toString() {
    return "Book{"
        + "name='" + name + '\''
        + ", authorName='" + authorName + '\''
        + ", available=" + available
        + ", price=" + price
        + '}';
  }
}
