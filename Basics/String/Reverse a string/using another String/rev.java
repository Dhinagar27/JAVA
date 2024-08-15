import java.util.*;

class rev {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine(), str2 = "";

    System.out.println(str);

    char ch;

    for (int i = 0; i < str.length(); i++) {
      ch = str.charAt(i);

      str2 = ch + str2;
    }
    System.out.println(str2);
    sc.close();
  }
}