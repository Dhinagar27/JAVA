public class increment {
    public static void main(String[] args) {

        int a = 5, b = 10;

        b = ++a; // pre increment a and b is 6 , 6
        System.out.printf("%d %d\n", b, a);

        // now 'a' will be " 6 " after the increment

        b = a++; // post increment a and b is 6 , 7
        System.out.printf("%d %d\n", b, a);

    }
}