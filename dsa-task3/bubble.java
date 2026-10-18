import java.util.Random;

public class bubble{
    public static void main(String[] args) {

        int n = 1000;
        int[] arr = new int[n];
        Random random = new Random();

        // Generate random array elements from 0 to 9
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }

        // Bubble Sort
        long startTime = System.nanoTime();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;
        double milliseconds = executionTime / 1_000_000.0;

        System.out.println("********** Bubble Sort Completed! **********");
        System.out.println("Total Elements: " + n);
        System.out.println("Execution time in NanoSeconds: " + executionTime);
        System.out.println("Execution time in MilliSeconds: " + milliseconds);

        System.out.println("******** Sorted Array ********");

        // Display sorted array
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < n; i++) {
            output.append(arr[i]).append(" ");

            // Print 100 elements per line
            if ((i + 1) % 100 == 0) {
                output.append("\n");
            }
        }

        System.out.print(output);
    }
}
