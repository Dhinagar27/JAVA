import java.util.*;

class sort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of elements in the array :");

    int n = sc.nextInt();

    int a[] = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    System.out.println("Array before sorting : ");

    for (int i = 0; i < n; i++) {
      System.out.printf("%d ", a[i]);

    }

    System.out.println();
    System.out.println("Array after sorting : ");

    // Insertion sort

    for (int i = 1; i < n; i++) {
      int key = a[i];
      int j = i - 1;

      while (j >= 0 && a[j] > key) {
        a[j + 1] = a[j];
        j = j - 1;
      }

      a[j + 1] = key;
    }

    for (int i = 0; i < n; i++) {
      System.out.printf("%d ", a[i]);
    }

    sc.close();
  }
}