package ua.pp.darknsoft.ex01;

public class Main {

  public static void main(String[] args) {
    CustomTreeMap ctm = new CustomTreeMap();
    ctm.add(1, "One");
    ctm.add(5, "Five");
    ctm.add(2, "Two");
    ctm.add(3, "Three");
    ctm.add(6, "Six");
    ctm.add(-1, "minOne");
    ctm.add(0, "ZERO");
    ctm.traverseHi();
  }

}
