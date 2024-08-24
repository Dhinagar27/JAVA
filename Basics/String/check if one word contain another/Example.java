import java.util.*;

public class Example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String jewels = sc.nextLine();
    String stones = sc.nextLine();

    int count = 0;
    for (char j : jewels.toCharArray()) {
      for (char s : stones.toCharArray()) {
        if (j == s) {
          count++;
        }
      }
    }
    System.out.println(count);

    sc.close();
  }
}