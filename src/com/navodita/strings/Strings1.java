package com.navodita.strings;

public class Strings1 {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        } // To know each and every character present in a string we can create for loop.
        System.out.println();
    }

    public static void main(String[] args) {
        String fullname = "Tony stark";
        System.out.println(fullname.length()); // To know the length of string.
        System.out.println();
        // Concatenation
        String firstName = "Navodita";
        String lastName = "Singh";
        String fullName = firstName + " " + lastName;
        System.out.println("This is " + fullName + ".");
        System.out.println();
        System.out.println(fullName.charAt(0)); // To know the character at the particular index in a string.
        System.out.println(fullName.charAt(1));
        System.out.println(fullName.charAt(2));
        System.out.println(fullName.charAt(3));
        System.out.println();

        printLetters(fullName);


    }
}
