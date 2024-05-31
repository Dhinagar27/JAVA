class parent {

    static int a = 10;

    static void print() {
        System.out.println("parent class");

    }
}

class child extends parent {

    void print2() {
        System.out.println("child class");
    }
}

public class example {
    public static void main(String[] args) {

        System.out.println(parent.a);
        parent.print();
        child.a = 20;
        System.out.println(parent.a);
        child sc = new child();
        sc.print2();

    }

}
