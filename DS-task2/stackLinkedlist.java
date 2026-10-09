
import java.util.Scanner;

class StackLinkedlist {

    // Node
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    // Push
    void push(int value) {
        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;

        System.out.println(value + " pushed into stack.");
    }

    // Pop
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow.");
        } else {
            System.out.println(top.data + " popped from stack.");
            top = top.next;
        }
    }

    // Peek
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top = " + top.data);
        }
    }

    // Display
    void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }

        Node current = top;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("NULL");
    }

    // Is Empty
    boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StackLinkedlist stack = new StackLinkedlist();

        int choice = 1;

        while (choice <= 6) {

            System.out.println("\n===== STACK MENU =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Is Empty");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {

                System.out.print("Enter value: ");
                int value = input.nextInt();

                stack.push(value);

            } else if (choice == 2) {

                stack.pop();

            } else if (choice == 3) {

                stack.peek();

            } else if (choice == 4) {

                stack.display();

            } else if (choice == 5) {

                if (stack.isEmpty()) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.println("Stack is not empty.");
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

