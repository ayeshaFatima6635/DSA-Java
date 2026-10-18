import java.util.Random;

public class selection{
    public static void main(String[] args) {

        int n = 1000;
        int[] arr = new int[n];
        Random random = new Random();

        // Generate random elements from 0 to 9
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }

        // Selection Sort
        long startTime = System.nanoTime();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;
        double milliseconds = executionTime / 1_000_000.0;

        System.out.println("********** Selection Sort Completed! **********");
        System.out.println("Total Elements: " + n);
        System.out.println("Execution time in NanoSeconds: " + executionTime);
        System.out.println("Execution time in MilliSeconds: " + milliseconds);
        System.out.println("******** Sorted Array ********");

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < n; i++) {
            output.append(arr[i]).append(" ");

            if ((i + 1) % 100 == 0) {
                output.append("\n");
            }
        }

        System.out.print(output);
    }
}