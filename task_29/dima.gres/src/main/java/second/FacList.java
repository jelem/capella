package second;

public enum FacList {

  DESCRETMATH("DESCRET MATH"),
  GRAPHTHEORY("GRAPHT HEORY"),
  SYSTEMPROG("SYSTEM PROG"),
  BACKENDDEV("BACKEND DEV"),
  DESCTOPDEV("DESCTOP DEV"),
  GAMEDEV("GAME DEV"),
  ALGORTHEORY("ALGORYTMS THEORY"),
  SYSTEMARCHYTECH("SYSTEM ARCHYTECH")

  ;


  private String name;

  FacList(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
