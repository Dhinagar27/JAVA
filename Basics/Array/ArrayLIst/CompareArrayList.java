import java.util.*;

class CompareArrayList {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    System.out.println("Enter the Size of the list :");
    int size = sc.nextInt();

    System.out.println("Enter the ArrayList 1 Element:");

    for (int i = 0; i < size; i++) {
      int num = sc.nextInt();
      list1.add(num);
    }

    System.out.println("Enter the ArrayList 2 Element:");

    for (int i = 0; i < size; i++) {
      int num = sc.nextInt();
      list2.add(num);
    }

    if (list1.equals(list2)) {
      System.out.println("Both Array Are Same");
    } else {
      System.out.println("Both Array are Different");
    }

    sc.close();

  }
}
