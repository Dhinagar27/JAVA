import java.util.*;

class example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        if (time < 20) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        sc.close();
    }
}