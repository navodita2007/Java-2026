package com.navodita.conditional_statement;
import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        int A=1, B=3, C=6;

        if ((A >= B) && (A>=C)) {
            System.out.println("largest is A");
        } else if (B>=C) {
            System.out.println("Largest is B");
        }
        else {
            System.out.println("Largest is C");
        }
    }
}
/*
* first compare A with B & C. check whether A is greater than B & C or not.*/