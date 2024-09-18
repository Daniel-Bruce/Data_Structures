package Arrays;

public class RemoveDuplicate {
public static void main(String[] args) {
    int[] arr = {1,2,2,3,4,4,5,};
    int[] arr1 = removeDuplicates(arr);
    for(int i:arr1) {
        System.out.print(i+" ");
        }
        
}    
public static int[] removeDuplicates(int[] arr) {
    if (arr.length == 0) {
        return arr;
        }
        int i = 0;
        for (int j = 1; j < arr.length; j++) { 
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
                }
                }
                int[] result = new int[i + 1];
                System.arraycopy(arr, 0, result, 0, i + 1);
                return result;
                }
                
}

