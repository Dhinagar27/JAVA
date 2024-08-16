import java.util.*;

class example {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of array: ");

    int size = sc.nextInt();

    System.out.println("The Target Sum: ");

    int target = sc.nextInt();

    int[] arr = new int[size];

    System.out.println("Enter the elements of array: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        if (arr[i] + arr[j] == target) {
          list.add(i);
          list.add(j);
        }
      }
    }

    System.out.println("The Indexes are: " + list);

    sc.close();
  }
}