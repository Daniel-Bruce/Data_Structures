package Arrays;

/**
 * 1Darray
 */
public class OneDarray {
public static void main(String[] args) {
    // This syntax we use if we want a fixed array size in this case 4.
    int [] array = new int[4];
    //We will then go ahed and initialize each index with their respective values
    array[0] = 10;
    array[1] = 20;
    array[2] = 30;
    array[3] = 40;
    //Adding or updating elements to an array
    array[2] = 100;
    //Checking the length of array
    System.out.println("Array length: "+ array.length);
    //Printing the index of the last element
    System.out.println("Index of last element: "+(array.length - 1));
    //Printing the array
    //  We can use either for-loop/each loop to print the elements of the array

    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
    }

    // for (int i : array) {
    //     System.out.println(i);
        
    // }
    
    // int [] array = {1,2,3,4,5};
    // for (int i : array) {
    //     System.out.println(i);
    // }

    // for (int i = 0; i < array.length; i++) {
    //     System.out.println(array[i]);
    // }



    
}
    
}