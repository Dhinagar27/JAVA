import java.util.*;

public class digitoccuronlyonce {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter The Start Index: ");
    int start = sc.nextInt();

    System.out.print("Enter The End Index:   ");
    int end = sc.nextInt();

    int count = 0;
    for (int i = start; i <= end; i++) {

      if (check(i))
        count++;
    }

    System.out.println("Total Count : "count);
  }

  static boolean check(int num) {
    ArrayList<Integer> list = new ArrayList<>();
    int length = String.valueOf(num).length();
    while (num > 0) {

      int last = num % 10;

      if (!list.contains(last))
        list.add(last);

      num = num / 10;
    }

    return length == list.size();
  }
}
