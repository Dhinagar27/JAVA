import java.util.*;

public class Example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    int result = 0;
    int last = 0;

    while (num / 10 != 0) {

      result = 0;
      while (num != 0) {
        last = num % 10;
        result = last + result;
        num = num / 10;
      }

      num = result;
    }
    System.out.println(num);

    sc.close();
  }
}