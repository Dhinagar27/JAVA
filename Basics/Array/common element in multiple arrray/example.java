import java.util.*;

class example {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();
    int size2 = sc.nextInt();
    int size3 = sc.nextInt();

    int[] arr = new int[size];
    int[] arr2 = new int[size2];
    int[] arr3 = new int[size3];

    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < size2; i++) {
      arr2[i] = sc.nextInt();
    }

    for (int i = 0; i < size3; i++) {
      arr3[i] = sc.nextInt();
    }

    int[] count = new int[10];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        if (arr[i] == arr2[j]) {
          count[i]++;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr3.length; j++) {
        if (arr[i] == arr3[j]) {
          count[i]++;
        }
      }
    }

    for (int i = 0; i < count.length; i++) {
      System.out.printf(count[i] + " ");
    }

    int max = 0;

    for (int i = 0; i < count.length; i++) {
      if (count[i] > max) {
        max = count[i];
      }
    }
    System.out.println();
    for (int i = 0; i < count.length; i++) {
      if (count[i] == max) {
        System.out.printf(arr[i] + " ");
      }
    }

    sc.close();

  }
}
