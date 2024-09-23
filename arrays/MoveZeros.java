package arrays;

import java.util.Arrays;

public class MoveZeros {
    static int[] arr = {0, 1, 0, 4, 12};

    public static void moveZeroes(int[] arr) {
        int idx = 0; // Index to place the next non-zero element

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[idx] = arr[i];
                idx++;
            }
        }

        while (idx < arr.length) {
            arr[idx] = 0;
            idx++;
        }    }

    public static void main(String[] args) {
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}

