package com.dima;

public interface AdvanceList {
  int evaluate(Board board, char ch, int index);

  int max(Board board, int[] array, char ch);

  void clear();

  void add(int num);
  
  int generateMaxRandom(Board board, int[] array, char ch, int max);
}
