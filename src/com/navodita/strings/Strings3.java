package com.navodita.strings;

// To find out substring of any string( by code and by shortest way)
public class Strings3 {
    // By code
    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        // Substring
        String str = "HelloWorld";
        System.out.println(str.substring(0, 5));  // shortest way to find out substring from any kind of string.
        //  System.out.println(substring(str, 0, 5)); // method call
    }
}
