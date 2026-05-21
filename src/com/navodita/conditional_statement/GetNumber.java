package com.navodita.conditional_statement;
import java.util.*;

// Write a Java program to get a number from the user and print whether it is
//positive or negative
public class GetNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number>0){
            System.out.println("number is positive");
        } else {
            System.out.println("number is zero or negative");
        }


    }
}
