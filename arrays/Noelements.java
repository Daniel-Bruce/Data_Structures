package arrays;

import java.util.ArrayList;
import java.util.List;

public class Noelements {
    static 	List<Integer> getEvenDigitNumbers (int[] arr) {
        List<Integer> evenDigits = new ArrayList<Integer>();
        for (int i : arr) {
            int length = String.valueOf(i).length();
            if (length % 2 == 0) {
                evenDigits.add(i);
            }
        }
       return evenDigits;
    }
    public static void main(String[] args) {
        int [] arr = {42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442};
        System.out.println(getEvenDigitNumbers(arr));
        
    }
    
}
