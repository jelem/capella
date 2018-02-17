import java.util.Objects;

public class Sell {

  private int id;
  private int customerId;
  private int bookId;

  public Sell(){
  }

  public Sell(int id, int customerId, int bookId) {
    this.id = id;
    this.customerId = customerId;
    this.bookId = bookId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public int getBookId() {
    return bookId;
  }

  public void setBookId(int bookId) {
    this.bookId = bookId;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (!(object instanceof Sell)) {
      return false;
    }

    Sell sell = (Sell) object;
    return getId() == sell.getId()
        && getCustomerId() == sell.getCustomerId()
        && getBookId() == sell.getBookId();
  }

  @Override
  public int hashCode() {

    return Objects.hash(getId(), getCustomerId(), getBookId());
  }

  @Override
  public String toString() {
    return "Sell{"
        + "id="
        + id
        + ", customerId="
        + customerId
        + ", bookId="
        + bookId + '}'
        ;
  }
}
