package ua.pp.darknsoft;

/**
 * Created by Andrew on 22.12.2017.
 */
public class Main {

  public static void main(String[] args) {
    CustomList<String> ctm = new CustomArrayList<String>();

    ctm.add( "1");
    ctm.add( "2");
    ctm.add( "3");
    ctm.add("4");
    ctm.add("5");
    ctm.add("6");
    ctm.add("7");
    ctm.add("8");
    ctm.add("9");


    ctm.add(4,"test");
    ctm.add(5,"test");
    ctm.add(5,"test");


    for (int i = 0; i < ctm.size(); i++) {
      System.out.println(ctm.get(i));
    }
    System.out.println("size: " + ctm.size());
    System.out.println("______________________________________");
    System.out.println(ctm.remove("test"));
    for (int i = 0; i < ctm.size(); i++) {
      System.out.println(ctm.get(i));
    }
    System.out.println("size: " + ctm.size());
  }

}
