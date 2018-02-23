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

  public void printAllSubordinates(String name) {
    if (rectorat.getName().equals(name)) {
      generalTraverse();
      return;
    }

    if (isProExist(name)) {
      Department department = getDepatment(name);

      for (Department fac : facultyes) {
        if (fac.getPerent() == department) {
          System.out.println(fac);
          printFacCafedras(fac);
        }
      }
    }

    if (isFacExist(name)) {
      printFacCafedras(getDepatment(name));
      return;
    }

    System.out.println("No subortinations");
  }

  private boolean isProExist(String name) {

    for (Department pro : proRectorats) {
      if (pro.getName().equals(name)) {
        return true;
      }
    }

    return false;
  }

  private boolean isFacExist(String name) {

    for (Department fac : facultyes) {
      if (fac.getName().equals(name)) {
        return true;
      }
    }

    return false;
  }

  private boolean isCafExist(String name) {

    for (Department caf : cafedras) {
      if (caf.getName().equals(name)) {
        return true;
      }
    }

    return false;
  }

  private void printFacCafedras(Department fac) {

    System.out.print("cafedra: ");

    for (Department caf : cafedras) {
      if (caf.getPerent() == fac) {
        System.out.print(caf + "...");
      }
    }

    System.out.println();
  }

  private Department getDepatment(String name) {
    if (rectorat.getName().equals(name)) {
      return rectorat;
    }

    if (isProExist(name)) {
      for (Department pro : proRectorats) {
        if (pro.getName().equals(name)) {
          return pro;
        }
      }
    }

    if (isFacExist(name)) {
      for (Department fac : facultyes) {
        if (fac.getName().equals(name)) {
          return fac;
        }
      }
    }

    if (isCafExist(name)) {
      for (Department caf : cafedras) {
        if (caf.getName().equals(name)) {
          return caf;
        }
      }
    }

    return null;
  }
}
