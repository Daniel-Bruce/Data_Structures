package arrays;

import java.util.ArrayList;
import java.util.Arrays;
   
public class RemoveEvenInr{
   public static void main(String[] args) {
      int[] array = {1,2,4,5,6,76,75,77,34,65,78,98,3,24,5,7,86};


      System.out.println("Initial array: "+ Arrays.toString(array));

      ArrayList<Integer> oddNumbers = new ArrayList<>();

      for(int num : array){
         if (num % 2 != 0) {
            oddNumbers.add(num);
         }
      }

      int[] result = oddNumbers.stream().mapToInt(Integer::intValue).toArray();
      System.out.println("Final array:" + Arrays.toString(result));
    } 
}
