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

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int val = sc.nextInt();
            cl.insertAtEnd(val);
        }
        cl.display();

        sc.close();

    }
}
