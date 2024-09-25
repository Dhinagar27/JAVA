import java.util.*;

public class ColnoFixed {
  public static void main(String[] args) {
    int[][] arr2 = { // here each row represent the array so it can be in any length
        { 1, 2, 3 }, // 0 index
        { 4, 5 }, // 1st index
        { 6, 7, 8, 9 }, // 2nd index
    };

    for (int row = 0; row < arr2.length; row++) {
      for (int col = 0; col < arr2[row].length; col++) {
        System.out.println(arr2[row][col] + " ");
      }
      System.out.println();
    }
  }
}
