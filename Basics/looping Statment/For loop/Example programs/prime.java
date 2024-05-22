import java.util.*;

public class prime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long num = sc.nextLong();
            long i;
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i * i > num) {
                System.out.print("prime");
            } else {
                System.out.print("prime");
            }
            sc.close();
        }

    }
}
