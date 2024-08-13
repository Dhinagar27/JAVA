import java.util.ArrayList;
import java.util.Scanner;

class RevArraylist {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<>();
    System.out.println("Enter The Size Of The Arraylist: ");
    int size = sc.nextInt();

    System.out.println("Enter The Number: ");
    for (int i = 0; i < size; i++) {
      int num = sc.nextInt();
      arr.add(num);
    }

    System.out.println("The Arraylist Is: " + arr);

    ArrayList<Integer> revArr = new ArrayList<>();

    for (int i = arr.size() - 1; i >= 0; i--) {
      revArr.add(arr.get(i));
    }

    System.out.println("The Reversed Arraylist Is: " + revArr);

    sc.close();
  }

}
