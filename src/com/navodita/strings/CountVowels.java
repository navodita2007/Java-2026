//package com.navodita.strings;
//
//import java.util.Scanner;
//// Count how many times lowercase vowels occurred in a String entered by the user
//
//public class CountVowels {
//    public static void main(String[] args) {
//        String str = new Scanner(System.in).next();
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                count++;
//            }
//        }
//        System.out.println("count of vowels is :" + count);
//    }
//}

package com.navodita.strings;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Count of vowels is: " + count);
    }
}

//    Another approach
//
//    Convert the whole string once:
//
//str = str.toLowerCase();
//
//        for (int i = 0; i < str.length(); i++) {
//        char ch = str.charAt(i);
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//        count++;
//        }
//        }