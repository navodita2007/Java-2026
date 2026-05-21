package com.navodita.functions_methods;

// Functions
public class JavaBasics {
    public static void printHelloWorld() {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        return; // return' is unnecessary as the last statement in a 'void' method
    }

    public static void main(String[] args) {
        printHelloWorld(); // function call
    }
}
/*
 * we do not need to write 'return' statement/keyword when our return-type in the method/function is void.
 * Here void is the return-type in printHelloWorld() function/method.
 */