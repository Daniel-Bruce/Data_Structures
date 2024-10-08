package arrays;
import java.util.*;

public class CumulativeSum {
    static int [] arr = {1,2,3,4,5,6};

    

    static int [] getCumulative(int[] arr){
        
      int [] cum = new int[arr.length];
      cum[0] = arr[0];//first element in cs is same as 1st element in arr

      for (int i = 1; i < arr.length; i++) {
        
        cum[i] = cum[i-1] + arr[i];// add the element at the current arr index to the prev element of cum []
        }
        return cum;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getCumulative(arr)));
    }
    
}
