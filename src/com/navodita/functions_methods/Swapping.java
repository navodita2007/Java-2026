package com.navodita.functions_methods;

// Swapping 2 numbers

public class Swapping {

    public static void swap(int a, int b) {
        // swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a); // swapping
        System.out.println("b = " + b); // swapping
    }

    public static void main(String args[]) {
        // swap - values exchange
        int a = 5;
        int b = 10;
        swap(a, b);
    }
}
