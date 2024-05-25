import java.util.*;

public class amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int length = String.valueOf(n).length();
        int last_digit = 0;
        int temp = n;
        for (int i = 0; i < length; i++) {

            last_digit = temp % 10;
            sum = (int) (Math.pow(last_digit, length) + sum);
            temp = temp / 10;

        }
        System.out.println(sum);
        if (sum == n) {
            System.out.println("Amstrong number");
        } else {
            System.out.println("Not an Amstrong number");
        }
        sc.close();

    }

}
