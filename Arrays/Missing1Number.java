package Arrays;

public class Missing1Number {
    static int[] arr = new int[99];
    public static void main(String[] args) {
        int missingNumber = 77;
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i != missingNumber) {
                arr[index++] = i;
                }
        }
        int missingint = missingInt(arr, 100);
        System.out.println("The missing number is:"+missingint);
        
    }
    static int missingInt(int[]arr,int n){
        int expectedSum = n*(n+1)/2;

        int sum = 0;

        for (int i : arr) {
            sum+=i;
        }

        return expectedSum - sum;
    }
}

