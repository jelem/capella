package com.hillel;



/**
 * Created by User on 26.11.2017.
 */
public class String2Example {
    public static void main(String[] args) {


        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = str3.intern();

        System.out.println(str1 == str2);   //true
        System.out.println(str1 == str3);   //false
        System.out.println(str3 == str4);   //false
        System.out.println(str1 == str4);   //true
    }
}
