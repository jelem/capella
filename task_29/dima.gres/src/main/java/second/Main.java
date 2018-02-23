package second;


public class Main {

  public static void main(String[] args) {
    University university = new University("Rectorat");

    university.addPro(ProList.CCC.getName());
    university.addPro(ProList.CPP.getName());
    university.addPro(ProList.JAVA.getName());
    university.addPro(ProList.PYTHON.getName());

    university.addFac(FacList.ALGORTHEORY.getName(), ProList.CCC.getName());
    university.addFac(FacList.DESCRETMATH.getName(), ProList.CCC.getName());
    university.addFac(FacList.SYSTEMPROG.getName(), ProList.CCC.getName());

    university.addFac(FacList.GAMEDEV.getName(), ProList.CPP.getName());

    university.addFac(FacList.BACKENDDEV.getName(), ProList.JAVA.getName());
    university.addFac(FacList.SYSTEMARCHYTECH.getName(), ProList.JAVA.getName());

    university.addCaf(Cafedras.GRAPHICS.getName(), FacList.GAMEDEV.getName());
    university.addCaf(Cafedras.PHYLOSOPHY.getName(), FacList.GAMEDEV.getName());

    university.addCaf(Cafedras.ENGLISH.getName(), FacList.SYSTEMARCHYTECH.getName());
    university.addCaf(Cafedras.DEUTSCH.getName(), FacList.SYSTEMARCHYTECH.getName());

    university.addCaf(Cafedras.ADMIN.getName(), FacList.BACKENDDEV.getName());

    university.addCaf(Cafedras.ALGEBRA.getName(), FacList.DESCRETMATH.getName());
    university.addCaf(Cafedras.PHISIC.getName(), FacList.DESCRETMATH.getName());
    university.addCaf(Cafedras.SPORT.getName(), FacList.DESCRETMATH.getName());

    university.generalTraverse();

    
  }
}
