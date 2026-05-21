package com.navodita.functions_methods;

// Swapping 2 numbers

public class Swapping1 {

    public static void swap(int a, int b) { // parameters/formal parameters create copy of the arguments/actual parameters.
        // swap
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String args[]) {
        // swap - values exchange
        int a = 5;
        int b = 10;
        swap(a, b);
        System.out.println("a = " + a); // a = 5  we get actual value of a
        System.out.println("b = " + b); // b = 10  we get actual value of b
    }
}
