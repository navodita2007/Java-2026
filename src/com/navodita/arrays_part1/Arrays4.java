package com.navodita.arrays_part1;

// linear search
// Largest and smallest Number in Array.
public class Arrays4 {
    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity
        for (int i = 0; i < numbers.length; i++) {    // {1, 2, 6, 3, 5};
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("largest value is : " + getlargest(numbers));
    }
}
// we can not return 2 values so printed the smallest value there only i.e., in line 16.