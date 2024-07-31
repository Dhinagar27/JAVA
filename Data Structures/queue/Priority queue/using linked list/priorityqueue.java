
class Node {
  int data;
  int priority;
  Node next;

  Node(int d, int p) {
    this.data = d;
    this.priority = p;
    this.next = null;
  }
}

class priorityqueue {

  Node head = null;

  public void insert(int d, int p) {
    Node newNode = new Node(d, p);
    if (head == null || p < head.priority) {
      newNode.next = head;
      head = newNode;
    } else {
      Node temp = head;
      while (temp.next != null && temp.next.priority <= p) {
        temp = temp.next;
      }
      newNode.next = temp.next;
      temp.next = newNode;
    }
  }

  public void delete() {
    if (head == null) {
      System.out.println("Queue is empty");
    } else {
      System.out.println("Deleted item is: " + head.data);
      head = head.next;
    }
  }

  public void display() {
    if (head == null) {
      System.out.println("Queue is empty");
    } else {
      Node temp = head;
      while (temp != null) {
        System.out.println("Data: " + temp.data + " Priority: " + temp.priority);
        temp = temp.next;
      }
    }
  }

  public static void main(String[] args) {
    priorityqueue pq = new priorityqueue();

    System.out.println("Priority Queue using Linked List");
    pq.insert(10, 1);
    pq.insert(20, 2);
    pq.insert(30, 3);
    pq.insert(40, 2);
    pq.insert(50, 1);

    System.out.println("Priority Queue:");
    pq.display();

    System.out.println("After deleting an element:");
    pq.delete();
    pq.display();
  }

}
