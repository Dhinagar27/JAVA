public class Bitwise {
    public static void main(String[] args) {

        int a = 12, b = 24;

        System.out.println(a & b); // bitwise AND

        System.out.println(a | b); // bitwise OR

        System.out.println(a ^ b); // bitwise XOR

        System.out.println(~a); // bitwise NOT

        System.out.println(a << 2); // bitwise left shift

        System.out.println(a >> 1); // bitwise right shift

        System.out.println(Integer.toBinaryString(a)); // used to print the binary representation

    }
}
