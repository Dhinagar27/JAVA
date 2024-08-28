import java.util.*;

public class Example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();

    int length = str.length();

    int i;
    for (i = length - 1; i > 0; i--) {
      if (str.charAt(i) != '0')
        break;
    }

    System.out.printf("%s", str.substring(0, i + 1));

    sc.close();
  }
}