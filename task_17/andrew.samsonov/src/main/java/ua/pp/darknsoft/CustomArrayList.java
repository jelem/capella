package ua.pp.darknsoft;

public class CustomArrayList<Item> implements CustomList<Item> {

  private Item[] array;
  private int size;
  private static final int DEFAULT_CAPACITY = 10;

  public CustomArrayList() {
    array = (Item[]) new Object[DEFAULT_CAPACITY];
  }

  public CustomArrayList(int cap) {
    array = (Item[]) new Object[cap];
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public boolean contains(Item element) {
    for (int i = 0; i < size; i++) {
      if (array[i] == element) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void add(Item element) {
    if (size >= array.length) {
      resize();
    }
    array[size++] = element;
  }

  private void resize() {
    Item[] newArray = (Item[]) new Object[array.length * 2];
    System.arraycopy(array, 0, newArray, 0, array.length);
    array = newArray;
    System.out.println("array.length: " + array.length);
  }

  @Override
  public void add(int index, Item element) {

    if (index >= size || index < 0) {
      throw new IllegalArgumentException("Wrong index");
    }
    if (size >= array.length) {
      resize();
    }
    Item[] newArray = (Item[]) new Object[array.length + 1];
    System.arraycopy(array, 0, newArray, 0, index + 1);
    newArray[index] = element;
    System.arraycopy(array, index, newArray, index + 1, array.length - index);
    array = newArray;
    size++;
  }

  @Override
  public boolean remove(Item element) {
    for (int i = 0; i < size; i++) {
      if (array[i] == element) {
        for (int j = i; j < size; j++) {
          array[j] = array[j + 1];
        }
        size--;
        return true;
      }
    }
    return false;
  }

  @Override
  public Item remove(int index) {
    if (index >= size || index < 0) {
      throw new IllegalArgumentException("Wrong index");
    }
    Item tmp = array[index];
    for (int j = index; j < size; j++) {
      array[j] = array[j + 1];
    }
    size--;
    return tmp;
  }

  @Override
  public void clear() {
    for (int i = 0; i < size; i++) {
      array[i] = null;
    }
  }

  @Override
  public Item get(int index) {
    return array[index];
  }

  @Override
  public void set(int index, Item element) {
    if (index >= size || index < 0) {
      throw new IllegalArgumentException("Wrong index");
    }
    array[index] = element;
  }

  @Override
  public int indexOf(Item element) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        return i;
      }
    }
    return -1;
  }
}
