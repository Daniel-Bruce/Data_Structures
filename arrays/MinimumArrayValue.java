package arrays;

public class MinimumArrayValue {
   static int[] arr = {67,8,6,5,6,3,2,7,4,1};
    public static int minumumValue(int[] arr){
        int num = arr[0]; // will hold the minimum array value
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < num) {
                num = arr[i];
            }
        }
        return num;
    }

    public static void main(String[] args) {

        System.out.println(minumumValue(arr));
    }
}
