package com.hillel;

/**
 * Created by User on 26.11.2017.
 */
public class FindCharinString {

    public static int count(String str, char ch) {
        char[] ar = str.toCharArray();
        int count = 0;

        for (char c : ar) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

        public static int count2(String str, char ch) {
            int count = 0;
            for (int i = 0; i < 0; i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            return count;
        }
    }

