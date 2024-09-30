import java.util.*;

public class sockpair {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] socks = new int[101];
    for (int i = 0; i < n; i++) {
      int sock = sc.nextInt();
      socks[sock]++;
    }
    int pairs = 0;
    for (int i = 0; i < 101; i++) {
      pairs += socks[i] / 2;
    }
    System.out.println(pairs);
  }
}
