package Data_Structures;

public class TimeComplexityDemo {

    public int findSum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int findsum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        TimeComplexityDemo demo = new TimeComplexityDemo();

        // Measure time for findSum
        long startTime1 = System.currentTimeMillis();
        int result = demo.findSum(9999999);
        long endTime1 = System.currentTimeMillis();
        System.out.println("Sum: " + result);
        System.out.println("Time taken for findSum: " + (endTime1 - startTime1) + " milliseconds");

        // Measure time for findsum
        long startTime2 = System.currentTimeMillis();
        int fl = demo.findsum(9999999);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Sum1: " + fl);
        System.out.println("Time taken for findsum: " + (endTime2 - startTime2) + " milliseconds");
    }
}

    

