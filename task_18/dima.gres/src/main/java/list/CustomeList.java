package list;

import java.util.Iterator;

public interface CustomeList {
  int size();

  boolean isEmpty();

  boolean contains(String element);

  void add(String element);

  void add(int index, String element);

  boolean removeToElement(String element);

  String removeToIndex(int index);

  void clear();

  String get(int index);

  void set(int index, String element);

  int indexOf(String element);

  Iterator ahead();

  Iterator backward();

  Iterator random();
}
