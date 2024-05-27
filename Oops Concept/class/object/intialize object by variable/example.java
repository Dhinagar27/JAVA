import java.util.*;

class student {
    String name;
    int roll;
}

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        student s1 = new student();

        s1.name = sc.nextLine();
        s1.roll = sc.nextInt();
        // Consume the newline character

        System.out.println(s1.name);
        System.out.println(s1.roll);

        sc.close();
    }
}
