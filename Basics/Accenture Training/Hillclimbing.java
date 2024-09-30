// import java.util.*;

// public class Hillclimbing {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.print("Enter the String:");

//     String str = sc.nextLine();
//     int result = hillClimbing(str);
//     System.out.println(result);
//   }

//   static int hillClimbing(String str) {
//     int count = 0;
//     char ch = ' ';

//     for (int i = 0; i < str.length(); i++) {

//       if (str.charAt(i) == 'U' && !str.equals(ch)) {
//         count++;
//         ch = str.charAt(i);
//       } else if (str.charAt(i) == 'D' && !str.equals(ch)) {
//         count--;
//         ch = str.charAt(i);
//       }
//     }
//     return count;
//   }
// }
import java.util.Scanner;

public class Hillclimbing {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the String: ");
    String str = sc.nextLine();

    int result = hillClimbing(str);
    System.out.println(result);
  }

  static int hillClimbing(String str) {
    int count = 0;
    char ch = ' ';

    for (int i = 0; i < str.length(); i++) {
      char current = str.charAt(i);

      if (current == 'U' && ch != 'U') {
        count++;
        ch = current;
      } else if (current == 'D' && ch != 'D') {
        count--;
        ch = current;
      }
    }
    return count;
  }
}
