package ua.pp.darknsoft;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomLinkedList<T> implements Iterable<T> {

  private Node<T> firstElement;
  private Node<T> lastElement;

  public void add(T element) {
    Node<T> localNode = new Node(element, null);
    if (firstElement == null) {
      firstElement = lastElement = localNode;
    } else {
      lastElement.next = localNode;
      lastElement = localNode;
    }
  }

  public T poll() {
    Node<T> localNode = firstElement;
    firstElement = firstElement.next;
    return localNode.item;
  }

  public T peek() {
    return firstElement.item;
  }

  public T get(int index) {
    return getNode(index).item;
  }

  private Node<T> getNode(int index) {
    Node<T> localNode = firstElement;
    int count = 0;

    while (count < index) {
      localNode = localNode.next;
      count++;
      if (localNode == null) {
        throw new NoSuchElementException("No Such Element");
      }
    }
    return localNode;
  }

  public void introduceCycle(int index) {
    //зациклите список в этом методе
    lastElement.next = getNode(index);
  }

  public boolean hasCycle() {
    //этот метод должен определить есть ли цикл в списке
    return lastElement.next != null;
  }

  public Iterator<T> iterator() {
    return new Listerator();
  }

  private static class Node<T> {

    T item;
    Node<T> next;

    Node(T element, Node next) {
      this.item = element;
      this.next = next;
    }
  }

  private class Listerator implements Iterator<T> {

    private Node<T> next;

    public Listerator() {
      this.next = firstElement;
    }

    public boolean hasNext() {
      return next != null;
    }

    public T next() {
      if (!hasNext()) {
        throw new NoSuchElementException("Listerator say: No Such Element");
      }
      T element = next.item;
      next = next.next;
      return element;
    }
  }
}






