package ua.pp.darknsoft;

import java.util.Iterator;

public interface CustomList<T> extends Iterable<T> {

  int size();

  boolean isEmpty();

  boolean contains(T element);

  void add(T element);

  void add(int index, T element);


  boolean remove(T element);

  T remove(int index);

  void clear();

  T get(int index);

  void set(int index, T element);

  int indexOf(T element);

  Iterator<T> backwardIterator();

}
