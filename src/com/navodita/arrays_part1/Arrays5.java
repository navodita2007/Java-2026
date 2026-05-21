package com.navodita.arrays_part1;

//Binary Search
public class Arrays5 {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {      // when start-index, end-index, mid-index are same.
            int mid = (start + end) / 2;

            //comparisons
            if (numbers[mid] == key) { // found
                return mid;
            }
            if (numbers[mid] < key) { // second half or right
                start = mid + 1;  //It means : Ignore left half including mid.
            } else { // first half or left
                end = mid - 1;  //It means : Ignore right half including mid.
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        //int key = 10;
        //int key = 4;
        int key = 20;


        System.out.println("index for key is : " + binarySearch(numbers, key));
    }
}
