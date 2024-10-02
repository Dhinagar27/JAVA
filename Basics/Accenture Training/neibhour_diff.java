import java.util.*;

public class neibhour_diff {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter the elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int result = neighbourDiff(arr);
    System.out.println(result);

  }

  static int neighbourDiff(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {

      if (i == arr.length - 1)
        sum = sum + Math.abs(arr[i] - arr[0]);
      else
        sum = sum + Math.abs(arr[i] - arr[i + 1]);
    }
    return sum;
  }
}
