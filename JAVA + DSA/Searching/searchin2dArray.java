
public class searchin2dArray {
  public static void main(String[] args) {

    int[][] arr = {
        { 23, 4, 1 },
        { 18, 12, 3, 9 },
        { 78, 99, 34, 56 },
        { 18, 12 }
    };
    // int target = 34;
    // int[] ans = search(arr, target);
    // System.out.println(Arrays.toString(ans));
    int ans2 = max(arr);
    System.out.println(ans2);
  }

  static int[] search(int[][] arr, int target) {
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) { // Corrected here
        if (arr[row][col] == target)
          return new int[] { row, col };
      }
    }
    return new int[] { -1, -1 }; // Corrected indentation
  }

  static int max(int[][] arr) {
    int max = Integer.MIN_VALUE;
    for (int[] row : arr) {
      for (int col : row) {
        if (max < col)
          max = col;
      }
    }
    return max; // Corrected indentation
  }
}
