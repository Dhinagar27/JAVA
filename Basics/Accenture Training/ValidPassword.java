import java.util.Scanner;

public class ValidPassword {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter The String: ");
    String str = sc.nextLine();

    int result = check(str);
    System.out.println(result);
  }

  static int check(String str) {
    String large = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String small = "abcdefghijklmnopqrstuvwxyz";
    String number = "1234567890";

    // Check if the first character is a digit
    if (Character.isDigit(str.charAt(0)))
      return 0;

    // Check if the length is less than 4
    if (str.length() < 4)
      return 0;

    boolean hasCapital = false;
    boolean hasSmall = false;
    boolean hasNumber = false;

    // Loop through the string and check the conditions
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (large.indexOf(ch) >= 0) { // Check if it's a capital letter
        hasCapital = true;
      } else if (small.indexOf(ch) >= 0) { // Check if it's a small letter
        hasSmall = true;
      } else if (number.indexOf(ch) >= 0) { // Check if it's a number
        hasNumber = true;
      }
    }

    // If it has both capital and number, return 1, otherwise 0
    if (hasCapital && hasSmall && hasNumber)
      return 1;
    else
      return 0;
  }
}
