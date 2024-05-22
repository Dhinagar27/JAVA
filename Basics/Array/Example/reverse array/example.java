import java.util.*;

public class example {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int last;
            int start;
            for (start = 0, last = n - 1; start < last; start++, last--) {
                int temp = arr[start];
                arr[start] = arr[last];
                arr[last] = temp;
            }
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            sc.close();
        }
    }

}
