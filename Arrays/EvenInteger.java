package Arrays;

import java.util.Arrays;

public class EvenInteger {
    static int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 13, 22, 34, 37, 56, 47};

    public static void main(String[] args) {
        // Calling the removeEven method with the arrays as an argument
        int[] result = removeEven(arrays);

        // Printing the array without even numbers
        for (int num : result) {
            System.out.print(num + " ");
        }

    }

    // Method to remove even numbers from an array
    public static int[] removeEven(int[] arrays) {
        int oddCount = 0;

        // Counting the number of odd numbers
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 != 0) {
                oddCount++;
            }
        }

        // Creating a new array to store only odd numbers
        //size of result will be same as the number of odd Numbers found
        int[] result = new int[oddCount];
        int idx = 0;

        // Adding odd numbers to the result array
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 != 0) {
                result[idx] = arrays[i];
                idx++;
            }
        }

        // Returning the array with only odd numbers
        return result;
    }
}


