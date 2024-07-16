import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class doublelink {
    Node head;
    Node tail;

    doublelink() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        doublelink dList = new doublelink();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to insert: ");

        int n = sc.nextInt();

        System.out.println("Enter the elements: ");

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            dList.insertAtBegin(data);
        }

        dList.display();

        sc.close();
    }
}
