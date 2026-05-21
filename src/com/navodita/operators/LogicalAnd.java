package com.navodita.operators;

public class LogicalAnd {
    public static void main(String[] args) {
        System.out.println((3>2) && (5>0)); // true && true
        System.out.println((3>2) && (5<0));// true && false
        System.out.println((3<2) && (5>0)); // false && true
        System.out.println((3<2) && (5<0)); // false && false
    }
}
