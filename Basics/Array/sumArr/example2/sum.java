import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        for (int i = 0; i < n; i++) {

            a[i] = sum - arr[i];

        }
        for (int i = 0; i < n; i++) {

            System.out.printf("%d ", a[i]);

        }
        System.out.printf("\n");

        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] - arr[i];
        }
        for (int i = 0; i < n; i++)
            System.out.printf("%d ", a[i]);

        sc.close();

    }
}