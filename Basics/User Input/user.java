import java.util.*;

public class user {
    public static void main(String[] args) {

        // Double
        Scanner obj = new Scanner(System.in);
        double num = obj.nextDouble();
        System.out.printf("%.4f\n", num);
        obj.close();

        // Character
        Scanner obj2 = new Scanner(System.in);
        char a = obj2.next().charAt(0);
        System.out.printf("%c", a);
        obj2.close();

    }

}
