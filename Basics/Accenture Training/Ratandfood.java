import java.util.*;

public class Ratandfood {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int rat = sc.nextInt();
    int food = sc.nextInt();
    int size = sc.nextInt();

    int[] home = new int[size];

    for (int i = 0; i < size; i++) {
      home[i] = sc.nextInt();
    }
    int total_food = rat * food;

    int count = 0;

    for (int i = 0; i < size; i++) {
      int temp = home[i];
      if (temp <= total_food) {
        count++;
        total_food = total_food - temp;
      } else if (temp > total_food && total_food != 0) {
        count++;
        break;
      }

    }

    System.out.print(count);
  }
}
