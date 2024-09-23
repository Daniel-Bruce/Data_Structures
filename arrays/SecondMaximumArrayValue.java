package arrays;

import java.util.Arrays;

public class SecondMaximumArrayValue {
    static int[] arr = {1,2,4,5,6,76,75,77,34,65,78,98,3,24,5,7,86};
    public static int secondMaximumNumber(int[]arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            //int num = arr[i];
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] != max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        System.out.println(secondMaximumNumber(arr));
    }
}
