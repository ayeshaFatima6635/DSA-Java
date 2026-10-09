
import java.util.Scanner;

public class TwoDarray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];

        // Input elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                arr[i][j] = input.nextInt();
            }
        }

        // Display elements
        System.out.println("2D Array:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        input.close();
    }
}
