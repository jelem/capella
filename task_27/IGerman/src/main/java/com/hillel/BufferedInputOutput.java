package com.hillel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Properties;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class BufferedInputOutput {

  public static void main(String[] args) {
    Properties properties = new Properties();
    String file = null;
    try {
      properties
          .load(BufferedInputOutput.class.getClassLoader().getResourceAsStream("properties"));

    } catch (IOException ex) {
      ex.printStackTrace();
    }
    file = properties.getProperty("in");

    BufferedInputOutput bufferedInputOutput = new BufferedInputOutput();
    ArrayList<Student> students = bufferedInputOutput.readFromFile(file);
    for (Student student : students) {
      System.out.println(student.getLastName());
      System.out.println(student.getFirstName());
      System.out.println(student.getAge());
    }

    bufferedInputOutput.outputWriterOne(students);

    bufferedInputOutput.outputWriterTwo(students);
  }

  public ArrayList<Student> readFromFile(String file) {

    ArrayList<Student> list = new ArrayList<>();

    ArrayList<String> tempList = new ArrayList<>();

    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
        new FileInputStream(file), "UTF-8"))) {
      while (bufferedReader.ready()) {

        String[] tempAr = bufferedReader.readLine().trim().split(" ");

        if (tempAr.length > 1) {
          tempList.add(tempAr[1]);
        }
      }
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    String lastName = null;
    String firstName = null;
    int age = 0;

    for (int i = 0; i < tempList.size(); i = i + 3) {

      lastName = tempList.get(i);
      firstName = tempList.get(i + 1);
      age = Integer.parseInt(tempList.get(i + 2));

      list.add(new Student(lastName, firstName, age));
    }
    return list;
  }

  public void outputWriterOne(ArrayList<Student> students) {
    Properties properties = new Properties();
    String file = null;
    try {
      properties
          .load(BufferedInputOutput.class.getClassLoader().getResourceAsStream("properties"));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    file = properties.getProperty("out1");
    BufferedWriter bufferedWriter = null;

    StringBuilder stringBuilder = new StringBuilder();

    stringBuilder.append("<students>");
    for (Student student : students) {
      stringBuilder.append(System.lineSeparator());
      stringBuilder.append("<student>");
      stringBuilder.append(System.lineSeparator());
      stringBuilder.append("<lastname>");
      stringBuilder.append(student.getLastName());
      stringBuilder.append("</lastname>");
      stringBuilder.append(System.lineSeparator());
      stringBuilder.append("<firstname>");
      stringBuilder.append(student.getFirstName());
      stringBuilder.append("</firstname>");
      stringBuilder.append(System.lineSeparator());
      stringBuilder.append("<age>");
      stringBuilder.append(String.valueOf(student.getAge()));
      stringBuilder.append("</age>");
      stringBuilder.append(System.lineSeparator());
      stringBuilder.append("</student>");
    }
    stringBuilder.append(System.lineSeparator());
    stringBuilder.append("</students>");

    try {

      bufferedWriter = new BufferedWriter(
          new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));

      bufferedWriter.write(stringBuilder.toString());

    } catch (IOException ex) {
      ex.printStackTrace();
    } finally {
      try {
        if (bufferedWriter != null) {
          bufferedWriter.flush();
          bufferedWriter.close();
        }
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
  }

  public void outputWriterTwo(ArrayList<Student> students) {

    Properties properties = new Properties();
    String file = null;
    try {
      properties
          .load(BufferedInputOutput.class.getClassLoader().getResourceAsStream("properties"));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    file = properties.getProperty("out2");
    XMLOutputFactory outputFactory;
    XMLStreamWriter streamWriter = null;
    try {
      outputFactory = XMLOutputFactory.newInstance();
      streamWriter = outputFactory
          .createXMLStreamWriter(
              (new OutputStreamWriter(new FileOutputStream(file), "UTF-8")));

      streamWriter.writeStartDocument();
      streamWriter.writeCharacters(System.lineSeparator());
      streamWriter.writeStartElement("students");
      streamWriter.writeCharacters(System.lineSeparator());

      for (Student student : students) {
        streamWriter.writeStartElement("student");
        streamWriter.writeCharacters(System.lineSeparator());

        streamWriter.writeStartElement("lastName");
        streamWriter.writeCharacters(student.getLastName());
        streamWriter.writeEndElement();
        streamWriter.writeCharacters(System.lineSeparator());

        streamWriter.writeStartElement("firstName");
        streamWriter.writeCharacters(student.getFirstName());
        streamWriter.writeEndElement();
        streamWriter.writeCharacters(System.lineSeparator());

        streamWriter.writeStartElement("age");
        streamWriter.writeCharacters(String.valueOf(student.getAge()));
        streamWriter.writeEndElement();
        streamWriter.writeCharacters(System.lineSeparator());

        streamWriter.writeEndElement();
        streamWriter.writeCharacters(System.lineSeparator());
      }
      streamWriter.writeEndElement();
      streamWriter.writeEndDocument();
      streamWriter.flush();
      streamWriter.close();

    } catch (XMLStreamException ex) {
      ex.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    } finally {
      try {
        if (streamWriter != null) {
          // streamWriter.flush();
          streamWriter.close();
        }
      } catch (XMLStreamException ex) {
        ex.printStackTrace();
      }
    }
  }
}

