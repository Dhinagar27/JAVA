import java.util.*;

public class strg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int length = String.valueOf(n).length();
        int last_digit = 0;
        int temp = n;
        for (int i = 0; i < length; i++) {

            last_digit = temp % 10;
            sum = fac(last_digit) + sum;
            temp = temp / 10;
        }
        System.out.println(sum);
        if (sum == n) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a Strong number");
        }

        sc.close();

    }

    public static int fac(int n) {

        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }

}
