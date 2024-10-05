import java.util.*;

class SearchInMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // int[][] arr = {
    // { 1, 2, 3, 4 },
    // { 5, 6, 7 },
    // { 8, 9, 11, 10, 12 }
    // };

    System.out.print("Enter The Size of Array : ");
    int n = sc.nextInt();

    System.out.print("Enter The array Element : ");
    int[][] arr = new int[n][n];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    System.out.print("Enter The Target : ");
    int target = sc.nextInt();

    int[] result = Search(arr, target);
    System.out.print("Element Found In : " + Arrays.toString(result) + "Index");
  }

  static int[] Search(int[][] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (target == arr[i][j]) {
          return new int[] { i, j };
        }
      }
    }
    return new int[] { -1, -1 };
  }
}
