import java.util.*;

class InsertAtFirst {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Size of Array:");

    int size = sc.nextInt();

    ArrayList<Integer> list = new ArrayList<>();

    System.out.println("Enter the Array Elements:");

    for (int i = 0; i < size; i++) {
      int num = sc.nextInt();
      list.add(num);
    }

    System.out.println("The Array is: " + list);

    System.out.println("Enter the Element to be Inserted at First:");

    int num = sc.nextInt();

    list.add(0, num);

    System.out.println("The Array After Inserting at First: " + list);

    sc.close();

  }
}
