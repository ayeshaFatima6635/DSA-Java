import java.util.Scanner;

class QueueLinkedlist {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(value + " inserted into queue.");
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow.");
            return;
        }

        System.out.println(front.data + " deleted from queue.");

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    void peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front = " + front.data);
        }
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node current = front;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("NULL");
    }

    boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QueueLinkedlist queue = new QueueLinkedlist();

        int choice = 1;

        while (choice <= 6) {
            System.out.println("\n===== QUEUE MENU =====");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Is Empty");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter value: ");
                int value = input.nextInt();
                queue.enqueue(value);

            } else if (choice == 2) {
                queue.dequeue();

            } else if (choice == 3) {
                queue.peek();

            } else if (choice == 4) {
                queue.display();

            } else if (choice == 5) {
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty.");
                } else {
                    System.out.println("Queue is not empty.");
                }

            } else if (choice == 6) {
                System.out.println("Program ended.");

            } else {
                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}