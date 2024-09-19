package Arrays;
import java.util.Arrays;

public class SmallestAndLargest {
    static int[] arr = {34, 12, 56, 78, 23, 9, 67, 45, 89, 11};

    public static void main(String[] args) {
        //int[] res = SL(arr);
        System.out.println("Smallest and Largest: " + Arrays.toString(SL(arr)));
        
    }

    public static int[] SL(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        return new int[]{min,max};
                    
    }
}
