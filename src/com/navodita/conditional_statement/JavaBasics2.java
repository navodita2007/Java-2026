package com.navodita.conditional_statement;
import java.util.*;

// Print if a number is odd or even
public class JavaBasics2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();

        if (number % 2==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
