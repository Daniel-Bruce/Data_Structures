package arrays;
import java.util.*;

public class Solution {
    static int getIdenticalTwinsCOunt(int[]arr){
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                b++;
            }
           }   
        }
        return b;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,2,1};
        System.out.println(getIdenticalTwinsCOunt(arr));
    }
    
}
