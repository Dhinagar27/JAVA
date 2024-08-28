import java.util.*;

public class Example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first string");
    String str1 = sc.nextLine();

    System.out.println("Enter the second string");
    String str2 = sc.nextLine();

    if (str1.length() != str2.length()) {
      System.out.println("The strings are not anagrams");
      return;
    }

    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    if (Arrays.equals(arr1, arr2)) {
      System.out.println("The strings are anagrams");
    } else {
      System.out.println("The strings are not anagrams");
    }

    // second menthod

    String s = "anagram", t = "nagaram";

    if (s.length() != t.length()) {
      System.out.println("The strings are not anagrams");
      return;
    }

    int[] count = new int[26];

    for (int i = 0; i < s.length(); i++) {
      count[s.charAt(i) - 'a'] += 1;
    }

    for (int i = 0; i < t.length(); i++) {
      if (count[t.charAt(i) - 'a'] == 0) {
        System.out.println("The strings are not anagrams");
        return;
      }
      count[t.charAt(i) - 'a'] -= 1;
    }

    System.out.println("The strings are anagrams");
    sc.close();
  }

}
