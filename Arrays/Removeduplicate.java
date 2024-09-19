package Arrays;

import java.util.LinkedHashSet;

public class Removeduplicate {
    static int[] arr = {1,2,2,3,4,4,5,};

    public static void main(String[] args) {
        for (int ar : removeDuplicate(arr)) {
            System.out.println(ar);
        }
        }
    
    public static int[] removeDuplicate(int[] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
          for(int num : arr){
            set.add(num);
          }
          int[] result = set.stream().mapToInt(Integer::intValue).toArray();
          return result;
}}
