package com.hillel;

import java.util.Scanner;

public class Task6Arrays {
    public static void main(String[] args) {

        printArrayFive(createArrayTen());
        printArray(createArrayN());
        printArray(createArrayNReverse());
        divisionByThree(createArrayN());
        printArrayEven(createArrayN());
        arrayElementsSumm(createArrayN());
        arrayArithmeticMean(createArrayN());
        arrayMinMax(createArrayN());
        arrayOddMult(createArrayN());
        findElement(createArrayN());


    }

    public static int[] createArrayTen() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    public static void printArrayFive(int[] array) {
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] createArrayN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько элементов должно быть в массиве ?");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        return array;
    }

    public static int[] createArrayNReverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько элементов должно быть в массиве ?");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayLength - i;
        }
        return array;
    }

    public static void divisionByThree(int[] array) {
        System.out.println("Элементы массива, которые делятся на 3 без остатка :");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void printArrayEven (int[] array) {
        System.out.println("Четные элементы массива :");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void arrayElementsSumm(int[] array) {
        int arraySumm = 0;
        for (int i = 0; i < array.length; i++) {
            arraySumm += array[i];
        }
        System.out.println("Сумма элементов массива равняется : " + arraySumm);
    }

    public static void arrayArithmeticMean (int[] array) {
        int arraySumm = 0;
        for (int i = 0; i < array.length; i++) {
            arraySumm += array[i];
        }
        int arithmeticMean = arraySumm / array.length;
        System.out.println("Среднее арифметическое заданного массива : " + arithmeticMean);
    }
    public static void arrayMinMax(int[] array) {
        int arrayMin = array[0];
        int arrayMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (arrayMin > array[i]) {
                arrayMin = array[i];
            }
            if (arrayMax < array[i]) {
                arrayMax = array[i];
            }
        }
        int arrayMinMaxSumm = arrayMin + arrayMax;
        System.out.println("Сумма минимального и максимального элементов массива равняется : " + arrayMinMaxSumm);
    }

    public static void arrayOddMult(int[] array) {
        long oddMult = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddMult *= array[i];
            }
        }
        System.out.println("Произведение всех нечетных элементов массива : " + oddMult);
    }

    public  static void findElement(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Индекс какого элемента нужно узнать ?");
        int searchingElement = scanner.nextInt();
        int elementIndex = 0;
        boolean elementFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchingElement) {
                elementFound = true;
                elementIndex = array[i];
            }
        }
        if (elementFound == true) {
            System.out.println("Индекс искомого элемента : " + elementIndex);
        }
        else {
            System.out.println("Нет такого элемента !");
        }
    }
}
