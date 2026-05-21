package com.navodita.functions_methods;
// Function-Overloading using Parameters.

public class Calculator {

    // function to calculate sum of 2 nos.
    public static int sum(int a, int b) {
        // int s = a + b;
        // return s;
        return a + b; // we can also directly return the value.
    }

    // function to calculate sum of 3 nos.
    public static int sum(int a, int b, int c) {
        // int s = a + b + c;
        // return s;
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(5, 2, 1));
    }

}
