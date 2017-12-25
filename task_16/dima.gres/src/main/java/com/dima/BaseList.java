package com.dima;

public interface BaseList {
  public static final int SIZE = 9;
  void fill(char[][] array);
  
  public static int createRandom(int maxBorder) {
    return (int) Math.floor(Math.random() * maxBorder);
  }

  int createRandom();

  int get(int index);

  void set(int index, int value);

  void initializeArray();

  int binarySearch(int num);

  void removeToIndex(int index);

  int getLen();

  int getSize();

  void setSize(int size);
  
  void setLen(int len);

  void copyIntArrToBuffer(int[] buffer);
}
