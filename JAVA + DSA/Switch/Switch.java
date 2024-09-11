import java.util.*;

public class Switch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String fruit = sc.next();

    // Syntax for switch case

    /*
     * switch(expression) {
     * case value1:
     * // code block
     * break;
     * case value2:
     * // code block
     * break;
     * default:
     * // code block
     */

    // note:

    /*
     * cases have to be the ame type as expression must be a constant or literal
     * duplicate case values are not allowed
     * break statement is used to exit the switch block
     * if break is not used it will continue to next case
     * default will execute when more of the above does
     * if defult is not at the end put break after it
     * 
     */

    switch (fruit) {
      // by using this format we dont need any break for terminate
      case "mango" -> System.out.println("king of fruit");
      case "Apple" ->
      // by using {} we can write multiple lines of code
      {
        System.out.println("A Sweet red fruit");
      }
      case "orange" -> System.out.println("Round fruit");
      default -> System.out.println("Enter the valid fruit");
    }

    int num = sc.nextInt();
    switch (num) {
      case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
      case 6, 7 -> System.out.println("WeekEnd");
    }

  }
}
