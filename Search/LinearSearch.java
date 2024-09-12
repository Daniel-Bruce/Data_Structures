package Search;

public class LinearSearch {
    public static void main(String[] args) {
        int num[] = {4,5,6,7,8,9,11};
        int target = 1;

        int result = linearSearch(num,target);

        if (result!= -1)
           System.out.println("Element found at index : "+result);
        else 
           System.out.println("Element not found");
    }


    public static int linearSearch(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
