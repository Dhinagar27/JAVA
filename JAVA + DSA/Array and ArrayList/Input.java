import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // array of primitives
    int[] arr = new int[5];

    arr[0] = 23;
    arr[1] = 45;
    arr[2] = 43;
    arr[3] = 41;
    arr[4] = 47;
    // [23,45,43,41,47]
    System.out.println(arr[3]);

    // input using for loops
    for (int i = 0; i < 5; i++) {
      arr[i] = sc.nextInt();
    }

    /*
     * 
     * there are three ways to print the array elements
     * 1. using loops
     * 2. for each
     * 3. Arrays.toString(array_name) method
     * 
     */

    for (int i = 0; i < 5; i++) {
      System.out.println(arr[i] + " ");
    }

    for (int num : arr) // for every element in array, print the element
    {
      System.out.println(num); // here num represents element of the array
    }

    // System.out.println(arr[5]); // index out of bound

    System.out.println(Arrays.toString(arr));

    // array of objects
    String[] str = new String[4];

    for (int i = 0; i < str.length; i++) {
      str[i] = sc.next();
    }

    System.out.println(Arrays.toString(str));

    // modification

    str[1] = "Dhinagar";
    System.out.println(Arrays.toString(str));

  }
}
