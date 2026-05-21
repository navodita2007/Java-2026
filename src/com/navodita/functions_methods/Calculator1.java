package com.navodita.functions_methods;
// Function-Overloading using Data-Types.

public class Calculator1 {
    // function to calculate int sum
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to calculate float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3.2f, 4.8f));
    }
}
