import java.util.NoSuchElementException;
import java.util.Objects;

public class Ticket {
  public static final String FREE = "free";

  private String nameOfPasenger;
  private String surnameOfPasenger;
  private int numberOfVagon;
  private int numerOfPlace;
  private boolean isEmptyPlace;
  private int cost;

  public int getCost() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  private Ticket() {
    System.out.println("Ticket");
  }

  public Ticket(int numerOfVagon, int numerOfPlace) throws NoNummerOfPlace {
    if (!isValidPlace(numerOfPlace)) {
      throw new NoNummerOfPlace("not valid nummer of place");
    }

    this.numberOfVagon = numerOfVagon;
    this.numerOfPlace = numerOfPlace;
    this.isEmptyPlace = true;
  }

  public void set(Pasenger pasenger, int cost) throws NoFreePlace {
    if (!isEmptyPlace) {
      throw new NoFreePlace("This place is bussy.");
    }
    nameOfPasenger = pasenger.getName();
    surnameOfPasenger = pasenger.getSurname();
    this.cost = cost;
    isEmptyPlace = false;
  }

  private boolean isValidPlace(int numerOfPlace) {
    return numerOfPlace < Express.VAGONSPLACES;
  }

  public String getNameOfPasenger() {
    return nameOfPasenger;
  }

  public String getSurnameOfPasenger() {
    return surnameOfPasenger;
  }

  public int getNumberOfVagon() {
    return numberOfVagon;
  }

  public int getNumerOfPlace() {
    return numerOfPlace;
  }

  public boolean isEmptyPlace() {
    return isEmptyPlace;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }

    if (!(object instanceof Ticket)) {
      return false;
    }
    
    Ticket ticket = (Ticket) object;
    return getNumberOfVagon() == ticket.getNumberOfVagon()
        && getNumerOfPlace() == ticket.getNumerOfPlace()
        && isEmptyPlace() == ticket.isEmptyPlace()
        && Objects.equals(getNameOfPasenger(), ticket.getNameOfPasenger())
        && Objects.equals(getSurnameOfPasenger(), ticket.getSurnameOfPasenger());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getNameOfPasenger(),
        getSurnameOfPasenger(),
        getNumberOfVagon(),
        getNumerOfPlace(),
        isEmptyPlace());
  }

  @Override
  public String toString() {
    return "Ticket{"
        + "nameOfPasenger = '"
        + nameOfPasenger
        + '\''
        + ", surnameOfPasenger = '"
        + surnameOfPasenger
        + '\''
        + ", numberOfVagon = "
        + numberOfVagon
        + ", numerOfPlace = "
        + numerOfPlace
        + ", cost = "
        + cost
        + ", isEmptyPlace = "
        + isEmptyPlace
        + '}';
  }
}
