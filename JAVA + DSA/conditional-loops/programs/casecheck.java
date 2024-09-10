import java.util.*;

class casecheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char ch = sc.next().trim().charAt(0);

    if (ch >= 'a' && ch <= 'z') {
      System.out.println("character is lower case");
    } else if (ch >= 'A' && ch <= 'Z') {
      System.out.println("Character is Higher case");
    }
    System.out.println(ch);

    sc.close();
  }
}
