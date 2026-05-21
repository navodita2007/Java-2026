package com.navodita.strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};

        // Below are the following 2 ways to declare a string data-type :-
        String str = "abcd";
        String str2 = new String("xyz@#1234 ");

        //Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String name;
        // name = sc.next(); // It can take only 1 word.
        name = sc.nextLine(); // It can take a sentence.
        System.out.println(name);
    }
}
