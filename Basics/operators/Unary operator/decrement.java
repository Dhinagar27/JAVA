public class decrement {
    public static void main(String[] args) {

        int a = 5, b = 10;

        b = --a; // pre decrement a and b is 4 , 4
        System.out.printf("%d %d\n", b, a);

        // now 'a' will be " 4 " after the decrement

        b = a--; // post decrement a and b is 4 , 3
        System.out.printf("%d %d\n", b, a);

    }

}
