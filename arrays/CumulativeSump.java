package arrays;
import java.util.*;

public class CumulativeSump {
    static List<Integer> getPositiveCumulativesum(int [] arr){
         List<Integer> list = new ArrayList<>();
         int sum = 0;
         for (int i = 0; i < arr.length; i++) {
            sum += arr[i];//we get the cumulative sum
            if (sum > 0) {// if sum is > 0  add it to list
                list.add(sum);
            }
            } 
            return list;
        
}
public static void main(String[] args) {
    int[] arr = {1, -2, 3, -4, 5};
    System.out.println(getPositiveCumulativesum(arr));
    }
    
}
