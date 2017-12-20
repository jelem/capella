package com.dima;

import java.util.Vector;

public class Board {
  public static char X = 'X';
  public static char O = 'O';
  public static int CLASSIC = 9;

  private char[] field;
  private int free;
  private int[] indexes;



  public Board() {
    field = new char[CLASSIC];
    free = CLASSIC;
    indexes = new int[CLASSIC];
    for (int i = 0; i < CLASSIC; i++) {
      field[i] = ' ';
      indexes[i] = i;
    }
  }


  public void draw() {
    for (int i = 0; i < field.length; i++) {
      if (field[i] != ' ') {
        System.out.print(" " + field[i] + " ");
      } else {
        System.out.print("*" + i + "*");
      }
      if ( i % 3 == 0 || (i >  0 && (i - 1) % 3 == 0 )){
        System.out.print("|");
      }

      if ( (i + 1) % 3 == 0 && i < 6) {
        System.out.println("\n___________");
      }
    }
    System.out.println("\n");
  }

  public boolean isValid(int buf) {
    return !( buf < 0 || buf >= field.length || field[buf] != ' ');
  }

  public void fill(char signature, int buf) {
    field[buf] = signature;
    deleteToNum(buf);
    free--;
  }

  public void fillRandome(char signature) {
    int rand = randNum(free);
    int num = indexes[rand];
    deleteToIndex(rand);
    field[num] = signature;
    free--;
  }

  public void fillSmart(char signature) {
    int max = indexes[0];
    int id = 0;
    int del = 0;
    for (int i = 0; i < free; i++) {
      id = indexes[i];
      //System.out.println(id + " -> " + evaluate(id, signature));
      if (evaluate(id, signature) > evaluate(max, signature)) {
        max = indexes[i];
      }
    }

    //System.out.println("max: " + max);
    field[max] = signature;
    deleteToNum(max);
    free--;
  }

