import java.util.*;

class stack {
  public static void main(String[] args) {

    Stack<Character> stack = new Stack<>();

    // Push characters onto the stack
    stack.push('A');
    stack.push('B');
    stack.push('C');

    // Pop a character from the stack
    char top = stack.pop(); // 'C'

    // Peek at the top character without removing it
    char topPeek = stack.peek(); // 'B'

    // Check if the stack is empty
    boolean isEmpty = stack.isEmpty(); // false

    // Check the size of the stack
    int size = stack.size(); // 2

    System.out.println("Top element is: " + top);

    System.out.println("Top element is: " + topPeek);

    System.out.println("Stack is empty: " + isEmpty);

    System.out.println("Size of stack is: " + size);

  }

}
