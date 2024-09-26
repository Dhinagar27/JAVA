
public class linear {
  public static void main(String[] args) {
    int[] arr = { 12, 423, 32, 5, 9 };
    int ans = linearSearch(arr, 9);
    int ans2 = linearSearch2(arr, 9);
    System.out.println(ans);
    System.out.println(ans2);

  }

  // search the target and return the elment

  static int linearSearch2(int[] arr, int target) {
    if (arr.length == 0)
      return -1;
    // run a for loop
    for (int i = 0; i < arr.length; i++) {
      // check for element at every index if it is = target
      if (target == arr[i])
        return arr[i];

    }
    // this line will execute if none of the return statmente above have executed
    // hence the target not found
    return -1;

  }

  // search in the array: return the index if item found
  // otherwize if item not found return -1
  static int linearSearch(int[] arr, int target) {
    if (arr.length == 0)
      return -1;
    // run a for loop
    for (int i = 0; i < arr.length; i++) {
      // check for element at every index if it is = target
      if (target == arr[i])
        return i;

    }
    // this line will execute if none of the return statmente above have executed
    // hence the target not found
    return -1;

  }
}