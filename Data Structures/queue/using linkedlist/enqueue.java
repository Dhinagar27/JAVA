// Status: Accepted

class node

{
    int data;
    node next;

    node(int d) {
        data = d;
        next = null;
    }
}

class queue {
    node front = null;
    node rear = null;

    void enqueue(int x) {
        node temp = new node(x);
        if (front == null) {
            front = temp;
            rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        front = front.next;
        if (front == null)
            rear = null;
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        queue q = new queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }

}