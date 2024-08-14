import java.util.*;

class stack {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Stack<Integer> stack = new Stack<>();

    while (true) {

      int num = sc.nextInt();
      if (num == -1)
        break;

      switch (num) {

        case 1:
          int add = sc.nextInt();
          stack.push(add);
          break;
        case 2:
          stack.pop();
          break;
        case 3:
          System.out.println(stack);
          break;
        case 4:
          System.out.println(stack.peek());
          break;
        case 5:
          System.out.println(stack.empty());
      }

    }
    sc.close();

  }
}