import java.util.*;

class reverse {
  public static void main(String[] args) {
    {
      Scanner sc = new Scanner(System.in);

      String str = sc.nextLine();

      String empty = "";

      StringBuilder string = new StringBuilder();

      int count = 0;

      for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if (ch == 'i') {
          break;
        }
        string.append(ch);
        count++;
      }

      empty = string.reverse() + str.substring(count + 1);
      System.out.println(empty);

      sc.close();
    }
  }
}