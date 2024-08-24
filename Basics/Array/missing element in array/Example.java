import java.util.*;

public class Example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The size:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter The Elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int size = arr.length;
    int exp_sum = 0;
    int sum = 0;
    for (int i = 1; i <= size; i++) {
      exp_sum = exp_sum + i;
    }
    for (int i = 0; i < size; i++) {
      sum = arr[i] + sum;
    }
    System.out.println("Missing Number is: " + (exp_sum - sum));

    sc.close();
  }
}