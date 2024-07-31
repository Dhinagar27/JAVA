// Queues using linked list
class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class Queue {

  Node head = null;

  void enqueue(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }

  void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  void dequeue() {
    if (head == null) {
      System.out.println("Queue is empty");
    } else {
      head = head.next;
    }
  }

  public static void main(String[] args) {
    Queue l = new Queue();
    l.enqueue(10);
    l.enqueue(20);
    l.enqueue(30);
    l.enqueue(40);
    l.display();
    l.dequeue();
    System.out.println();
    l.display();
  }

}