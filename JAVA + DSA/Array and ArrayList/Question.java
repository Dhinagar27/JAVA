import java.util.Arrays;

public class Question {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 23, 9, 18 };
    swap(arr, 1, 2);
    System.out.println(Arrays.toString(arr));

    System.out.println(max(arr));
    System.out.println(maxrange(arr, 1, 3));
    reverse(arr);
    System.out.println(Arrays.toString(arr));

  }

  static void reverse(int[] arr) {

    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      // swap
      swap(arr, start, end);
      start++;
      end--;
    }

  }

  static void swap(int[] arr, int index1, int index2) {

    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;

  }

  // imagine that arr is not empty
  static int max(int[] arr) {

    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  static int maxrange(int[] arr, int start, int end) {

    int max = arr[0];
    for (int i = start; i <= end; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

}
