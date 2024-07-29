import java.util.*;

class stack {

  public static String postfixToprefix(String n) {
    Stack<String> stack = new Stack<>(); // stack to store operands

    for (int i = 0; i < n.length(); i++) //
    {
      char c = n.charAt(i); // get the character at index i

      if (Character.isLetterOrDigit(c)) // if character is operand
      {
        stack.push(c + ""); // push it to the stack
      } else // if character is operator
      {
        String op1 = stack.pop(); // pop the first operand
        String op2 = stack.pop(); // pop the second operand
        stack.push(c + op2 + op1); // push the expression to the stack
      }
    }
    return stack.pop(); // return the prefix expression

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // create a scanner object for input

    System.out.println("Enter the postfix expression: "); // prompt the user to enter the postfix expression

    String n = sc.next(); // read the postfix expression

    String result = postfixToprefix(n); // call the function to convert postfix to infix

    System.out.println("Prefix expression: " + result);
    sc.close();
  }
}
