package com.navodita.datatype_variable;

import java.util.*;
// TOPIC -: Type Promotion
public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
       // char c = b-a; // we can't do this because in expression b-a java has already converted the char type to int type.so, we can't assign int type value to char type c variable.
        System.out.println(b-a);  // Type promotion is occurring. Java automatically converted the char type into int type. 98-97=1 i.e., b-a=1
        System.out.println((int) b); // value of b is 98
        System.out.println((int) a); // value of a is 97

        System.out.println(a); // output = a. Type promotions occurs only in expression.
    }
}
/*
 Type promotion in expression means java automatically promotes each byte, short, or char operand to int when evaluating
 an expression.
 */