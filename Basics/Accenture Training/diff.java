import java.util.*;

class diff {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter The Array Size: ");
    int n = sc.nextInt();

    System.out.println("Enter the Modulus Value: ");
    int mod = sc.nextInt();

    int sum = 0;
    int sum2 = 0;

    for (int i = 0; i < n; i++) {
      System.out.print("Enter the Element: ");
      int num = sc.nextInt();

      if (num % mod == 0)
        sum += num;
      else
        sum2 += num;
    }

    System.out.println("Sum of Numbers Divisible by " + mod + " : " + sum);
  }
}
