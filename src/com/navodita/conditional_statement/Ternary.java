package com.navodita.conditional_statement;
// to check whether number is even or odd
public class Ternary {
    public static void main(String[] args) {
        int number = 5;

        // ternary operator
       String type = ((number%2)==0) ? "even" : "odd";
        System.out.println(type);
    }
}
