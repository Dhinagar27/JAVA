import java.util.Scanner;

public class numbertoString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();

    String str = "";

    for (int i = 0; i < input.length(); i++) {
      char num = input.charAt(i);

      int number = num - '0';

      if (number >= 1 && number <= 26) {
        char letter = (char) (number + 96);
        str += letter;
      } else {
        System.out.println(num);
        return;
      }
    }

    System.out.println(str);
    sc.close();
  }
}
