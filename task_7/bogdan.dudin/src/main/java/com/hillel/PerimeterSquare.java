package com.hillel;

public class PerimeterSquare {

    public static int calculation(int side, String formula) {
        if (formula.equals("perimeter"))
            return side * 4;
        else if (formula.equals("square"))
            return side * side;
        else
            return 0;
    }
}
