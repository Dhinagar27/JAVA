import java.util.*;

class example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        if (var >= 60)
            System.out.printf("Pass");
        else {
            System.out.printf("Fail");
        }
        sc.close();
    }
}