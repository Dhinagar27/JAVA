import java.util.*;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int first = 0;
        int last = n - 1;

        for (int i = 0; i < n; i++) {
            int mid = (first + last) / 2;
            if (arr[mid] == key) {
                System.out.printf("Found");
                break;
            } else if (arr[mid] < key) {
                first = mid + 1;
            } else {
                last = mid - 1;

            }
        }
        if (first > last) {
            System.out.printf("Not found");
        }
        sc.close();
    }
}
