import java.util.*;

public class example {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int pass;
            int temp;
            // bublle sort
            for (pass = 0; pass < n - 2; pass++) {
                for (int i = 0; i < n - 1 - pass; i++) {
                    if (arr[i] > arr[i + 1]) {
                        temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.printf("%d ", arr[i]);
            }

            sc.close();
        }
    }

}
