import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Pasenger lev = new Pasenger("Lev", "Durov", 500);
    Pasenger max = new Pasenger("Max", "Ceban", 700);

    try {
      RailwayStation railwayStation = new RailwayStation();
      Express toKyiv = new Express(1, "Odessa to Kyiv");
      Express toLviv = new Express(1, "Odessa to Lviv");

      railwayStation.add(toKyiv);
      railwayStation.add(toLviv);

      lev.byTicket(toKyiv, 0, 7, OdessaKyiv.KOTOWSK.getCost());
      max.byTicket(toLviv,0, 12,OdessaLviv.TERNOPYL.getCost());

      System.out.println(lev);
      System.out.println(max);

    } catch (NoNummerOfPlace | NoFreePlace | NoMoney noNummerOfPlace) {
      noNummerOfPlace.printStackTrace();
    } finally {
      System.out.println("end of programm.");
    }
  }
}
