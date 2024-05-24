import java.util.*;

public class example {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int key = sc.nextInt();
            int i;
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (i = 0; i < n; i++) {
                if (arr[i] == key) {
                    break;
                }
            }
            if (i < n)
                System.out.printf("Found");
            else
                System.out.printf("Not found");
            sc.close();
        }
    }

}
