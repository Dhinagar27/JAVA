import java.util.*;

public class Isogram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter The String: ");
    String str = sc.nextLine();

    boolean res = check(str);
    boolean re = check2(str);

    System.out.println(res);
    System.out.println(re);
  }

  static boolean check(String str) {
    ArrayList<Character> list = new ArrayList<>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (list.contains(ch))
        return false;

      list.add(ch);
    }

    return true;
  }

  static boolean check2(String str) {
    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    for (int x : map.values()) {
      if (x > 1)
        return false;
    }

    return true;
  }
}
