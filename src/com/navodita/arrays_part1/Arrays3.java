package com.navodita.arrays_part1;

// linear search
// search the key from the array menu[]
public class Arrays3 {
    public static int linearSearch(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
                return i;
            }
        }
        return -1; // -1 mean key does not exist.
    }

    public static void main(String[] args) {
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        String menu[] = {"dosa", "chole bhature", "samosa", "cold coffee", "mango shake", "gulab jamun"};
        String key = "samosa";


        int index = linearSearch(menu, key);
        if (index == (-1)) {
            System.out.println("NOT found");
        } else {
            System.out.println("key is at index : " + index);
        }
    }
}
