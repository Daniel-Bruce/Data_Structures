package arrays;

import java.util.Arrays;

public class EvenIntegers {
          static  int [] arrays = {1,2,3,4,5,6,7,8,9,10,14,13,22,34,37,56,47};

          public static int[] removeEven(int[]arrays){
            //initialize variable that will store the count of oddNUmbers in the array
            int oddCount = 0;
            //loop array to get count of oddNumbers
            for (int i = 0; i < arrays.length; i++) {
               if (arrays[i] % 2 != 0) {
                  oddCount++;
                  }
                  }

                   //This array will contain the odd numbers of size oddCount
               int[] result = new int[oddCount];
               int idx = 0;
               // traverse to get the odd numbers
               for (int i = 0; i < arrays.length; i++) {
                  if (arrays[i] % 2 != 0) {
                     result[idx] = arrays[i];
                     idx++;
                  }}
                  return result;
               }
               public static void main(String[] args) {
                  // int[] oddNumbers = removeEven(arrays);
                  // for(int i: oddNumbers){
                  //    System.out.print(i+ " ");
                  // }}

                  int [] result = removeEven(arrays);
                  System.out.println(Arrays.toString(result));

               }
                  }


   
