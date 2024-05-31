interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void display() {
        System.out.println("B");
    }
}

class C implements A, B {
    void print() {
        System.out.println("C");
    }
}

public class example {
    public static void main(String[] args) {
        C sc = new C();
        sc.show();
        sc.display();
        sc.print();
    }

}
