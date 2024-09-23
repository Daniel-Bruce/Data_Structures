package arrays;
import java.util.Arrays;
import java.util.*;

public class FindDuplicate {
    static int[] arr = {1,2,2,3,4,4,5,};
    public static void main(String[] args) {
        System.out.println("Duplicate values: "+ findDuplicate(arr));
    }
  
    static HashSet<Integer> findDuplicate(int[] arr){
      HashSet<Integer> seen = new HashSet<>();
      HashSet<Integer> duplicates = new HashSet<>();

      for (int num : arr) {
        if (!seen.add(num)) {
            duplicates.add(num);
        }
      }
    return duplicates;

    }
}
