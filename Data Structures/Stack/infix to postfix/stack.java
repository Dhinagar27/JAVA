import java.util.*;

class stack {

  public static int precedence(char operator) { // precedence of operators

    switch (operator) { // switch case to check precedence of operators

      case '+':
      case '-':
        return 1;
      case '*':
      case '/':
        return 2;
      case '^':
        return 3;

    }
    return -1; // if operator is not present
  }

  public static boolean check(char op1, char op2) { // check precedence of operators

    return precedence(op1) >= precedence(op2);

  }

  public static String infixToPostfix(String n) { // infix to postfix conversion

    StringBuilder postfix = new StringBuilder(); // to store postfix expression

    Stack<Character> stack = new Stack<>(); // stack to store operators

    for (int i = 0; i < n.length(); i++) { // iterate through the infix expression

      char c = n.charAt(i); // get the character at index i

      if (Character.isLetterOrDigit(c)) { // if character is operand

        postfix.append(c); // append it to the postfix expression

      } else if (c == '(') { // if character is opening bracket

        stack.push(c); // push it to the stack

      } else if (c == ')') { // if character is closing bracket

        while (!stack.empty() && stack.peek() != '(') { // pop all the operators from stack till opening bracket is
                                                        // found
          postfix.append(stack.pop()); // append the operator to the postfix expression

        }
        stack.pop(); // pop the opening bracket

      } else // if character is operator
      {
        while (!stack.isEmpty() && check(stack.peek(), c) && stack.peek() != '(') { // check precedence of operators

          postfix.append(stack.pop()); // append the operator to the postfix expression
        }
        stack.push(c); // push the operator to the stack
      }
    }
    while (!stack.isEmpty()) { // pop all the operators from stack
      postfix.append(stack.pop());
    }
    return postfix.toString(); // return the postfix expression
  }

  public static void main(String[] args) { // main method
    Scanner sc = new Scanner(System.in); // create scanner object

    String n = sc.nextLine(); // input infix expression

    String result = infixToPostfix(n); // call infixToPostfix method
    System.out.printf("%s", result); // print the result

    sc.close();
  }
}
