import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {

        this.data = data;
        this.next = null;
    }
}

public class linkedlist {
    Node head;

    public linkedlist() {
        head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to delete a node by value
    @SuppressWarnings("resource")
    public void delete() {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        Node temp = head;
        Node prev = null;
        if (temp != null && temp.data == value) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != value) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Element not found");
        }
        prev.next = temp.next;
        sc.close();

    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); // Add a newline at the end for better output formatting
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedlist list = new linkedlist();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int value = sc.nextInt();
            list.insert(value);

        }
        list.delete();
        list.display();
        sc.close();
    }
}