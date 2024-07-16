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

    // method to find the maximum element in linked list

    public void Minimum() {

        int min = head.data;
        Node temp = head.next;

        while (temp != null) {

            if (temp.data < min) {
                min = temp.data;
            }
            temp = temp.next;
        }
        System.out.printf("The Maximum Element is : %d", min);
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

        list.Minimum();

        sc.close();

    }
}
