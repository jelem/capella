package com.lev.task_2;

public class RepeatedChars {

  private String word;

  public RepeatedChars() {
  }

  public String output (RepeatedChars word) {
    if (word.isRepeated(word.getWord())) {
      return "Симводы в слове повторяются";
    } else {
      return "Символы уникальны";
    }
  }


  public boolean isRepeated(String word) {
    char[] letters = creatingChars(word);
    for (int i = 0; i < letters.length; i++) {
      for (int j = i + 1; j < letters.length; j++) {
        if (letters[i] == letters[j]) {
          return true;
        }
      }
    }
    return false;
  }

  public char[] creatingChars(String word) {
    return word.toCharArray();
  }

  public String getWord() {
    return word.toLowerCase();
  }

  public void setWord(String word) {
    this.word = word;
  }
}
