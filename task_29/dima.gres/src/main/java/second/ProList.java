package second;

public enum ProList {

  JAVA("JAVA"),
  CPP("CPP"),
  PYTHON("PYTHON"),
  CCC("CCC"),
  PHP("PHP"),
  ;

  ProList(String name) {
    this.name = name;
  }

  private String name;

  public String getName() {
    return name;
  }
}
