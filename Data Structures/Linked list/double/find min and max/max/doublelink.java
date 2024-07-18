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

    public void max() {

        Node current = head;

        int max = head.data;

        while (current != null) {

            if (current.data > max) {

                max = current.data;

            }
            current = current.next;

        }
        System.out.printf("The Maximum Element is : %d ", max);
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
        System.out.println();

        dList.max();
        sc.close();
    }

}
