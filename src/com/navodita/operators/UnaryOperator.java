package com.navodita.operators;

public class UnaryOperator {
    public static void main(String[] args) {
        int a=10;
        int b=++a;  // pre increment operator.
        System.out.println(a); // first value of variable changes then value is updated
        System.out.println(b);
    }
}
