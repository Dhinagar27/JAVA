import java.util.*;

class example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    int sum = 1;

    for (int i = 1; i <= num; i++) {
      sum = sum * i;
    }
    System.out.println(sum);
    System.out.println(count(sum));

    sc.close();
  }

  public static int count(int num) {
    int count = 0;
    int last = 0;
    int temp = num;
    int length = String.valueOf(num).length();

    for (int i = 0; i < length; i++) {
      last = temp % 10;
      if (last == 0) {
        count++;
      }
      if (last != 0) {
        break;
      }
      temp = temp / 10;

    }

    return count;
  }
}
