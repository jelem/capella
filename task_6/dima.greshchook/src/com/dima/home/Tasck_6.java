package com.dima.home;

import com.dima.home.data.WrapperOfArray;

public class Tasck_6 {

  public static void main(String[] args) {
    WrapperOfArray wrapper = new WrapperOfArray();
    //Task_1
    wrapper.setAray(10);
    wrapper.InitializeRandom();
    System.out.println("Task_1");
    wrapper.shomArray(5);
    //Task_2
    if (args.length == 0){
      System.out.println("...What is it??..");
      return;
    }
    int n = Integer.parseInt(args[0]);
    wrapper.setAray(n);
    wrapper.InitializeOrder();
    System.out.println("Task_2");
    wrapper.shomArray();
    //Task_3
    wrapper.InitializeReverse();
    System.out.println("Task_3");
    wrapper.shomArray();
    //Task_4
    wrapper.InitializeRandom();
    System.out.println("Task_4");
    wrapper.showElemDivToNum(3);
    //Task_5
    System.out.println("Task_5");
    wrapper.showEvenElem();
    //Task_6
    System.out.println("Task_6");
    System.out.println("Summ of array is: " + wrapper.summ());
    //Task_7
    System.out.println("Task_7");
    System.out.println("Average of array is: " + wrapper.average());
    //Task_8
    System.out.println("Task_8");
    int summMaxandMin = wrapper.min() + wrapper.max();
    System.out.println("Summ of min and max elements of array is: " + summMaxandMin);
    //Task_9
    System.out.println("Task_9");
    long productOfOdd = wrapper.productOfOddElem();
    System.out.println("Product of odd elements of array is: " + productOfOdd);
    //Task_10
    System.out.println("Task_10");
    int index = wrapper.indexOfElemEqualTo(n);
    if (index == -1){
      System.out.println("It hasn't find this elements");
    }else{
      System.out.println("Index of elements of array with value " + n + " is: " + index);
    }
  }
}
