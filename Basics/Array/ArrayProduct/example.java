import java.util.*;

class example {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();

    int[] arr1 = new int[size];

    int[] arr2 = new int[size];

    for (int i = 0; i < size; i++) {
      arr1[i] = sc.nextInt();
    }

    int count = 0;
    int sum = 1;
    int temp = size;
    while (temp != 0) {
      for (int i = 0; i < size; i++) {
        if (i == count)
          continue;
        sum = sum * arr1[i];
      }
      arr2[count] = sum;
      count = count + 1;
      sum = 1;
      temp = temp - 1;

    }

    for (int x : arr2) {
      System.out.printf("%d ", x);
    }
    sc.close();
  }
}