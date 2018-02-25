package second;

public enum Cafedras {

  ENGLISH("English"),
  ALGEBRA("ALGEBRA"),
  PHISIC("PHISIC"),
  PHYLOSOPHY("PHYLOSOPHY"),
  SPORT("SPORT"),
  GRAPHICS("GRAPHICS"),
  ADMIN("ADMIN"),
  DEUTSCH("DEUTSCH"),
  HISTORY("HISTORY"),

  ;

  private String name;

  public String getName() {
    return name;
  }

  Cafedras(String name) {

    this.name = name;
  }
}
