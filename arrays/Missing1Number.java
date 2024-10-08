package arrays;

public class Missing1Number {
   static int findMissing(int[]arr){
    int n = arr.length + 1; //because we are missing one number in the array
    int totalSum = (n * (n + 1)) / 2;
    for (int num : arr) {
        totalSum = totalSum - num;
    }
    return totalSum;
   }
   public static void main(String[] args) {
    int[] arr = {1, 2, 4,3,5,6,8,9};
    System.out.println(findMissing(arr));
    }
}

