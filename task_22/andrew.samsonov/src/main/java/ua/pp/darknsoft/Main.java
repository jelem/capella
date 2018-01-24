package ua.pp.darknsoft;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    HotelGuest h1 = new HotelGuest("Anderson");
    HotelGuest h2 = new HotelGuest("Andrew", "Dark");
    HotelGuest h3 = new HotelGuest("Angular");
    HotelGuest h4 = new HotelGuest("Akkerman");
    HotelGuest h5 = new HotelGuest("Doonkan");

    HotelRoom r1 = new HotelRoom(1, TypeRoom.Standart);
    HotelRoom r2 = new HotelRoom(2, TypeRoom.Standart);
    HotelRoom r3 = new HotelRoom(3, TypeRoom.Standart);
    HotelRoom r4 = new HotelRoom(4, TypeRoom.Standart);
    HotelRoom r5 = new HotelRoom(5, TypeRoom.Standart);

    CardFile cardFile = new CardFile();
    cardFile.put(h1, r1);
    cardFile.put(h2, r2);
    cardFile.put(h3, r3);
    cardFile.put(h4, r4);
    cardFile.put(h5, r5);
    System.out.println("################# Найдем информацию по постояльцу ##################");
    System.out.println(h1 + " - " + cardFile.get(h1));
    System.out.println(h2 + " - " + cardFile.get(h2));
    System.out.println(h3 + " - " + cardFile.get(h3));
    System.out.println(h4 + " - " + cardFile.get(h4));

    System.out.println("########### Просмотрим содержимое ячейки с надписью А #############");

    List<HotelGuest> list = cardFile.getCell(Cell.A);
    Collections.sort(list);
    for (HotelGuest guest : list) {
      System.out.println(guest);
    }

    System.out.println("########### Повторяющиеся символы в строке #############");
    System.out.println(hasRepeatedSymbols("hello"));


  }

  public static boolean hasRepeatedSymbols(String string) {
    Set<String> set = new TreeSet<>();
    Collections.addAll(set, string.split(""));
    return set.size() != string.length();
  }

}
