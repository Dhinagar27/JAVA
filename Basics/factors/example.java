import java.util.*;

class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        for (long i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.printf("(%d * %d)\n", i, num / i);
            }

        }
        sc.close();

    }

}
