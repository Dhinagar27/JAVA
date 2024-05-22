import java.util.*;

public class forloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();

        String numStr = Long.toString(num); // Convert to string
        int len = numStr.length();
        long last_digit;
        long sum = 0;

        for (long i = 0; i < len; i++) {
            last_digit = num % 10;
            sum = sum * 10 + last_digit;
            num = num / 10;
        }
        System.out.println(sum);
        scanner.close();
    }

}
