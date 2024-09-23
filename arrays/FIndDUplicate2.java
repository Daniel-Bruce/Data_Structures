package arrays;
import java.util.*;

public class FIndDUplicate2 {
   static int[] arr = {1,2,2,3,4,4,5,};

    public static void main(String[] args) {
        findDuplicate(arr);
    }

    static void findDuplicate(int[] arr){
        Arrays.sort(arr);

        boolean hasDuplicate = false;
        int lastUpdate = Integer.MIN_VALUE;
        //System.out.print("Duplicate numbers: " );
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1] && arr[i] != lastUpdate) {//expression to compare the current element to the previous element in a sorted array
                System.out.println(arr[i] + " ");
                lastUpdate = arr[i];
                hasDuplicate = true;
            }
        }
        if (!hasDuplicate) {
            System.out.println("No duplicates found");
        }
    }
    
}
