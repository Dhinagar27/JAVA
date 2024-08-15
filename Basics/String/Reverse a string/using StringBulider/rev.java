import java.util.*;

class rev {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();

    StringBuilder str2 = new StringBuilder(); // mutable objects

    str2.append(str);

    str2.reverse();

    System.out.printf("%s", str2);
    sc.close();
  }
}