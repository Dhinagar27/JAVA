import java.util.*;

public class anagram {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter The First String: ");
    String str1 = sc.nextLine();

    System.out.print("Enter The Second String: ");
    String str2 = sc.nextLine();

    boolean result = isAnagram(str1, str2);
    System.out.println(result);

  }

  static boolean isAnagram(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1, arr2);
  }
}
