import java.util.*;

class rectangle {
    int length;
    int breadth;

    void store(int l, int b) {
        length = l;
        breadth = b;
    }

    void display() {
        System.out.println(length * breadth);
    }
}

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        rectangle s1 = new rectangle();

        s1.store(sc.nextInt(), sc.nextInt());

        s1.display();

        sc.close();
    }
}