  public int evaluate(int index, char signature) {
    char current = signature;
    char enemy = signature == X ? O : X;
    if (index == 0) {
      if (field[1] == current && field[2] == current) {
        return 10;
      } else if (field[3] == current && field[6] == current) {
        return 10;
      } else if (field[4] == current && field[8] == current) {
        return 10;
      }
    } else if (index == 1) {
      if (field[0] == current && field[2] == current) {
        return 10;
      } else if (field[4] == current && field[7] == current) {
        return 10;
      }
    } else if (index == 2) {
      if (field[0] == current && field[1] == current) {
        return 10;
      } else if (field[5] == current && field[8] == current) {
        return 10;
      } else if (field[4] == current && field[6] == current) {
        return 10;
      }
    } else if (index == 3) {
      if (field[4] == current && field[5] == current) {
        return 10;
      } else if (field[0] == current && field[6] == current) {
        return 10;
      }
    } else if (index == 4) {
      if (field[3] == current && field[5] == current) {
        return 10;
      } else if (field[1] == current && field[7] == current) {
        return 10;
      } else if (field[0] == current && field[8] == current) {
        return 10;
      } else if (field[2] == current && field[6] == current) {
        return 10;
      }
    } else if (index == 5) {
      if (field[3] == current && field[4] == current) {
        return 10;
      } else if (field[2] == current && field[8] == current) {
        return 10;
      }
    } else if (index == 6) {
      if (field[7] == current && field[8] == current) {
        return 10;
      } else if (field[0] == current && field[3] == current) {
        return 10;
      } else if (field[2] == current && field[4] == current) {
        return 10;
      }
    } else if (index == 7) {
      if (field[6] == current && field[8] == current) {
        return 10;
      } else if (field[1] == current && field[4] == current) {
        return 10;
      }
    } else if (index == 8) {
      if (field[6] == current && field[7] == current) {
        return 10;
      } else if (field[2] == current && field[5] == current) {
        return 10;
      } else if (field[0] == current && field[4] == current) {
        return 10;
      }
    }

    if (index == 0) {
      if (field[1] == enemy && field[2] == enemy) {
        return 0;
      } else if (field[3] == enemy && field[6] == enemy) {
        return 0;
      } else if (field[4] == enemy && field[8] == enemy) {
        return 0;
      }
    } else if (index == 1) {
      if (field[0] == enemy && field[2] == enemy) {
        return 0;
      } else if (field[4] == enemy && field[7] == enemy) {
        return 0;
      }
    } else if (index == 2) {
      if (field[0] == enemy && field[1] == enemy) {
        return 0;
      } else if (field[5] == enemy && field[8] == enemy) {
        return 0;
      } else if (field[4] == enemy && field[6] == enemy) {
        return 0;
      }
    } else if (index == 3) {
      if (field[4] == enemy && field[5] == enemy) {
        return 0;
      } else if (field[0] == enemy && field[6] == enemy) {
        return 0;
      }
    } else if (index == 4) {
      if (field[3] == enemy && field[5] == enemy) {
        return 0;
      } else if (field[1] == enemy && field[7] == enemy) {
        return 0;
      } else if (field[0] == enemy && field[8] == enemy) {
        return 0;
      } else if (field[2] == enemy && field[6] == enemy) {
        return 0;
      }
    } else if (index == 5) {
      if (field[3] == enemy && field[4] == enemy) {
        return 0;
      } else if (field[2] == enemy && field[8] == enemy) {
        return 0;
      }
    } else if (index == 6) {
      if (field[7] == enemy && field[8] == enemy) {
        return 0;
      } else if (field[0] == enemy && field[3] == enemy) {
        return 0;
      } else if (field[2] == enemy && field[4] == enemy) {
        return 0;
      }
    } else if (index == 7) {
      if (field[6] == enemy && field[8] == enemy) {
        return 0;
      } else if (field[1] == enemy && field[4] == enemy) {
        return 0;
      }
    } else if (index == 8) {
      if (field[6] == enemy && field[7] == enemy) {
        return 0;
      } else if (field[2] == enemy && field[5] == enemy) {
        return 0;
      } else if (field[0] == enemy && field[4] == enemy) {
        return 0;
      }
    }
    return -10;
  }

  private int randNum(int num ) {
    return  (int) Math.floor( (Math.random() * num) );
  }


  public int getFree() {
    return free;
  }

  public boolean isFill() {
    return free == 0;
  }

  public boolean isWin(char signature) {
    return ( field[0] == signature && field[1] == signature && field[2] == signature ) ||
           ( field[3] == signature && field[4] == signature && field[5] == signature ) ||
           ( field[6] == signature && field[7] == signature && field[8] == signature ) ||
           ( field[0] == signature && field[3] == signature && field[6] == signature ) ||
           ( field[1] == signature && field[4] == signature && field[7] == signature ) ||
           ( field[2] == signature && field[5] == signature && field[8] == signature ) ||
           ( field[0] == signature && field[4] == signature && field[8] == signature ) ||
           ( field[2] == signature && field[4] == signature && field[6] == signature );
  }

  int binarySearch(int num) {
    int left = 0;
    int right = free -1;
    int middle = (left + right) / 2;
    while (left < right) {
      if (indexes[left] == num) {
        return left;
      } else if (indexes[middle] == num) {
        return middle;
      } else if (indexes[right] == num) {
        return  right;
      } else if (indexes[middle] < num) {
        left = middle + 1;
      } else {
        right = middle - 1;
      }
      middle = (left + right) / 2;
    }
    return -1;
  }

  void deleteToIndex(int index) {
    for (int i = index; i < free - 1; i++) {
      indexes[i] = indexes[i + 1];
    }
  }

  void deleteToNum(int num) {
    int index = binarySearch(num);
    if (index == -1) {
      return;
    }
    deleteToIndex(index);
  }
}
