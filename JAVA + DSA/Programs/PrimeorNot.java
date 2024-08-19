import java.util.*;

class PrimeorNot {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();

    // to find the prime number we should leave the "1 " and number itself

    int c = 2;
    int count = 0;
    while (c * c < number) {
      if (number % c == 0) {
        System.out.println("Not Prime");
        count = count + 1;
        break;
      }
      c = c + 1;
    }
    if (count == 0) {
      System.out.println("Prime");
    }
  }

}