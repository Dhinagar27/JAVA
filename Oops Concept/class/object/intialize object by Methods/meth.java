import java.util.*;

class student {
    String name;
    int roll;

    void store(String n, int r) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println(name);
        System.out.println(roll);
    }
}

public class meth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        student s1 = new student();

        s1.store(sc.nextLine(), sc.nextInt());
        // Consume the newline character

        s1.display();

        sc.close();
    }
}
