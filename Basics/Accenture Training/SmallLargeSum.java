import java.util.*;

public class SmallLargeSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Array Size : ");
    int n = sc.nextInt();

    System.out.println("Enter The Array Elements : ");
    Integer[] arr = new Integer[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr, Collections.reverseOrder());

    int sum = arr[2] + arr[3];
    System.out.println(sum);

  }

}
