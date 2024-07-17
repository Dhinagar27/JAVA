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

        Node newnode = new Node(data);

        if (head == null) {

            head = newnode;
            tail = newnode;

        } else {

            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }

    public void display() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void deleteATend() {

        if (head == null) {

            System.out.printf("List is empty");
            return;
        } else if (head.next == null) {

            head = null;
            tail = null;
            return;
        } else {

            Node temp = tail.prev;
            temp.next = null;
            tail = temp;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        doublelink list = new doublelink();
        System.out.printf("Enter the number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the element: ");
            int val = sc.nextInt();
            list.insert(val);
        }

        System.out.println("The elements in the list are: ");
        list.display();
        System.out.println();

        list.deleteATend();
        System.out.println("The elements in the list after deletion are: ");
        list.display();

        sc.close();

    }

}