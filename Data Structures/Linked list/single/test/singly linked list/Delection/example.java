import java.util.Scanner;

public class example {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    example() {
        head = null;
    }

    public void insertend(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void deleteAtBegin() {
        head = head.next;
    }

    public void deleteAtposition(int pos) {
        Node temp = head;
        Node prev = null;
        for (int i = 1; i < pos; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }

    public void deleteAtEnd(int n) {
        Node temp = head;
        Node prev = null;
        for (int i = 1; i < n; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d --> ", temp.data);
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        example list = new example();
        System.out.print("Enter the number of elements: ");
        System.err.println();
        int size = s.nextInt();
        System.out.print("Enter the element : ");
        System.err.println();
        for (int i = 0; i < size; i++) {
            int val = s.nextInt();
            list.insertend(val);
        }
        System.out.println("The linked list is: ");
        list.display();
        System.out.println();

        System.out.println("After deleting the last element: ");
        list.deleteAtEnd(size);
        list.display();
        System.out.println();

        System.out.println("After deleting the first element: ");
        list.deleteAtBegin();
        list.display();
        System.out.println();

        System.out.print("Enter the index to delete: ");
        int pos = s.nextInt();
        list.deleteAtposition(pos);
        list.display();
        s.close();
    }
}