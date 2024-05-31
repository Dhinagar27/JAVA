class grandfather {

    void print1() {
        System.out.printf("I am GrandFather\n");
    }

}

class father extends grandfather {
    void print2() {
        System.out.printf("I am Father\n");
    }
}

class son extends father {
    void print3() {
        System.out.printf("I am Son\n");
    }
}

class grandson extends son {
    void print4() {
        System.out.printf("I am GrandSon\n");
    }
}

class granddaugther extends son {
    void print5() {
        System.out.printf("I am GrandDaughter\n");
    }
}

class example {
    public static void main(String[] args) {
        grandson g = new grandson();
        g.print4();
        g.print3();
        g.print2();
        g.print1();
        granddaugther gd = new granddaugther();
        gd.print5();
    }
}
