import java.util.*;

class sumofdivisible {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter The Start Index :");
    int start = sc.nextInt();

    System.out.print("Enter The End Index :");
    int end = sc.nextInt();

    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 3 == 0 && i % 5 == 0)
        sum = sum + i;
    }
    System.out.println("The Sum of the Divisible : " + sum);
  }
}