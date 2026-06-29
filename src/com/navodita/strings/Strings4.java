package com.navodita.strings;

// Print the largest string

public class Strings4 {

    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"}; // lexicographically m > a,b
        
        String largest = fruits[0]; // assumed "apple" is largest
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}


/* m is the largest letter than a,b lexicographically. Comparison is made between first alphabets of
 strings. Then next comparison between second alphabets of strings is not needed i.e. comparison stops.
 Comparison occurs between first alphabet of apple, mango, banana that is, a, m, b

 */