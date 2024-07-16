import java.util.*;

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedlist {

    Node head;

    public linkedlist() {
        head = null;
    }

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
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

    public void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 0) {
            insertAtBegin(data);
            return;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            System.out.println("Position out of bounds");
        }
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

        linkedlist list = new linkedlist();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter No of Linked list Elements: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            list.insertAtEnd(val);
        }

        System.out.println("Before insertion at the beginning:");
        list.display();
        System.out.printf("Enter the element to insert at Begin:\n");
        int num2 = sc.nextInt();

        list.insertAtBegin(num2);

        System.out.println("After insertion at the beginning:");
        list.display();

        System.out.printf("Enter the position to insert: \n ");
        int pos = sc.nextInt();
        System.out.printf("Enter the number to insert in given position:\n");
        int num = sc.nextInt();

        System.out.printf("Before insertion:\n");
        list.display();

        list.insertAtPosition(num, pos);

        System.out.println("After insertion at the specified position:");
        list.display();

        System.out.printf("Enter the number to insert at End:\n");
        int num3 = sc.nextInt();

        System.out.printf("Before inserting at End :\n");
        list.display();

        list.insertAtEnd(num3);

        System.out.printf("After inserting at End:\n");
        list.display();
    }
}
