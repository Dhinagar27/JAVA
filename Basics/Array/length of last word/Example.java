import java.util.*;

public class Example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String line = sc.nextLine();

    String[] str = line.split(" ");

    int length = 0;

    for (int i = 0; i < str.length; i++) {

      if (i == str.length - 1) {
        System.out.println(length = str[i].length());
      }
    }
  }
}