import java.util.*;

public class diffwitharray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int dif = sc.nextInt();
    int[] arr = { 12, 3, 56, 77, 14, 13 };

    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (Math.abs(arr[i] - num) >= dif)
        count++;
    }
    System.out.print(count);
  }
}
