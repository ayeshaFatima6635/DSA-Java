import java.util.Scanner;

public class queue {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int[] queue = new int[10];

        int front = 0;
        int rear = -1;

        int choice = 1;

        while (choice <= 7) {

            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = src.nextInt();
            if (choice == 1) {

                if (rear == queue.length - 1) {
                    System.out.println("Queue Overflow. Queue is full.");
                } else {

                    System.out.print("Enter value: ");
                    int value = src.nextInt();

                    rear++;
                    queue[rear] = value;

                    System.out.println("Value enqueued successfully.");
                }
            }
            else if (choice == 2) {

                if (front > rear) {
                    System.out.println("Queue Underflow. Queue is empty.");
                } else {

                    int value = queue[front];
                    front++;

                    System.out.println("Dequeued value: " + value);
                }
            }
            else if (choice == 3) {

                if (front > rear) {
                    System.out.println("Queue is empty.");
                } else {

                    System.out.println("Queue elements:");

                    for (int i = front; i <= rear; i++) {
                        System.out.print(queue[i] + " ");
                    }

                    System.out.println();
                }
            }
            else if (choice == 4) {

                System.out.println("Current size: " + (rear - front + 1));
            }
            else if (choice == 5) {

                if (front > rear) {
                    System.out.println("Queue is empty.");
                } else {
                    System.out.println("Queue is not empty.");
                }
            }

            else if (choice == 6) {

                if (rear == queue.length - 1) {
                    System.out.println("Queue is full.");
                } else {
                    System.out.println("Queue is not full.");
                }
            }
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