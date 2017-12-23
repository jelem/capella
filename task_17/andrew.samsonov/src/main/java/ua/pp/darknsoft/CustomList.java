package ua.pp.darknsoft;

public interface CustomList<GeneralizeType> {

  int size();

  boolean isEmpty();

  boolean contains(GeneralizeType element);

  void add(GeneralizeType element);

  void add(int index, GeneralizeType element);


  boolean remove(GeneralizeType element);

  GeneralizeType remove(int index);

  void clear();

  GeneralizeType get(int index);

  void set(int index, GeneralizeType element);

  int indexOf(GeneralizeType element);

}
