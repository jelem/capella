package com.dima.home.data;

public class WrapperOfArray {
  private int[] array;

  public WrapperOfArray() {
    this.array = null;
  }

  public void setAray(int size) {
    this.array  = new int[size];
  }

  public void InitializeOrder(){
    for (int i = 0; i < this.array.length; i++){
      array[i] = i + 1;
    }
  }

  public void InitializeRandom(int from, int to){
    if (from > to){
      from = from ^ to;
      to = from ^ to;
      from = from ^ to;
    }
    int amplitude = Math.abs(from-to);
    for (int i = 0; i < this.array.length; i++){
      array[i] = from + (int)Math.round( (Math.random() * amplitude) );
    }
  }

  public void InitializeRandom(){
    for (int i = 0; i < this.array.length; i++){
      array[i] = (int)Math.round( (Math.random() * this.array.length) );
    }
  }

  public void InitializeReverse(){
    for (int i = 0; i < this.array.length; i++){
      array[i] = this.array.length - i;
    }
  }

  public void shomArray(){
    for (int i = 0; i < this.array.length; i++){
      System.out.print(array[i] + " ");
      if ((i+1) % 10 == 0){
        System.out.println();
      }
    }
    System.out.println(".................................................");
  }

  public void shomArray(int size){
    for (int i = 0; i < this.array.length && i < size; i++){
      System.out.print(array[i] + " ");
      if ((i+1) % 10 == 0){
        System.out.println();
      }
    }
    System.out.println(".................................................");
  }

  public void showElemDivToNum(int num){
    int j = 0;
    for (int i = 0; i < this.array.length; i++){
      if (array[i] % num == 0){
        System.out.print(array[i] + " ");
        j++;
      }

      if (j % 10 == 0 && j != 0){
        System.out.println();
      }
    }
    System.out.println(".................................................");
  }

  public void showEvenElem(){
    int j = 0;
    for (int i = 0; i < this.array.length; i++){
      if (i % 2 == 0){
        System.out.print(array[i] + " ");
      }

      if ((j+1) % 10 == 0){
        System.out.println();
      }
    }
    System.out.println(".................................................");
  }

  public int summ(){
    int sum = 0;
    for (int i = 0; i < array.length; i++){
      sum += array[i];
    }
    return sum;
  }

  public double average(){
    return 1.* summ() / array.length;
  }

  public int min(){
    int min = 0;
    for (int i = 1; i < array.length; i++){
      if (array[i] < array[min]){
        min = i;
      }
    }
    return array[min];
  }

  public int max(){
    int max = 0;
    for (int i = 1; i < array.length; i++){
      if (array[i] > array[max]){
        max = i;
      }
    }
    return array[max];
  }

  public long productOfOddElem(){
    long product = 1;
    for (int i = 0; i < array.length; i++){
      if (i % 2 == 1){
        product *= array[i];
      }
    }
    return product;
  }

  public int indexOfElemEqualTo(int value){
    int index = -1;
    for (int i = 0; i < array.length; i++){
      if (array[i] == value){
        index = i;
        break;
      }
    }
    return index;
  }
}
