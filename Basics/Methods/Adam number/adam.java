import java.util.*;

public class adam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int num2 = square(num);

        System.out.printf("%d\n", num2); // 144

        int num3 = reverse(num2);

        System.out.printf("%d\n", num3); // 441

        int num4 = reverse(num);

        System.out.printf("%d\n", num4); // 21

        int num5 = square(num4);

        System.out.printf("%d\n", num5); // 441

        int num6 = reverse(num5);

        System.out.printf("%d\n", num6); // 144

        if (num6 == num2)
            System.out.println("Adam Number");
        else
            System.out.println("Not an Adam Number");

        sc.close();

    }

    public static int square(int num) {

        int sq = num * num;
        return sq;

    }

    public static int reverse(int num) {
        int rev = 0;
        int length = String.valueOf(num).length();

        for (int i = 0; i < length; i++) {

            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;

    }

}
