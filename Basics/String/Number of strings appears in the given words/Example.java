import java.util.*;

public class Example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] arr = { "a", "ab", "abc", "d" };

    String word = "abc";

    int count = 0;
    for (String ch : arr) {
      if (word.contains(ch)) {
        count++;
      }
    }

    System.out.println(count);
    sc.close();
  }
}