public class Pasenger {
  private String name;
  private String surname;
  private Ticket ownTicket;
  private int ownMoney;



  public int getOwnMoney() {
    return ownMoney;
  }

  public Pasenger(String name, String surname, int ownMoney) {
    this.name = name;
    this.surname = surname;
    this.ownMoney = ownMoney;
    ownTicket = null;
  }

  public void setOwnTicket(Ticket ownTicket) {
    this.ownTicket = ownTicket;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public Ticket getOwnTicket() {
    return ownTicket;
  }
}
