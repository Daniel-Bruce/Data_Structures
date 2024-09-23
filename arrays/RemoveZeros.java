package arrays;

import java.util.Arrays;

public class RemoveZeros {
    static int[] arr = {0,1,0,4,12};
    public static int[] removeZero(int[]arr){
        int[] result = new int[arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeZero(arr)));
    }
}
