import java.util.*;

class example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int row = sc.nextInt();
    int column = sc.nextInt();

    int[][] arr = new int[row][column];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < row; i++) {
      int max = 0;
      for (int j = 0; j < column; j++) {

        if (arr[i][j] > max)
          max = arr[i][j];
      }
      System.out.println(max);

    }
    sc.close();
  }
}