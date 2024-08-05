import java.util.*;

class sort {

  public static void selectionSort(int[] arr, int n) {
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of the array");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements of the array");

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    selectionSort(arr, n);

    System.out.println("The sorted array is: ");

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }

    sc.close();

  }

}
