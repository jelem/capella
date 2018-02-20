package ua.pp.darknsoft;

import ua.pp.darknsoft.util.LoadStudentsFromFileToList;
import ua.pp.darknsoft.util.ObjectsTransferToXML;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    String path = "D:\\JavaProject\\JavaRush\\capella\\task_27\\andrew.samsonov\\src\\main\\resources\\files";

    System.out.println(LoadStudentsFromFileToList.getStudents(path + "\\Studentslist.txt"));

    Student student1 = new Student("Alik", "Bolduin", 25);
    Student student2 = new Student("Serhio", "Cornandes", 43);
    Student student3 = new Student("Paulino", "Johnson", 38);
    List<Student> studentList = new ArrayList<Student>();
    studentList.add(student1);
    studentList.add(student2);
    studentList.add(student3);

    ObjectsTransferToXML transferToXML0 = new ObjectsTransferToXML(path, studentList);
    transferToXML0.transfer();

    ObjectsTransferToXML transferToXML1 = new ObjectsTransferToXML(path, student3);
    transferToXML1.transfer();

    Book book1 = new Book("Old warriors", "Sandro Kun Jr", true, 324);
    Book book2 = new Book("New story", "Olgerd Stunword", false, 728);
    List<Book> bookList = new ArrayList<Book>();
    bookList.add(book1);
    bookList.add(book2);

    ObjectsTransferToXML transferToXML2 = new ObjectsTransferToXML(path, bookList);
    transferToXML2.transfer();

    ObjectsTransferToXML transferToXML3 = new ObjectsTransferToXML(path, book1);
    transferToXML3.transfer();
  }

}
