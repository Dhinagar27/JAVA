import java.util.*;

public class Example {
  public static void main(String[] args) {
    // For loop
    // The for loop is used when we know the number of iterations in advance.
    for (int i = 1; i <= 5; i++) {
      System.out.println("Hello World");
    }
    // syntax

    /*
     * 
     * for(initialisation; condition; increment/decrement)
     * {
     * body
     * }
     * 
     */

    for (int i = 1; i <= 5; i += 1) {
      System.out.println(i);
    }

    for (int i = 1; i <= 5; i += 2) {
      System.out.println(i);
    }
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int num = 1; num <= n; num++) {
      System.out.println(num);
    }

    sc.close();
  }
}
