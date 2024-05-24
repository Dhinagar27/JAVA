import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(sum(num, num2));

    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
