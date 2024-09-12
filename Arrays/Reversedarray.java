package Arrays;

import java.util.Arrays;

public class Reversedarray {
    static int[] num = {1,2,3,5,6,4,7,8,9,56,45};

    static void reverse(int[] num,int start, int end){
        while(start<end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        System.out.println("Initial array: "+Arrays.toString(num));
        reverse(num, 0, (num.length - 1));
        System.out.println("Reversed array: "+Arrays.toString(num));
    }
    
}
