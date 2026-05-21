package com.navodita.conditional_statement;
// if-else statements to check multiple conditions

public class JavaBasics0 {
        public static void main(String[] args) {
            int age = 22;

            if (age>=18){
                System.out.println("adult : drive, vote");
            }

          else if(age > 13 && age < 18){
                System.out.println("teenager");
            }

//            if(age > 13 && age < 18){
//                System.out.println("teenager");
//            }

        /*   this 'if' is not applicable here because here multiple conditions can't be true.
         Instead, if else should be used. */

            else {
                System.out.println("not adult");
            }
        }
    }

/*
Use if -> else if -> else chain when only one block should execute.
Use separate 'if' statements when multiple conditions can be true.
 */