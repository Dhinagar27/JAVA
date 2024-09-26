
public class SearchInString {
  public static void main(String[] args) {
    String name = "Dhinagar";
    char target = 'u';
    boolean ans = search(name, target);
    System.out.println(ans);
    boolean ans2 = search2(name, target);
    System.out.println(ans2);
  }

  static boolean search(String str, char target) {
    if (str.length() == 0)
      return false;

    for (int i = 0; i < str.length(); i++) {
      if (target == str.charAt(i))
        return true;
    }
    return false;

  }

  static boolean search2(String str, char target) {
    if (str.length() == 0)
      return false;

    for (char ch : str.toCharArray()) {
      {
        if (target == ch)
          return true;
      }
      return false;
    }
    return false;

  }
}
