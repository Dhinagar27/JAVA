import java.util.*;

class stringtowords {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();

    String[] words = str.split(" ");

    StringBuilder phonenumber = new StringBuilder();

    for (int i = 0; i < words.length; i++) {

      if (words[i].equals("double")) {
        int digit = convert(words[++i]);
        phonenumber.append(digit).append(digit);
      } else if (words[i].equals("triple")) {
        int digit = convert(words[++i]);
        phonenumber.append(digit).append(digit).append(digit);
      } else {
        int digit = convert(words[i]);
        phonenumber.append(digit);
      }
    }

    System.out.println(phonenumber);
    sc.close();
  }

  public static int convert(String num) {
    switch (num.toLowerCase()) {
      case "zero":
        return 0;
      case "one":
        return 1;
      case "two":
        return 2;
      case "three":
        return 3;
      case "four":
        return 4;
      case "five":
        return 5;
      case "six":
        return 6;
      case "seven":
        return 7;
      case "eight":
        return 8;
      case "nine":
        return 9;
      default:
        return -1;

    }
  }
}