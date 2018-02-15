package ua.pp.darknsoft.util;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

public class ObjectsTransferToXML<E> {


  private BufferedWriter bufferedWriter;
  private String path;
  private String pathToFile;
  private E obj;
  private List<E> list;
  private String start;
  private String stop;


  public ObjectsTransferToXML(String path, E obj) {
    this.path = path;
    this.obj = obj;
    this.list = Collections.emptyList();
    pathToFile =
        path + "\\" + obj.getClass().getSimpleName() + "@" + Integer
            .toHexString(list.hashCode())
            + ".xml";
    start = "<" + obj.getClass().getSimpleName() + "s>";
    stop = "</" + obj.getClass().getSimpleName() + "s>";
  }

  public ObjectsTransferToXML(String path, List<E> list) {
    this.path = path;
    if (list == null) {
      this.list = Collections.emptyList();
      this.pathToFile = path + "\\empty.xml";
      start = "<OBJECTS>";
      stop = "</OBJECTS>";
    } else {
      this.list = list;
      if (!list.isEmpty()) {
        pathToFile =
            path + "\\" + list.get(0).getClass().getSimpleName() + "s@" + Integer
                .toHexString(list.hashCode())
                + ".xml";
        start = "<" + list.get(0).getClass().getSimpleName() + "s>";
        stop = "</" + list.get(0).getClass().getSimpleName() + "s>";
      } else {
        this.pathToFile = path + "\\empty.xml";
        start = "<" + list.get(0).getClass().getSimpleName() + "s>";
        stop = "</" + list.get(0).getClass().getSimpleName() + "s>";
      }
    }
  }

  public void transfer() {
    try {
      bufferedWriter = new BufferedWriter(
          new OutputStreamWriter(new FileOutputStream(pathToFile), "UTF-8"));
      bufferedWriter.write(start);
      bufferedWriter.newLine();
      if (!list.isEmpty()) {
        for (E item : list) {
          bufferedWriter.write(createObjectLine(item));
        }
      } else {
        if (obj != null) {
          bufferedWriter.write(createObjectLine(obj));
        }
      }
      bufferedWriter.write(stop);
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

  private String createObjectLine(E obj) {
    StringBuilder line = new StringBuilder();
    line.append(
        "\t<" + obj.getClass().getSimpleName() + ">" + System.getProperty("line.separator"));
    for (Field field : obj.getClass().getDeclaredFields()) {
      line.append("\t\t<" + field.getName() + ">");
      try {
        field.setAccessible(true);
        line.append(field.get(obj));
        field.setAccessible(false);
      } catch (IllegalAccessException ex) {
        ex.printStackTrace();
      }
      line.append("</" + field.getName() + ">" + System.getProperty("line.separator"));
    }
    line.append(
        "\t</" + obj.getClass().getSimpleName() + ">" + System.getProperty("line.separator"));
    return line.toString();
  }
}
