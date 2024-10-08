package arrays;

import java.util.Arrays;

public class ResizeArray {
    public static int[] resize(int[]arr,int cap){
        int[] temp = new int[cap];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Original array size: "+arr.length);
        int[] ar = resize(arr,9);
        System.out.println("New array size: "+ar.length);

    }
}
