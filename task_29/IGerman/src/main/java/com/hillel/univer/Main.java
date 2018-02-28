package com.hillel.univer;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Department> universityList = new ArrayList<>();
    University univer = new University(universityList);

    List<Department> prorectList1 = new ArrayList<>();
    Prorectorat prorectorat1 = new Prorectorat(prorectList1, univer);

    List<Department> prorectList2 = new ArrayList<>();
    Prorectorat prorectorat2 = new Prorectorat(prorectList2, univer);

    universityList.add(prorectorat1);
    universityList.add(prorectorat2);

    List<Department> facultList1 = new ArrayList<>();
    Facultet facultet1 = new Facultet(facultList1, prorectorat1);

    List<Department> facultList2 = new ArrayList<>();
    Facultet facultet2 = new Facultet(facultList2, prorectorat1);

    List<Department> facultList3 = new ArrayList<>();
    Facultet facultet3 = new Facultet(facultList3, prorectorat1);

    prorectList1.add(facultet1);
    prorectList1.add(facultet2);
    prorectList2.add(facultet3);

    List<Department> cafedraList1 = new ArrayList<>();
    Cafedra cafedra1 = new Cafedra(cafedraList1, facultet1);

    List<Department> cafedraList2 = new ArrayList<>();
    Cafedra cafedra2 = new Cafedra(cafedraList2, facultet1);

    List<Department> cafedraList3 = new ArrayList<>();
    Cafedra cafedra3 = new Cafedra(cafedraList3, facultet1);

    facultList1.add(cafedra1);
    facultList1.add(cafedra2);
    facultList1.add(cafedra3);

    List<Department> cafedraList4 = new ArrayList<>();
    Cafedra cafedra4 = new Cafedra(cafedraList4, facultet2);

    List<Department> cafedraList5 = new ArrayList<>();
    Cafedra cafedra5 = new Cafedra(cafedraList5, facultet2);

    facultList2.add(cafedra4);
    facultList3.add(cafedra5);

    System.out.println(universityList);
    System.out.println(prorectList1);
    System.out.println(facultList1);
    System.out.println(cafedraList1);

  }

}
