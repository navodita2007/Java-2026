package com.navodita.operators;

public class logicalOr {
    public static void main(String[] args) {
        System.out.println((3<2 || (5<0))); // false or false
        System.out.println((3>2 || (5<0))); // true or false
        System.out.println((3<2 || (5>0))); // false or true
        System.out.println((3>2 || (5>0))); // true or true
    }
}
