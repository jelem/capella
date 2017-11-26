package com.hillel;

public class PerimeterSquare {

    public static int calculation(int side, String formula) {
        if (formula == "perimeter")
            return side * 4;
        else if (formula == "square")
            return side ^ 2;
        else
            return 0;
    }
}
