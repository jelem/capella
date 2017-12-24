package com.dima;

import java.util.NoSuchElementException;

public class EasyList implements BaseList {

  private int size;
  private int len;
  private int[] array;

  public EasyList() {
    len = SIZE;
    size = SIZE;
    array = new int[size];
    initializeArray();
  }

  @Override
  public void fill(char[][] array) {
    for (int i = 0, k = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (array[i][j] != ' ' && binarySearch(k) != -1) {
          int index = binarySearch(k);
          removeToIndex(index);
        }
        k++;
      }
    }
  }

  @Override
  public int createRandom() {
    return BaseList.createRandom(len);
  }

  @Override
  public int get(int index) {
    if (index >= len || index < 0) {
      throw new NoSuchElementException("Not Find Element...");
    }
    return array[index];
  }

  @Override
  public void set(int index, int value) {
    if (index < 0 || index >= size) {
      return;
    }
    array[index] = value;
  }

  @Override
  public void initializeArray() {
    for (int i = 0; i < size; i++) {
      array[i] = i;
    }
  }

  @Override
  public int binarySearch(int num) {
    int left = 0;
    int right = len - 1;
    int middle = 0;

    if (array[left] > num || array[right] < num) {
      return -1;
    }

    while (left < right) {
      middle = (left + right) / 2;
      if (array[left] == num) {
        return left;
      } else if (array[middle] == num) {
        return middle;
      } else if (array[right] == num) {
        return right;
      } else if (array[middle] > num) {
        right = middle - 1;
      } else {
        left = middle + 1;
      }
    }
    return -1;
  }

  @Override
  public void removeToIndex(int index) {
    if (index >= len || index < 0) {
      throw new NoSuchElementException("Not Find Element with index\t [" + index + "]");
    }
    len--;
    for (int i = index; i < len; i++) {
      array[i] = array[i + 1];
    }
  }

  @Override
  public int getLen() {
    return len;
  }

  @Override
  public int[] getArray() {
    return array;
  }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  public void setSize(int size) {
    this.size = size;
  }

  @Override
  public void setLen(int len) {
    this.len = len;
  }
}
