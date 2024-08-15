import java.util.*;

class create {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // method 1
    String str = sc.nextLine(); // getting input from user

    System.out.println(str);

    // method 2
    char[] ch = { 'D', 'h', 'i', 'n', 'a', 'g', 'a', 'r' };

    String str2 = new String(ch); // creating string from the char array

    System.out.println(str2);

    sc.close();

    // method 3
    String str3 = "Dhinagar"; // creating default string

    System.out.println(str3);

    // method 4

    String str4 = new String("Dhinagar"); // creating string using new keyword

    System.out.println(str4);

    // method 5

    String str5 = "Dhinagar"; // creating string using string literal

    System.out.println("My name :" + str5);
  }

}