import java.util.*;

//create node class

class Node {

    int data;
    Node next;

    public Node(int data) {

        this.data = data;
        this.next = null;
    }
}

// class example
class example {

    Node head;

    // constructor for asign head = null;
    public example() {
        head = null;
    }

    // method to insert the values inside the linked list
    public void insert(int data) {

        // creating a node
        Node newNode = new Node(data);

        // checking the head is empty or not
        if (head == null) {

            head = newNode;

        }
        // find the last node of the linked list
        else {

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // method to printing the elements in linked list

    public void display() {

        Node temp = head;

        while (temp != null) {
            if (temp.data != -1)
                System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    // method to reverse the linked list
    public void reverse() {

        Node prev = null; // for reverse the current node pointers
        Node current = head; // represents the current head positions
        Node next = null; // temp storage of next node

        while (current != null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // main function
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // creating obj for example class
        example list = new example();

        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {

            int val = sc.nextInt();
            list.insert(val);
        }

        System.out.printf("The linked list before the reverse :\n");
        list.display();

        System.out.printf("The linked list after the reverse :\n");
        list.reverse();
        list.display();

        sc.close();

    }
}