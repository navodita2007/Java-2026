package com.navodita.strings;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }// abcdefghijklmnopqrstuvwxyz
        // Time complexity :- O(26) ,because loop runs 26 times.Using StringBuilder.
        // Time complexity :- O(n^2), using just string.
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
