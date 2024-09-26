
public class searchInRange {
  public static void main(String[] args) {
    int[] arr = { 18, 12, -7, 3, 14, 28 };
    int target = 3;
    System.out.println(linearSearch(arr, target, 1, 4));
  }

  static boolean linearSearch(int[] arr, int target, int start, int end) {
    if (arr.length == 0)
      return false;

    for (int i = start; i <= end; i++) {

      if (target == arr[i])
        return true;

    }

    return false;

  }

}
