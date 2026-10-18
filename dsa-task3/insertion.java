import java.util.Random;

public class insertion {
    public static void main(String[] args) {

        int n = 1000;
        int[] arr = new int[n];
        Random random = new Random();

        // Generate random elements from 0 to 9
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }

        // Insertion Sort
        long startTime = System.nanoTime();

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;
        double milliseconds = executionTime / 1_000_000.0;

        System.out.println("********** Insertion Sort Completed! **********");
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