package second;

import java.util.ArrayList;

public class University {

  private Department rectorat;
  private ArrayList<Department> proRectorats;
  private ArrayList<Department> facultyes;
  private ArrayList<Department> cafedras;

  public University(String name) {
    rectorat = new Department(name);
    proRectorats = new ArrayList<>();
    facultyes = new ArrayList<>();
    cafedras = new ArrayList<>();
  }

  public void addPro(String name) {
    proRectorats.add(new Department(name, null, rectorat));
  }

  public void addFac(String name, String parentName) {
    Department current = new Department(name);
    facultyes.add(current);
    for (Department department : proRectorats) {

      if (department.getName().equals(parentName)) {
        department.setChild(current);
        current.setPerent(department);
        break;
      }
    }
  }

  public void addCaf(String name, String parentName) {
    Department current = new Department(name);
    cafedras.add(current);
    for (Department department : facultyes) {

      if (department.getName().equals(parentName)) {
        department.setChild(current);
        current.setPerent(department);
        break;
      }
    }
  }

  public void generalTraverse() {
    System.out.println(rectorat);
    System.out.println("* * * * * * * *");

    for (Department pro : proRectorats) {
      System.out.println(pro + " -> " + pro.getPerent() + " * ");
    }

    System.out.println("* * * * * * * *");

    for (Department fac : facultyes) {
      System.out.println(fac + " -> " + fac.getPerent() + " * ");
    }

    System.out.println("* * * * * * * *");

    for (Department caf : cafedras) {
      System.out.println(caf + " -> " + caf.getPerent() + " * ");
    }

    System.out.println("* * * * * * * *");

    System.out.println();
  }
}
