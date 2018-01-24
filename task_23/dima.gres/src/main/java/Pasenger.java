public class Pasenger {
  private String name;
  private String surname;
  private Ticket ownTicket;

  public Pasenger(String name, String surname) {
    this.name = name;
    this.surname = surname;
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
