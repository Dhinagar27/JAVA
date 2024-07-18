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

    public void sorting() {

        Node current, index;
        int temp;

        for (current = head; current != null; current = current.next) {

            for (index = current; index != null; index = index.next) {

                if (current.data > index.data) {

                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;

                }
            }
        }

    }

    public void duplicate() {

        Node current = head;

        while (current != null && current.next != null) {

            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }

        }

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
        System.out.printf("Original list:\n");
        dList.display();
        System.out.println();

        System.out.printf("Sorted list:\n");

        dList.sorting();
        dList.display();

        System.out.printf("Before Removing Duplicate:\n");
        dList.display();
        System.out.println();

        System.out.printf("After Removing Duplicate:\n");
        dList.duplicate();
        dList.display();

        sc.close();
    }

}