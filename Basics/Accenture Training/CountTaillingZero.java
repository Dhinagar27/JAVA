import java.util.*;

public class CountTaillingZero {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter The Number: ");
    int num = sc.nextInt();

    int result = count(fact(num));
    System.out.println(result);

  }

  static int fact(int num) {
    if (num == 0) {
      return 1;
    }
    return num * fact(num - 1);
  }

  static int count(int num) {
    int count = 0;
    while (num % 10 == 0) {
      count++;
      num = num / 10;
    }
    return count;
  }
}
