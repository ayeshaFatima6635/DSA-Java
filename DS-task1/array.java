import java.util.Scanner;

public class array {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int[] arr = new int[10];
        int size = 0;

        int choice = 1;

        while (choice <= 11) {

            System.out.println("\n----- ARRAY MENU -----");
            System.out.println("1. Add value");
            System.out.println("2. Insert at index");
            System.out.println("3. Fill array");
            System.out.println("4. Delete last element");
            System.out.println("5. Delete by index");
            System.out.println("6. Display");
            System.out.println("7. Search value");
            System.out.println("8. Get value at index");
            System.out.println("9. Replace/Update value at index");
            System.out.println("10. Size");
            System.out.println("11. Exit");

            System.out.print("Enter your choice: ");
            choice = src.nextInt();
            if (choice == 1) {

                if (size == arr.length) {
                    System.out.println("Array is full.");
                } else {
                    System.out.print("Enter value: ");
                    int value = src.nextInt();

                    arr[size] = value;
                    size++;

                    System.out.println("Value added successfully.");
                }
            }
            else if (choice == 2) {

                if (size == arr.length) {
                    System.out.println("Array is full.");
                } else {
                    System.out.print("Enter index: ");
                    int index = src.nextInt();

                    if (index >= 0 && index <= size) {

                        System.out.print("Enter value: ");
                        int value = src.nextInt();

                        for (int i = size; i > index; i--) {
                            arr[i] = arr[i - 1];
                        }

                        arr[index] = value;
                        size++;

                        System.out.println("Value inserted successfully.");

                    } else {
                        System.out.println("Invalid index.");
                    }
                }
            }
            else if (choice == 3) {

                if (size == arr.length) {
                    System.out.println("Array is already full.");
                } else {

                    int continueInput = 1;

                    while (continueInput == 1 && size < arr.length) {

                        System.out.print("Enter value: ");
                        int value = src.nextInt();

                        arr[size] = value;
                        size++;

                        if (size < arr.length) {
                            System.out.print("Enter 1 to continue or 0 to stop: ");
                            continueInput = src.nextInt();
                        }
                    }

                    System.out.println("Array filling completed.");
                }
            }
            else if (choice == 4) {

                if (size == 0) {
                    System.out.println("Array is empty.");
                } else {
                    size--;

                    System.out.println("Last element deleted successfully.");
                }
            }
            else if (choice == 5) {

                if (size == 0) {
                    System.out.println("Array is empty.");
                } else {

                    System.out.print("Enter index to delete: ");
                    int index = src.nextInt();

                    if (index >= 0 && index < size) {

                        for (int i = index; i < size - 1; i++) {
                            arr[i] = arr[i + 1];
                        }

                        size--;

                        System.out.println("Value deleted successfully.");

                    } else {
                        System.out.println("Invalid index.");
                    }
                }
            }
            else if (choice == 6) {

                if (size == 0) {
                    System.out.println("Array is empty.");
                } else {

                    System.out.println("Array elements:");

                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }

                    System.out.println();
                }
            }
            else if (choice == 7) {

                if (size == 0) {
                    System.out.println("Array is empty.");
                } else {

                    System.out.print("Enter value to search: ");
                    int value = src.nextInt();

                    int foundIndex = -1;

                    for (int i = 0; i < size; i++) {

                        if (arr[i] == value) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex >= 0) {
                        System.out.println("Value found at index: " + foundIndex);
                    } else {
                        System.out.println("Value not found.");
                    }
                }
            }
            else if (choice == 8) {

                if (size == 0) {
                    System.out.println("Array is empty.");
                } else {

                    System.out.print("Enter index: ");
                    int index = src.nextInt();

                    if (index >= 0 && index < size) {
                        System.out.println("Value at index " + index + ": " + arr[index]);
                    } else {
                        System.out.println("Invalid index.");
                    }
                }
            }
            else if (choice == 9) {

                if (size == 0) {
                    System.out.println("Array is empty.");
                } else {

                    System.out.print("Enter index to update: ");
                    int index = src.nextInt();

                    if (index >= 0 && index < size) {

                        System.out.print("Enter new value: ");
                        int value = src.nextInt();

                        arr[index] = value;

                        System.out.println("Value updated successfully.");

                    } else {
                        System.out.println("Invalid index.");
                    }
                }
            }
            else if (choice == 10) {

                System.out.println("Current size: " + size);
            }
            else if (choice == 11) {

                System.out.println("Program ended.");
            }

            else {
                System.out.println("Invalid choice.");
            }
        }

        src.close();
    }
}