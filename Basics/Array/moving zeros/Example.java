import java.util.*;

public class Example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Array Size: ");
    int size = sc.nextInt();

    int[] arr = new int[size];

    System.out.println("Enter the Array Elements:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    int placeindex = 0;

    for (int i = 0; i < size; i++) {
      if (arr[i] != 0) {
        arr[placeindex] = arr[i];
        placeindex++;
      }
    }

    while (placeindex < size) {
      arr[placeindex] = 0;
      placeindex++;
    }

    for (int x : arr) {
      System.out.println(x);
    }
  }
}
