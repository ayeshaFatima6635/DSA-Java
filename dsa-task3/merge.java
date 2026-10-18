import java.util.Random;

public class merge {

    // Merge Sort
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted parts
    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    public static void main(String[] args) {

        int n = 1000;
        int[] arr = new int[n];
        Random random = new Random();

        // Generate random elements from 0 to 9
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }

        long startTime = System.nanoTime();

        mergeSort(arr, 0, n - 1);

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;
        double milliseconds = executionTime / 1_000_000.0;

        System.out.println("********** Merge Sort Completed! **********");
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