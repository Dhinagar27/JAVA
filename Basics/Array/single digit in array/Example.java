
class Example {
  public static void main(String[] args) {

    int[] arr = { 2, 2, 1 };

    int[] arr2 = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          arr2[i]++;
        }
      }
    }
    int index = 0;
    int min = arr2[0];
    for (int i = 0; i < arr2.length; i++) {

      if (arr2[i] < min) {
        index = i;
        min = arr2[i];
      }
    }
    System.out.println(index);

    // Method 2

    int result = 0;
    for (int i = 0; i < arr.length; i++) {
      result ^= arr[i];
    }
    System.out.println(result);

  }

}