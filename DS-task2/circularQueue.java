import java.util.Scanner;

public class circularQueue {

    static int[] queue = new int[10];

    static int front = -1;
    static int rear = -1;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = 1;

        while (choice <= 7) {

            System.out.println("\n===== CIRCULAR QUEUE =====");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {

                // Enqueue
                if ((rear + 1) % queue.length == front) {

                    System.out.println("Queue Overflow. Queue is full.");

                } else {

                    System.out.print("Enter value: ");
                    int value = input.nextInt();

                    if (front == -1) {

                        front = 0;
                        rear = 0;

                    } else {

                        rear = (rear + 1) % queue.length;
                    }

                    queue[rear] = value;

                    System.out.println("Value inserted successfully.");
                }

            } else if (choice == 2) {

                // Dequeue
                if (front == -1) {

                    System.out.println("Queue Underflow. Queue is empty.");

                } else {

                    System.out.println("Deleted value: " + queue[front]);

                    if (front == rear) {

                        front = -1;
                        rear = -1;

                    } else {

                        front = (front + 1) % queue.length;
                    }
                }

            } else if (choice == 3) {

                // Peek
                if (front == -1) {

                    System.out.println("Queue is empty.");

                } else {

                    System.out.println("Front value: " + queue[front]);
                }

            } else if (choice == 4) {

                // Display
                if (front == -1) {

                    System.out.println("Queue is empty.");

                } else {

                    System.out.println("Queue elements:");

                    int i = front;

                    while (true) {

                        System.out.println(queue[i]);

                        if (i == rear) {
                            break;
                        }

                        i = (i + 1) % queue.length;
                    }
                }

            } else if (choice == 5) {

                // isEmpty
                if (front == -1) {

                    System.out.println("Queue is empty.");

                } else {

                    System.out.println("Queue is not empty.");
                }

            } else if (choice == 6) {

                // isFull
                if ((rear + 1) % queue.length == front) {

                    System.out.println("Queue is full.");

                } else {

                    System.out.println("Queue is not full.");
                }

            } else if (choice == 7) {

                System.out.println("Program ended.");

            } else {

                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}