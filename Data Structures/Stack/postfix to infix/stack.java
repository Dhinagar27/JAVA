import java.util.*;

class stack {

  public static String postfixToinfix(String n) {
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
        stack.push("(" + op2 + c + op1 + ")"); // push the expression to the stack
      }
    }
    return stack.pop(); // return the infix expression

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the postfix expression: ");
    String n = sc.next();
    String result = postfixToinfix(n);
    System.out.println("Infix expression: " + result);
    sc.close();
  }
}
