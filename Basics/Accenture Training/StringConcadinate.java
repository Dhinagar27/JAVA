import java.util.*;

public class StringConcadinate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String given = sc.nextLine();
    int size = 3;
    String str = "";

    for (int i = 0; i < size; i++) {
      str = str + given;
    }
    System.out.println(str);
  }
}
