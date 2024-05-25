import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.printf("%s", str);

        char[] str1 = { 'a', 'b', 'c', 'd', 'e' };
        String str2 = new String(str1);

        System.out.printf("\n%s", str2);

        sc.close();
    }

}
