import java.util.NoSuchElementException;
import java.util.Objects;

public class Ticket {
  public static final int QUANTITYOFPLACE = 36;
  public static final String FREE = "free";

  private String nameOfPasenger;
  private String surnameOfPasenger;
  private int numberOfVagon;
  private int numerOfPlace;
  private boolean isEmptyPlace;

  public Ticket(int numerOfVagon, int numerOfPlace) throws NoNummerOfPlace {
    if (!isValidPlace(numerOfPlace)) {
      throw new NoNummerOfPlace("not valid nummer of place");
    }
    this.numberOfVagon = numerOfVagon;
    this.numerOfPlace = numerOfPlace;
    this.isEmptyPlace = true;
  }

  public void set(Pasenger pasenger) {
    nameOfPasenger = pasenger.getName();
    surnameOfPasenger = pasenger.getSurname();
    isEmptyPlace = false;
  }

  private boolean isValidPlace(int numerOfPlace) {
    return numerOfPlace < QUANTITYOFPLACE;
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
}
