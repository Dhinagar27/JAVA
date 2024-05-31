class a {
    void display() {
        System.out.printf("This is parent class\n");
    }
}

class b extends a {
    void show() {
        System.out.printf("This is child class\n");
    }
}

class c extends a {
    void print() {
        System.out.printf("This is grandchild class\n");
    }
}

public class example {
    public static void main(String[] args) {
        c sc = new c();
        sc.display();
        sc.print();

        b ob = new b();
        ob.display();
        ob.show();
    }

}
