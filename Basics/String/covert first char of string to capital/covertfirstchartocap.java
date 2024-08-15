import java.util.*;

class covertfirstchartocap {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();

    String result = "";

    String[] arr = str.split(" ");

    for (String word : arr) {
      if (word.length() > 0) {
        result = result + Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
      }
    }

    System.out.printf("%s ", result);
  }
}