package ua.pp.darknsoft;

public interface CustomList<Item> {

  int size();

  boolean isEmpty();

  boolean contains(Item element);

  void add(Item element);

  void add(int index, Item element);

  boolean remove(Item element);

  Item remove(int index);

  void clear();

  Item get(int index);

  void set(int index, Item element);

  int indexOf(Item element);

}
