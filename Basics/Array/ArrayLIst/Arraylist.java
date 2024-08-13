import java.util.*;

class Arraylist {

  public static void main(String[] args) {

    ArrayList<String> colors = new ArrayList<>();

    System.out.println("Enter The size of the Arraylist: ");

    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();

    System.out.println("Enter The Colors: ");

    for (int i = 0; i < size; i++) {
      String color = sc.next();
      colors.add(color);
    }

    System.out.printf("colors: %s\n", colors);

    sc.close();

  }
}