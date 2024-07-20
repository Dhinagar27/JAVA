import java.util.*;

class node {

    int data;
    node next;

    public node(int data) {
        this.data = data;
        this.next = null;
    }
}

class circularlist {

    node head = null;

    public void insertAtEnd(int data) {
        node newnode = new node(data);

        if (head == null) {

            head = newnode;
            newnode.next = head;
        } else {
            node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = head;
        }
    }

    public void display() {
        node temp = head;
        do {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        } while (temp != head);
    }

    public void deleteAtBegin() {

        node temp = head;
        while (temp.next != head) {

            temp = temp.next;

        }
        temp.next = head.next;
        head = temp.next;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        circularlist list = new circularlist();
        System.out.println("Enter the number of element in the list :");
        int size = sc.nextInt();
        System.out.println("Enter the number : ");
        for (int i = 0; i < size; i++) {

            int val = sc.nextInt();
            list.insertAtEnd(val);
        }
        System.out.println("Original List : ");
        list.display();
        System.out.println();
        System.out.println("After delete at begin");
        list.deleteAtBegin();
        list.display();

        sc.close();

    }
}
