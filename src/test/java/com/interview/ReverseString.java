package com.interview;

public class ReverseString {

    public static void main(String[] args) {

        String str = "amazon";

        System.out.println(reverseString(str));

    }

    public static String reverseString(String str) {

        String newString="";
        char c;

        for (int i = 0; i < str.length(); i++) {

            c = str.charAt(i);

            if (i!=str.length()-1)
                newString = "-" + c + newString;
            else
                newString= c + newString;

        }return newString;

    }
    }

