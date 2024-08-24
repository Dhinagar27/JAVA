import java.util.*;

class example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();

    if (rev(number))
      System.out.println("Palindrome");
    else
      System.out.println("Not a Palindrome");

    sc.close();
  }

  public static boolean rev(int num) {
    String str = String.valueOf(num);

    int size = str.length();

    for (int i = 0; i < size; i++) {
      if (str.charAt(i) != str.charAt(size - i - 1))
        return false;
    }
    return true;
  }
}