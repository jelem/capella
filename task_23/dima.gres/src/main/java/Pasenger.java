public class Pasenger {
  private String name;
  private String surname;
  private Ticket ownTicket;
  private int ownMoney;

  void byTicket(Express express, int vagon, int place, int cost) throws NoNummerOfPlace, NoMoney, NoFreePlace {
    Ticket ticket = express.getTickets(vagon, place);
    express.setTickets(vagon, place, this , cost);

    byTicket(ticket, cost);
  }

  void byTicket(Ticket ticket, int cost) throws NoMoney, NoFreePlace, NoNummerOfPlace {
    if (ownMoney < cost) {
      throw new NoMoney("Not enougth money");
    }

    ownMoney -= cost;
    ownTicket = new Ticket(ticket.getNumberOfVagon(), ticket.getNumerOfPlace());
    ownTicket.set(this, cost);
    ownTicket.setCost(ticket.getCost());
  }

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

  @Override
  public String toString() {
    return "Pasenger{"
        + "name='"
        + name
        + '\''
        + ", surname='"
        + surname
        + '\''
        + "\n, ownTicket="
        + ownTicket
        + "\n, ownMoney="
        + ownMoney
        + '}';
  }
}
