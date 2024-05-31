class parent {

    final int a = 10;

    final void print() {
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

        child obj = new child();
        obj.print();
        // obj.a = 100;
        obj.print2();

    }

}