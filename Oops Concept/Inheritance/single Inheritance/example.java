
class A {
    void displays() {
        System.out.printf("This is class A\n");
    }
}

class B extends A {
    void display() {
        System.out.printf("This is class B\n");
    }
}

class example {
    public static void main(String[] args) {
        B sc = new B();
        sc.display();
        sc.displays();
    }
}