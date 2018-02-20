package com.hillel;

public interface CustomList {

  int size();
  
  boolean isEmpty();
  
  boolean contains(String element);
  
  void add(String element);
  
  void add(int index, String element);
  
  boolean remove(String element);
  
  void clear();
  
  String get(int index);
  
  void set(int index, String element);
  
  int indexOf(String element);

}
