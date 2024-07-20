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

    public void deleteAtpos(int ele) {

        if (ele == head.data) {
            deleteAtBegin();
            return;
        }

        node temp = head;
        while (temp.next.data != ele) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        circularlist list = new circularlist();

        System.out.println("Enter the size of The list : ");
        int size = sc.nextInt();

        System.out.println("Enter the numbers ");
        for (int i = 0; i < size; i++) {

            int val = sc.nextInt();
            list.insertAtEnd(val);
        }
        list.display();

        System.out.println();

        System.out.println("Enter the Element to delete in list : ");
        int num = sc.nextInt();

        list.deleteAtpos(num);

        System.out.println("After deletion :");
        list.display();

        sc.close();

    }
}
