import java.util.Arrays;
import java.util.Objects;

public class Express {
  public static final int VAGONSPLACES = 36;

  private int quantiyOfVagones;
  private int quantityOfFreeTickets;
  private Ticket[][] tickets;
  private String fromTo;

  public String getFromTo() {
    return fromTo;
  }

  public Express(int quontiyOfVagones, String fromTo) throws NoNummerOfPlace {
    this.fromTo = fromTo;
    this.quantiyOfVagones = quontiyOfVagones;
    quantityOfFreeTickets = this.quantiyOfVagones * VAGONSPLACES;
    tickets = new Ticket[quantiyOfVagones][VAGONSPLACES];

    for (int i = 0; i < quantiyOfVagones; i++) {
      for (int j = 0; j < VAGONSPLACES; j++) {
        tickets[i][j] = new Ticket(i, j);
      }
    }
  }

  public int getQuantiyOfVagones() {
    return quantiyOfVagones;
  }

  public int getQuantityOfTickets() {
    return quantityOfFreeTickets;
  }

  public boolean isFull() {
    return quantityOfFreeTickets == 0;
  }

  public Ticket getTickets(int vagon, int place) throws NoNummerOfPlace {
    if (vagon < 0 || vagon >= quantiyOfVagones || place < 0 || place >= VAGONSPLACES) {
      throw new NoNummerOfPlace("not valid nummer of vagon or/and nummer of place");
    }

    return tickets[vagon][place];
  }

  public void setTickets(int vagon, int place, Pasenger pasenger) throws NoNummerOfPlace {
    if (vagon < 0 || vagon >= quantiyOfVagones || place < 0 || place >= VAGONSPLACES) {
      throw new NoNummerOfPlace("not valid nummer of vagon or/and nummer of place");
    }

    try {
      tickets[vagon][place].set(pasenger);
    } catch (NoFreePlace noFreePlace) {
      noFreePlace.printStackTrace();
    } finally {
      return;
    }
  }

  public void setFromTo(String fromTo) {
    this.fromTo = fromTo;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (!(object instanceof Express)) {
      return false;
    }
    Express express = (Express) object;
    return Objects.equals(getFromTo(), express.getFromTo());
  }

  @Override
  public int hashCode() {

    int result = Objects.hash(getQuantiyOfVagones(), quantityOfFreeTickets, getFromTo());
    result = 31 * result + Arrays.hashCode(tickets);
    return result;
  }
}
