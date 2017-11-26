package com.hillel;

public class Task9 {

    public static void main(String[] args) {

        int[] array = { 47, 34, 41, 48, 26, 57, 44, 21, 27, 17, 9, 11, 30};
        int i = 0;
        long product = 0;

        while (i < array.length) {
            if (array[i] %  2 == 0) {
                product = array[i];
                i++;
                break;
            }
            i++;
        }

        while (i < array.length) {
            if (array[i] %  2 == 0) {
                product = product * array[i];
            }
            i++;
        }
        System.out.println("Product of even elements of an array: " + product);
    }
}
