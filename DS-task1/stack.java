import java.util.Scanner;

public class stack {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int[] stack = new int[10];
        int top = -1;

        int choice = 1;

        while (choice <= 7) {

            System.out.println("\n----- STACK MENU -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = src.nextInt();

            // 1. Push
            if (choice == 1) {

                if (top == stack.length - 1) {
                    System.out.println("Stack Overflow. Stack is full.");
                } else {

                    System.out.print("Enter value: ");
                    int value = src.nextInt();

                    top++;
                    stack[top] = value;

                    System.out.println("Value pushed successfully.");
                }
            }

            // 2. Pop
            else if (choice == 2) {

                if (top == -1) {
                    System.out.println("Stack Underflow. Stack is empty.");
                } else {

                    int value = stack[top];
                    top--;

                    System.out.println("Popped value: " + value);
                }
            }

            // 3. Display
            else if (choice == 3) {

                if (top == -1) {
                    System.out.println("Stack is empty.");
                } else {

                    System.out.println("Stack elements:");

                    for (int i = top; i >= 0; i--) {
                        System.out.println(stack[i]);
                    }
                }
            }

            // 4. Size
            else if (choice == 4) {

                System.out.println("Current size: " + (top + 1));
            }

            // 5. isEmpty
            else if (choice == 5) {

                if (top == -1) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.println("Stack is not empty.");
                }
            }

            // 6. isFull
            else if (choice == 6) {

                if (top == stack.length - 1) {
                    System.out.println("Stack is full.");
                } else {
                    System.out.println("Stack is not full.");
                }
            }

            // 7. Exit
            else if (choice == 7) {

                System.out.println("Program ended.");
            }

            else {
                System.out.println("Invalid choice.");
            }
        }

        src.close();
    }
}