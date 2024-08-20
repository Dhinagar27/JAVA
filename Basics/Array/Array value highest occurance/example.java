import java.util.*;

class example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String number = sc.nextLine();

    char[] arr1 = new char[9];

    int[] arr2 = new int[9];

    int count = 0;
    for (int i = 0; i < number.length(); i++) {
      char ch = number.charAt(i);
      if (ch == ' ')
        continue;
      arr1[count] = ch;
      count++;
    }

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (arr1[i] == arr1[j]) {
          arr2[i] = arr2[i] + 1;
        }
      }
    }

    for (char x : arr1) {
      System.out.printf("%c ", x);
    }
    System.out.println();

    for (int x : arr2) {
      System.out.printf("%d ", x);
    }
    System.out.println();
    int max = 0;
    int index = 0;
    for (int i = 0; i < 9; i++) {
      if (arr2[i] > max) {
        index = i;
        max = arr2[i];
      }
    }

    System.out.printf("%c", arr1[index]);

    sc.close();

  }
}