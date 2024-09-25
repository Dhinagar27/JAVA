import java.util.Arrays;
import java.util.Scanner;

public class Multidimension {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /*
     * 1 2 3
     * 4 5 6
     * 7 8 9
     * 
     * image this as a array of array itself
     */

    int[][] arr = new int[3][3]; // No of rows is important

    int[][] arr2 = { // here each row represent the array so it can be in any length
        { 1, 2, 3 }, // 0 index
        { 4, 5 }, // 1st index
        { 6, 7, 8, 9 }, // 2nd index
    };

    // input
    int[][] nums = new int[3][3];
    System.out.println(nums.length); // no of rows is the answer

    for (int row = 0; row < nums.length; row++) {
      // for each col in ever row
      for (int col = 0; col < nums[row].length; col++) {
        nums[row][col] = sc.nextInt();
      }
    }

    // output
    for (int row = 0; row < nums.length; row++) {
      // for each col in ever row
      for (int col = 0; col < nums[row].length; col++) {
        System.out.println(nums[row][col]);
      }
      System.out.println();
    }

    // output 2
    for (int row = 0; row < nums.length; row++) {
      System.out.println(Arrays.toString(nums[row]));
    }

    // output 3
    for (int[] a : nums) {
      System.out.println(Arrays.toString(a));
    }
  }
}
