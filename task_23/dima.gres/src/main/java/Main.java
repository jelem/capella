import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    try {
      RailwayStation railwayStation = new RailwayStation();
      Express toKyiv = new Express(1, "Odessa to Kyiv");
      railwayStation.add(toKyiv);
      System.out.println( railwayStation.cassa(toKyiv).getTickets(0, 7) );

    } catch (NoNummerOfPlace noNummerOfPlace) {
      noNummerOfPlace.printStackTrace();
    } catch (NoExpress noExpress) {
      noExpress.printStackTrace();
    } finally {
      System.out.println("end of programm.");
    }
  }
}
