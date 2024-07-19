import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class circularlist {

    Node head = null;

    public void insertAtpos(int pos, int val) {

        Node newnode = new Node(val);

        if (head == null) {

            head = newnode;
            newnode.next = head;
        } else if (pos == 0) {

            insert(val);
            return;

        } else {

            Node temp = head;
            for (int i = 0; i < pos - 1; i++) {

                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }

    public void insert(int data) {

        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            newnode.next = head;

        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = head;
            head = newnode;
        }
    }

    public void insertAtEnd(int data) {

        Node newnode = new Node(data);

        if (head == null) {

            head = newnode;
            newnode.next = head;
        } else {

            Node temp = head;
            while (temp.next != head) {

                temp = temp.next;

            }
            temp.next = newnode;
            newnode.next = head;

        }
    }

    public void display() {

        Node temp = head;
        do {

            System.out.printf("%d ", temp.data);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        circularlist cl = new circularlist();
        System.out.println("Enter the number of elements to insert:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {

            int val = sc.nextInt();
            cl.insertAtEnd(val);
        }

        cl.display();
        System.out.println();
        System.out.println("Enter the position and value to insert:");
        int pos = sc.nextInt();
        int val = sc.nextInt();
        cl.insertAtpos(pos, val);
        cl.display();

        sc.close();

    }
}
