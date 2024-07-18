import java.util.*;

class Node {

    int data;
    Node next;
    Node prev;

    public Node(int data) {

        this.data = data;
        this.next = null;
        this.prev = null;
    }

}

public class doublelink {

    Node head;
    Node tail;

    public doublelink() {

        head = null;
        tail = null;
    }

    public void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
            tail = newNode;
        } else {

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

    }

    public void search(int data) {

        Node current = head;
        int count = 0;

        while (current != null) {

            if (current.data == data) {

                System.out.println("Element found at position: " + count);
                return;
            }

            count++;
            current = current.next;
        }

        System.out.println("Element not found");
    }

    public void display() {

        Node current = head;

        while (current != null) {

            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {

        doublelink dList = new doublelink();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Enter the element: ");
            int data = sc.nextInt();
            dList.insert(data);
        }

        dList.display();

        System.out.println("\nEnter the element to search: ");
        int searchElement = sc.nextInt();
        dList.search(searchElement);

        sc.close();
    }

}