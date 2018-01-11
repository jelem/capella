
1. Реализуйте все методы CustomLinkedList, который мы не закончили в классе.  
Желательно реализовать всё с нуля. Также реализуйте метод, который должен определить  
есть ли цикл в вашем списке.
```java
public class CustomLinkedList implements Iterable {
  
  private Node first;
  
  public void add(int element) {
  }
  
  public int poll() {
  }
  
  public int peek() {
  }
  
  public int get(int index) {
  }
  
  public void introduceCycle(int index) {
    //зациклите список в этом методе
  }
  
  public boolean hasCycle() {
    //этот метод должен определить есть ли цикл в списке
  }
  
  //добавьте итератор
  
  private class Node {
    int value;
    Node next;
    
    Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
}
```

Пример из класса:  
https://github.com/parkhomenko/capella/blob/master/lesson19/src/main/java/com/hillel/CustomLinkedList.java