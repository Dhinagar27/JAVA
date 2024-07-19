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

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            do {
                System.out.printf("%d ", temp.data);
                temp = temp.next;
            } while (temp != head);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        circularlist cl = new circularlist();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            cl.insert(sc.nextInt());
        }
        System.out.println("The elements in the list are:");
        cl.display();

        sc.close();
    }
}