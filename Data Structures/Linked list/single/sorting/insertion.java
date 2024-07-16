
import java.util.Scanner;

public class insertion {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;

        }
    }

    insertion() {
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

    public void display() {
        Node temp = head;

        while (temp.next != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        insertion list = new insertion();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list.insertend(val);
        }
        System.out.printf("Before Sorting");
        list.display();
        System.out.printf("After Sorting");
        list.sorting();
        list.display();

        sc.close();
    }
}
