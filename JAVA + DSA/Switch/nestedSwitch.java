import java.util.*;

public class nestedSwitch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int empNo = sc.nextInt();

    String department = sc.next();
    // better way to write a switch case
    switch (empNo) {
      case 1 -> System.out.println("Dhinagar");
      case 2 -> System.out.println("Ameer");
      case 3 -> {
        switch (department) {
          case "IT" -> System.out.println("IT department:");
          case "CSE" -> System.out.println("CSE department:");
          default -> System.out.println("Nothing");
        }
      }
      default -> System.out.println("Enter valid number");
    }
    sc.close();
  }
}
