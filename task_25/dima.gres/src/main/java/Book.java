import java.util.Objects;

public class Book {

  private int id;
  private int authorId;
  private String name;
  private double price;

  public Book(int id, int authorId, String name, double price) {
    this.id = id;
    this.authorId = authorId;
    this.name = name;
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAuthorId() {
    return authorId;
  }

  public void setAuthorId(int authorId) {
    this.authorId = authorId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (!(object instanceof Book)) {
      return false;
    }

    Book book = (Book) object;

    return getId() == book.getId()
        && getAuthorId() == book.getAuthorId()
        && Double.compare(book.getPrice(), getPrice()) == 0
        && Objects.equals(getName(), book.getName());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getId(), getAuthorId(), getName(), getPrice());
  }
}
