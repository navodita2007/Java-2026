package com.navodita.arrays_part1;

// linear search
// search the key from the array numbers[]
public class Arrays2 {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1; // -1 mean key does not exist.
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        // int key = 14;
        // int key = 30;
        // int key = 40;
        // int key = 50;


        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("NOT found");
        } else {
            System.out.println("key is at index : " + index);
        }
    }
}
