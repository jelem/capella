package ua.pp.darknsoft.entity;

public class Purchase {

  private int id;
  private int bookId;
  private int consumerId;

  public Purchase(int id, int bookId, int consumerId) {
    this.id = id;
    this.bookId = bookId;
    this.consumerId = consumerId;
  }

  public int getId() {
    return id;
  }

  public int getBookId() {
    return bookId;
  }

  public int getConsumerId() {
    return consumerId;
  }
}
