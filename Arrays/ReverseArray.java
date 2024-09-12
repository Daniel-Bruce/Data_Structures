package Arrays;

import java.util.Arrays;

public class ReverseArray {
    //create a reverse method. Pass in the method the initial array that you want to reverse and a
    // range that you want to reverse the array say(this basically represent the index of the array), int start, int end
    //run a while loop which will run so long as start < end.
    // Create a temporary variable that will store the value of the first index.
    //Then swap the first value int the with the last value in array
    // then assign the end index to the first value
    //increment and decrement start respectively
    static int[] array = {1,2,4,5,6,76,75,77,34,65,78,98,3,24,5,7,86};



    public static int[] reverseArray(int[]array){
        int start = 0;
        int end = array.length - 1;
        while (start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println("Initial array: "+ Arrays.toString(array));
        int[] result = reverseArray(array);
        System.out.println("Reversed array: "+ Arrays.toString(result));
    }
}
